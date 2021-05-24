package com.bapei.shoppingcart.service;

import com.bapei.shoppingcart.dao.ProductDAO;
import com.bapei.shoppingcart.entity.Product;
import com.bapei.shoppingcart.entity.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.bapei.shoppingcart.entity.ResponseEntity;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO productDAO;
	
	public Product saveProduct(Product product) {
		return productDAO.saveProduct(product);
	}
	
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
	
	public ResponseEntity<Review> saveReview(int productId,int userId,Review review) {
		return productDAO.saveReview(productId, userId, review);
	}
}
