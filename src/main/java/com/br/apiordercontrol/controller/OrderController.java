package com.br.apiordercontrol.controller;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import com.br.apiordercontrol.service.CreateOrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController()
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    CreateOrderService service;


    @PostMapping
    public ResponseEntity<Void> post(@RequestBody @Valid final OrderRequestDTO dto)
            throws URISyntaxException
    {
        final var orderId = service.start(dto);
        return ResponseEntity.created(new URI("/v1/order/" + orderId)).build();
    }
}
