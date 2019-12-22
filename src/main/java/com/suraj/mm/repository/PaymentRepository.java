package com.suraj.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suraj.mm.model.Payment;

/**
 * @author Dilip Kirar
 * @version 1.0 Repository for managing all Payment related DB Query
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
