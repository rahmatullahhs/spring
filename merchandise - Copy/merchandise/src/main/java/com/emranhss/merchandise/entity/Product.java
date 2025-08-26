package com.emranhss.merchandise.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Table(name = "products")
@Entity
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Category category;

        @Column(nullable = false)
        private String brand;

        private String model;

        private String details;

        @Column(nullable = false)
        private int stock;

        @Column(nullable = false)
        private double price;

        // Getters and Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    // Enum for category
        public enum Category {
            Laptop,
            Accessory,

        }
    }



