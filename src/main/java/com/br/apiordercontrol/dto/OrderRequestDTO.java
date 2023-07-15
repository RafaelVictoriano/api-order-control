package com.br.apiordercontrol.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequestDTO {

    @NotNull
    @Min(1)
    private Long clientId;

    @Valid
    @NotNull
    @JsonProperty("products")
    private List<@Valid ProdutoPedidoDTO> produtoPedido;
}
