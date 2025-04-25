package com.ketan.models;

import java.io.Serializable;

import com.ketan.handler.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrdersEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderId;
	int AmountToPay;
	String orderStatus;

	public OrdersEntity(int orderId, int amountToPay, String orderStatus) {
		super();
		this.orderId = orderId;
		AmountToPay = amountToPay;
		this.orderStatus = OrderStatus.SUCCESSFULL.toString();
		
		
	}

	public OrdersEntity() {
		super();
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
