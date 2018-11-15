package com.pwc.restaurant.Restaurant.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.restaurant.Restaurant.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
