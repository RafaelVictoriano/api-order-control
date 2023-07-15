package com.br.apiordercontrol.service.impl;

import com.br.apiordercontrol.dto.OrderResponseDTO;
import com.br.apiordercontrol.exceptions.BusinessException;
import com.br.apiordercontrol.mapper.OrderMapper;
import com.br.apiordercontrol.repository.OrderModelRepository;
import com.br.apiordercontrol.service.FindOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FindOrderServiceImpl implements FindOrderService {


    @Autowired
    private OrderMapper mapper;

    @Autowired
    private OrderModelRepository repository;

    @Override
    public OrderResponseDTO byId(String id) {
        final var orderModel = repository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, "Order not found"));
        return mapper.toDTO(orderModel);
    }

}
