package com.ketan.fulzele.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.fulzele.Entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

	public ProductEntity findByProductId(Integer productId);
}
