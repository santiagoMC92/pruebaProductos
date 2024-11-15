package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class product {

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255,nullable = false)
    private String name;

    @Column(length = 500,nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(length = 10, nullable = false)
    private String sku;
}
