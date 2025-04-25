package com.weshopify.platform.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weshopify.platform.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{	
	
}
