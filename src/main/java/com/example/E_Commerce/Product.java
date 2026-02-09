package com.example.E_Commerce;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String category;
    private double price;
    private boolean inStock;

    // getters and setters
}

