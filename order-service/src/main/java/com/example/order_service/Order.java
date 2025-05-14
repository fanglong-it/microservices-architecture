package com.example.order_service;

public class Order {
    private Long userId;
    private Long productId;
    // Constructor, getters/setters
    public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long userId, Long productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
    
	
}
