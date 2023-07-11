package com.br.apiordercontrol.repository;

import com.br.apiordercontrol.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderModelRepository extends JpaRepository<OrderModel, Long> {
}