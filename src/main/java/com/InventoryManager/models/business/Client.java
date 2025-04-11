package com.InventoryManager.models.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Client {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
