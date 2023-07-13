package com.br.apiordercontrol.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class OrderModel {

    @Id
    private Long id;

//    @Collation(name = "cliente_id")
    private Long clientId;

  //  @Column(name = "quantidade")
    private Integer quantity;

  //  @Column(name = "status")
    private String status;

  //  @Column(name = "telefone")
    private Long phone;

    //@Column(name = "email")
    private String email;
}
