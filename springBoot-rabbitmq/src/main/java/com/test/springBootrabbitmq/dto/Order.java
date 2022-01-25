package com.test.springBootrabbitmq.dto;

public class Order {

	
	
	private String orderId;
	
	private String name;
	
	private String qty;
	
	private double price;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order() {
		
	}

	public Order(String orderId, String name, String qty, double price) {
		this.orderId = orderId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}
