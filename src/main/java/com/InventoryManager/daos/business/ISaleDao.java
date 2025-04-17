package com.InventoryManager.daos.business;

import com.InventoryManager.models.business.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISaleDao {
    List<Sale> getAllSales();

    Sale save(Sale sale);
}
