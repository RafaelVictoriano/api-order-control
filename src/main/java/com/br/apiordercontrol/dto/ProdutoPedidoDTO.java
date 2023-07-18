package com.br.apiordercontrol.dto;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProdutoPedidoDTO {

    @Min(1)
    private Long productId;
    @Min(1)
    private Integer quantity;
}
