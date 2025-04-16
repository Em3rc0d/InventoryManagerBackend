package com.InventoryManager.models.business;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;
    private Integer stock;
    private Category category;
    private Provider provider;
}
