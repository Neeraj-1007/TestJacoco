package com.test.springBootrabbitmq.dto;

public class OrderStatus {

	private Order order;

	private String status;

	private String message;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMesssage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OrderStatus [order=" + order + ", status=" + status + ", message = " + message + "]";
	}

	public OrderStatus() {
	}

	public OrderStatus(Order order, String status, String message) {
		// TODO Auto-generated constructor stub
		this.order = order;
		this.status = status;
		this.message = message;
	}

}
