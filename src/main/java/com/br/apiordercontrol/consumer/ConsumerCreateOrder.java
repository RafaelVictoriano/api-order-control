package com.br.apiordercontrol.consumer;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import com.br.apiordercontrol.service.CreateOrderService;
import com.br.apiordercontrol.util.JsonUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ConsumerCreateOrder {

    @Autowired
    CreateOrderService createOrderService;


    @KafkaListener(topics = "create-order", groupId = "create-order")
    public void listener(String message) {
        log.info("Receveid message, message:{}", message);
        process(message);
        log.info("Processed message, message:{}", message);
    }

    private void process(final String message) {
        final var orderRequestDTO = JsonUtil.toObject(message, OrderRequestDTO.class);
        createOrderService.start(orderRequestDTO);
    }

}
