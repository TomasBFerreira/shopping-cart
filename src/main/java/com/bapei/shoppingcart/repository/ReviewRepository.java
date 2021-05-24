package com.bapei.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bapei.shoppingcart.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
