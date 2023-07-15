package com.br.apiordercontrol.service;

import com.br.apiordercontrol.dto.OrderResponseDTO;

public interface FindOrderService {

    OrderResponseDTO byId(final String id);

}
