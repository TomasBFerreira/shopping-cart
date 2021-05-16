package com.bapei.shoppingcart.repository;

import com.bapei.shoppingcart.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}