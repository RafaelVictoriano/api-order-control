package com.br.apiordercontrol.dto;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ProdutoPedidoDTO {

    @Min(1)
    private Long productId;
    @Min(1)
    private Integer quantity;
}
