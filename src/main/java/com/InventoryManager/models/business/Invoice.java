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
public class Invoice {
    @Id
    private int id;
    private String number;
    private Date date;
    private String saleId;
    private Double total;
    private String client;
    private String direction;
    private String RUC;
    private String phone;
    private STATE state;
    private Product[] products;

}
