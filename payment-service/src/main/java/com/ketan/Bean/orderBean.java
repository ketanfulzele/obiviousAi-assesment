package com.ketan.Bean;

import java.util.List;

public class orderBean {

	List<ProductList> productList;

	public orderBean(List<ProductList> productList) {
		super();
		this.productList = productList;
	}

	public List<ProductList> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductList> productList) {
		this.productList = productList;
	}
	
	
}
