package com.InventoryManager.daos.business;

import com.InventoryManager.models.business.Product;
import com.InventoryManager.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao implements IProductDao {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product finById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
