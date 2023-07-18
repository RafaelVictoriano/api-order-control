package com.br.apiordercontrol.controller;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import com.br.apiordercontrol.dto.OrderResponseDTO;
import com.br.apiordercontrol.service.CreateOrderService;
import com.br.apiordercontrol.service.FindOrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController()
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    CreateOrderService createOrderService;

    @Autowired
    FindOrderService findOrderService;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody @Valid final OrderRequestDTO dto)
            throws URISyntaxException {
        final var orderId = createOrderService.start(dto);
        return ResponseEntity.created(new URI("/v1/order/" + orderId)).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> get(@PathVariable("id") final String orderId) {
        return ResponseEntity.ok(findOrderService.byId(orderId));
    }
}
