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
public class Sale {
    @Id
    private int id;

    private Client client;

    private Date date;

    private STATE state;

    private Double total;

}
