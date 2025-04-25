package com.ketan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.models.OrdersEntity;

public interface OrderRepo extends JpaRepository<OrdersEntity, Integer> {

}
