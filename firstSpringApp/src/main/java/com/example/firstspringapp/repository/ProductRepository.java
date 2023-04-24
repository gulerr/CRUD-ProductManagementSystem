package com.example.firstspringapp.repository;

import com.example.firstspringapp.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //interface-in bean-ni yaradir
public interface ProductRepository extends JpaRepository<Product,Integer> {
Product findById(int id);
}
