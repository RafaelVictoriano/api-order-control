package com.br.apiordercontrol.service.impl;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import com.br.apiordercontrol.mapper.OrderMapper;
import com.br.apiordercontrol.repository.OrderModelRepository;
import com.br.apiordercontrol.service.CreateOrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CreateOrderServiceImpl implements CreateOrderService {

    @Autowired
    private OrderModelRepository repository;

    @Autowired
    private OrderMapper mapper;

    @Override
    public Long start(OrderRequestDTO dto) {
        log.info("Saving order, order:{}", dto);
        final var order = mapper.toModel(dto);
        repository.save(order);
        log.info("Saved order: {}", order);
        return order.getId();
    }
}
