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
    private String id;
    private String number;
    private Sale sale;
    private Client client;
    private String RUC;
    private STATE state;
    private Date date;

}
