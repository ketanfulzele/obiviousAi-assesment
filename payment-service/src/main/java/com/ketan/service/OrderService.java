package com.ketan.service;

import com.ketan.Bean.OrderResponseBean;
import com.ketan.Bean.orderBean;

public interface OrderService {

	OrderResponseBean placeOrder(orderBean productBean);
}
