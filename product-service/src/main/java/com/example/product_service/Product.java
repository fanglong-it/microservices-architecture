package com.example.product_service;

public class Product {
    private Long id;
    private String name;
    private int stock;

    // Constructor, getters/setters
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String name, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
    
}
