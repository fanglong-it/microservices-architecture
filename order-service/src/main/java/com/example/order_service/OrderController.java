package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public Order createOrder(@RequestParam Long userId, @RequestParam Long productId) {
        User user = restTemplate.getForObject("http://user-service/users/" + userId, User.class);
        Product product = restTemplate.getForObject("http://product-service/products/" + productId, Product.class);

        if (product.getStock() <= 0) {
            throw new RuntimeException("Product out of stock");
        }

        return new Order(userId, productId);
    }
    
    @GetMapping("/test-user")
    public String testUserConnection() {
        // Gọi USER-SERVICE thông qua Eureka
        String response = restTemplate.getForObject("http://user-service/users/ping", String.class);
        return "User Service Response: " + response;
    }
    
    @GetMapping("/test-product")
    public String testProductConnection() {
    	String response = restTemplate.getForObject("http://product-service/products/test", String.class);
    	return "Product Service Response: " + response;
    }
    
}
