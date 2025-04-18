package com.InventoryManager.services.business;

import com.InventoryManager.daos.business.IProductDao;
import com.InventoryManager.models.business.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public Product findById(Long id) {
        return productDao.finById(id);
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
