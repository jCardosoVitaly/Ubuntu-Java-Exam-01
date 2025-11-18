package com.ununtu.demo.exercises;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 4
 * ═══════════════════════════════════════════════════════════════════════════════
 * 
 * TASK: Find products with price above a value using Native SQL
 * 
 * TODO 1: Replace the comment with the query in order to obtain a price higher than the input parameter (Native SQL query)
 * TODO 2: Add parameter Double minPrice with the proper annotation
 * 
 * ═══════════════════════════════════════════════════════════════════════════════
 */
public class Exercise4 {

    @Entity
    @Table(name = "products")
    public static class Product {
        @Id
        private Long id;
        private String name;
        private Double price;

        public Long getId() { return id; }
        public String getName() { return name; }
        public Double getPrice() { return price; }
    }

    @Repository
    public interface ProductRepository extends JpaRepository<Product, Long> {

        // TODO: Replace the comment with the query in order to obrain a price higher than the imput parameter
        @Query(value = "/*TODO Create query to obtain a price higher than the imput parameter*/", nativeQuery = true)
        // TODO: Add parameter Double minPrice with the proper annotation
        List<Product> findExpensiveProducts(/*TODO Add parameter min price*/);
    }
}
