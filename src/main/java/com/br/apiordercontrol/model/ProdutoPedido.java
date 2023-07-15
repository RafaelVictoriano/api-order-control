package com.br.apiordercontrol.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter @Setter
public class ProdutoPedido {

    @Field("produto_id")
    private Long productId;
    @Field("quantidade")
    private Integer quantity;
}
