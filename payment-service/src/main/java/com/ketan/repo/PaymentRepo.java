package com.ketan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ketan.models.PaymentEntity;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity, Integer>{

}
