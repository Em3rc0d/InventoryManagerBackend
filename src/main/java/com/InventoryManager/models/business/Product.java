package com.InventoryManager.models.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    private int id;
    private String name;
    private Double price;
    private Integer stock;
    private Category category;
    private Provider provider;
}
