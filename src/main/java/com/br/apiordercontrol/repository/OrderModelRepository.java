package com.br.apiordercontrol.repository;

import com.br.apiordercontrol.model.OrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderModelRepository extends MongoRepository<OrderModel, Long> {
}