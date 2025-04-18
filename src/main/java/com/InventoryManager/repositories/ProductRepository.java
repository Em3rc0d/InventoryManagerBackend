package com.InventoryManager.repositories;

import com.InventoryManager.models.business.Product;
import com.InventoryManager.models.business.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

