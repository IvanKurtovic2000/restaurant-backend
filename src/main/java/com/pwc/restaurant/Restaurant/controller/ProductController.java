package com.pwc.restaurant.Restaurant.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pwc.restaurant.Restaurant.entities.Product;
import com.pwc.restaurant.Restaurant.repository.ProductRepository;



@RestController
public class ProductController {
		
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/product")
	private List<Product> findAll() {
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product findProduct(@PathVariable Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
		product.setId(id);
        return  productRepository.save(product);
    }
	
	 @DeleteMapping("/product/{id}")
	 public void deleteProduct(@PathVariable(name="id")Long id) {
	 productRepository.deleteById(id);
	 System.out.println("Product Deleted Successfully");
	 }
	 
	 

}
