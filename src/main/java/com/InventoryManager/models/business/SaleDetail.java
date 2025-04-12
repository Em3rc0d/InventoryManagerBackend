package com.InventoryManager.models.business;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.InventoryManager.models.utils.STATE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class SaleDetail {
    private Sale sale;

    private Product product;

    private double unitaryPrice; //Precio al momento de la compra
    
    private Integer quantity;

    private double totalAmount;
}
