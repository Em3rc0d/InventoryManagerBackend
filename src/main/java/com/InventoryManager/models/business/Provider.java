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
public class Provider {
    @Id
    private String id;

    private String direction;

    private String phone;

    private String email;
}
