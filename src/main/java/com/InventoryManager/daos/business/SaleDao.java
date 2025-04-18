package com.InventoryManager.daos.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InventoryManager.models.business.Sale;
import com.InventoryManager.repositories.SaleRepository;

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

    @Override
    public Sale getSaleById(Long id){
        return saleRepository.findById(id).orElseThrow();
    }
    
}
