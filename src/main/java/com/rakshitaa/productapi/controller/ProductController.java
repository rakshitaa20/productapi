package com.rakshitaa.productapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakshitaa.productapi.dto.Product;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
  private static List<Product> productList=new ArrayList<>();
  private static Long nextId = 1L;

  
  //add new product
  @PostMapping
  public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product){
	  product.setId(nextId);
	  nextId++;
	  productList.add(product);
	  return ResponseEntity.status(201).body(product);

	 
  }
 
	//Get product by ID
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id) {
	   for (Product p : productList) {
	       if (p.getId().equals(id)) {
	           return ResponseEntity.ok(p);
	       }
	   }
	   return ResponseEntity.notFound().build();
	}

}
