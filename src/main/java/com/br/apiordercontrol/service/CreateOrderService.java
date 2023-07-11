package com.br.apiordercontrol.service;

import com.br.apiordercontrol.dto.OrderRequestDTO;

public interface CreateOrderService {

    Long start(OrderRequestDTO dto);

}
