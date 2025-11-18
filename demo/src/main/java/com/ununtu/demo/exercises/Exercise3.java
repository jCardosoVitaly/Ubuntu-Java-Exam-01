package com.ununtu.demo.exercises;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 3
 * ═══════════════════════════════════════════════════════════════════════════════
 *
 * TASK: Join the class Product with Category and add @Query annotation with JPQL to obtain every product of every category
 *
 * TODO 1: Add fetch = FetchType.LAZY and @JoinColumn(name = "name of the bonding column") to the @ManyToOne in Product class
 * TODO 2: Add @Query annotation with JPQL: "SELECT c FROM Category c LEFT JOIN FETCH c.products" to findAllWithProducts() method
 * 
 * ═══════════════════════════════════════════════════════════════════════════════
 */
public class Exercise3 {

    @Entity
    @Table(name = "categories")
    public static class Category {
        @Id
        private Long id;
        private String name;
        
        @OneToMany(mappedBy = "category")
        private List<Product> products;

        public Long getId() { return id; }
        public String getName() { return name; }
        public List<Product> getProducts() { return products; }
    }

    @Entity
    @Table(name = "products")
    public static class Product {
        @Id
        private Long id;
        private String name;
        
        // TODO: Add fetch = FetchType.LAZY and @JoinColumn(name = "name of the bonding column")
        @ManyToOne
        private Category category;

        public Long getId() { return id; }
        public String getName() { return name; }
    }

    @Repository
    public interface CategoryRepository extends JpaRepository<Category, Long> {
        
        // TODO: Add @Query with
        List<Category> findAllWithProducts();
    }
}
