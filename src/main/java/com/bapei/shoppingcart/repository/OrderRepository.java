package com.bapei.shoppingcart.repository;

import com.bapei.shoppingcart.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}