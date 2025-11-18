package com.ununtu.demo.exercises;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 3: JPA Relationships - Avoiding N+1 Problem
 * ═══════════════════════════════════════════════════════════════════════════════
 *
 * TODO: Join the class Product with Category with annotations @ManyToOne(fetch = FetchType.LAZY) and @JoinColumn(name = "***") and add @Query annotation with JPQL to obtain every product of every category
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
