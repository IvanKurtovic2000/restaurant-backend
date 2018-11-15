package com.pwc.restaurant.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.restaurant.Restaurant.entities.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
