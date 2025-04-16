package com.InventoryManager.models.business;

import org.springframework.data.annotation.Id;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Category {
    @Id
    private String id;

    private String name;

    private String description;
}
