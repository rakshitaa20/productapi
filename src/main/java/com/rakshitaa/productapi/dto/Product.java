package com.rakshitaa.productapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Product {

	private Long id;
	
	@NotBlank(message="Product name is required")
	private String name;
	
	@Positive(message="Price must be greater than zero")
	private double price;
	private String description;
	
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public double getPrice() {
			return price;
		}
	
		public void setPrice(double price) {
			this.price = price;
		}
	
		public String getDescription() {
			return description;
		}
	
		public void setDescription(String description) {
			this.description = description;
		}
		
	
}
