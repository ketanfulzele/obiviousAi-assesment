package com.ketan.Bean;

import java.math.BigDecimal;

public class PaymentRequestBean {

	
	int orderId;
	BigDecimal AmountToPay;
	int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public PaymentRequestBean(int orderId, BigDecimal amountToPay , int customerId) {
		super();
		this.orderId = orderId;
		AmountToPay = amountToPay;
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getAmountToPay() {
		return AmountToPay;
	}

	public void setAmountToPay(BigDecimal amountToPay) {
		AmountToPay = amountToPay;
	}

}
