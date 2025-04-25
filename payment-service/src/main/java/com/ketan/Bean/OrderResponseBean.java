package com.ketan.Bean;

public class OrderResponseBean {

	int orderId;
	int AmountToPay;
	String orderStatus;
	
	public OrderResponseBean() {
		
	}
	
	
	public OrderResponseBean(int orderId, int amountToPay, String orderStatus) {
		super();
		this.orderId = orderId;
		AmountToPay = amountToPay;
		this.orderStatus = orderStatus;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getAmountToPay() {
		return AmountToPay;
	}


	public void setAmountToPay(int amountToPay) {
		AmountToPay = amountToPay;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
