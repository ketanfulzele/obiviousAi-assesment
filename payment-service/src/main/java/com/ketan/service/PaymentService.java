package com.ketan.service;

import com.ketan.Bean.PaymentBean;
import com.ketan.Bean.PaymentRequestBean;

public interface PaymentService {

	PaymentBean getPayment(int transactionId);

	String makePayment( PaymentRequestBean paymentRequestBean);
}
