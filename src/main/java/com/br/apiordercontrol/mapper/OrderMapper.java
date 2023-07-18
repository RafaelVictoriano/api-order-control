package com.br.apiordercontrol.mapper;

import com.br.apiordercontrol.dto.OrderRequestDTO;
import com.br.apiordercontrol.dto.OrderResponseDTO;
import com.br.apiordercontrol.model.OrderModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderModel toModel(OrderRequestDTO orderDTO);

    OrderResponseDTO toDTO(OrderModel orderModel);
}
