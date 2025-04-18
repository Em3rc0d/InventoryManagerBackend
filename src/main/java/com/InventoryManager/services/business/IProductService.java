package com.InventoryManager.services.business;

import com.InventoryManager.models.business.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    Product findById(Long id);

    void save(Product product);
}
