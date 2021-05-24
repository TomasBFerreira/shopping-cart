package com.bapei.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bapei.shoppingcart.entity.ResponseEntity;
import com.bapei.shoppingcart.entity.Product;
import com.bapei.shoppingcart.entity.Review;
import com.bapei.shoppingcart.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	
	@PostMapping("/save/{productId}/review/{userId}")
	public ResponseEntity<Review> saveReview(@RequestBody Review review, @PathVariable("productId") int productId,
			@PathVariable("userId") int userId) {
		return productService.saveReview(productId, userId, review);
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/get")
	public Product get() {
		return new Product();
	}
}
	