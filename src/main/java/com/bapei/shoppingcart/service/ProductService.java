package com.bapei.shoppingcart.service;

import com.bapei.shoppingcart.entity.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
}