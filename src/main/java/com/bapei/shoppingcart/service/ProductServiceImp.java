package com.bapei.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bapei.shoppingcart.entity.Product;
import com.bapei.shoppingcart.exception.ResourceNotFoundException;
import com.bapei.shoppingcart.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImp implements ProductService {
	
	private ProductRepository productRepository;

	public ProductServiceImp(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	@Override
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(long id) {
		return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}
}