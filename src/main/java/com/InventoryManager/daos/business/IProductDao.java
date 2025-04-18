package com.InventoryManager.daos.business;

import com.InventoryManager.models.business.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductDao {

    Product finById(Long id);

    void save(Product product);
}
