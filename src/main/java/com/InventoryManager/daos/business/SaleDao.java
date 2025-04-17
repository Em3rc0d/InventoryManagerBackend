package com.InventoryManager.daos.business;

import com.InventoryManager.models.business.Sale;
import com.InventoryManager.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDao implements ISaleDao {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale save(Sale sale){
        return saleRepository.save(sale);
    }
}
