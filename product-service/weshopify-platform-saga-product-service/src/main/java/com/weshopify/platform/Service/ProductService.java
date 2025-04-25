package com.weshopify.platform.Service;

import java.util.List;

import com.weshopify.platform.Bean.ProductBean;

public interface ProductService {

	List<ProductBean> listAllProducts();
	ProductBean createProduct(ProductBean productBean);
	List<ProductBean> deleteProducts(List<Integer> list);
	void deleteAProduct(int productId);
	ProductBean reserveProduct(int id, int qauntity);
}
