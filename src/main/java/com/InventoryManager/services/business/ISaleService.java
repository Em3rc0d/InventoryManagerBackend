package com.InventoryManager.services.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.InventoryManager.models.business.Sale;

@Service
public interface ISaleService {

    List<Sale> getAllSales();

    Sale save(Sale sale);

    Sale getSaleById(Long id);
}
