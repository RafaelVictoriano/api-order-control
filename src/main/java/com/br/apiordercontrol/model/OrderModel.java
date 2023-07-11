package com.br.apiordercontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id")
    private Long clientId;

    @Column(name = "quantidade")
    private Integer quantity;

    @Column(name = "status")
    private String status;

    @Column(name = "telefone")
    private Long phone;

    @Column(name = "email")
    private String email;
}
