package com.InventoryManager.services.business;

import com.InventoryManager.models.business.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISaleService {

    List<Sale> getAllSales();

    Sale save(Sale sale);
}
