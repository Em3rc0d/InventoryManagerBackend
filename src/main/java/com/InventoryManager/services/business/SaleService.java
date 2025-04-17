package com.InventoryManager.services.business;

import com.InventoryManager.daos.business.ISaleDao;
import com.InventoryManager.models.business.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService {
    @Autowired
    private ISaleDao saleDao;

    @Override
    public List<Sale> getAllSales() {
        return saleDao.getAllSales();
    }

    @Override
    public Sale save(Sale sale){
        return saleDao.save(sale);
    }
}
