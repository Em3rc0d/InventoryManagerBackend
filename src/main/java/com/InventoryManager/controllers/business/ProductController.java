package com.InventoryManager.controllers.business;

import com.InventoryManager.models.business.Product;
import com.InventoryManager.services.business.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping
    public void save(Product product) {
        productService.save(product);
    }

}
