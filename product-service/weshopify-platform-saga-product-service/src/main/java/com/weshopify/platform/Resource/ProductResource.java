package com.weshopify.platform.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weshopify.platform.Bean.ProductBean;
import com.weshopify.platform.Service.ProductServiceImpl;

@RestController
public class ProductResource {

	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping("/products")
	public ResponseEntity<List<ProductBean>> getAllProducts() {
		return ResponseEntity.ok(productServiceImpl.listAllProducts());
	}

	@PostMapping("/products")
	public ResponseEntity<ProductBean> createProduct(@RequestBody ProductBean productBean) {

		return ResponseEntity.ok(productServiceImpl.createProduct(productBean));
	}

	@DeleteMapping("/products")
	public ResponseEntity<List<ProductBean>> deleteProducts(@RequestBody List<Integer> productsId) {
		List<ProductBean> list = productServiceImpl.deleteProducts(productsId);
		return ResponseEntity.ok(list);
	}

	@PostMapping("/products/{productId}/{qauntity}")
	public ResponseEntity<ProductBean> reserveProduct(@PathVariable("productId") int id , @PathVariable int qauntity ) {

		return ResponseEntity.ok(productServiceImpl.reserveProduct(id , qauntity));
	}
}
