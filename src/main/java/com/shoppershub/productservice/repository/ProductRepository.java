package com.shoppershub.productservice.repository;

import com.shoppershub.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Long >{


    @Query(value = "SELECT * FROM project.product WHERE product_id = :productId;" ,nativeQuery = true)
    Product getProductById(Long productId);
}
