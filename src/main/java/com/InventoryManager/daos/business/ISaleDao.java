package com.InventoryManager.daos.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.InventoryManager.models.business.Sale;

@Service
public interface ISaleDao {
    List<Sale> getAllSales();

    Sale save(Sale sale);

    Sale getSaleById(Long id);
}
