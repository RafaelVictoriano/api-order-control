package com.br.apiordercontrol.model;


import com.br.apiordercontrol.enumeration.OrderStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document(collection = "order")
public class OrderModel {

    @Id
    private String id;

    @Field(name = "cliente_id")
    private Long clientId;

    @Field(name = "produto")
    private List<ProdutoPedido> produtoPedido;

    @Field(name = "status")
    private List<OrderStatusEnum> status = new ArrayList<>();

    public void addStatus(OrderStatusEnum orderStatus) {
        status.add(orderStatus);
    }

}
