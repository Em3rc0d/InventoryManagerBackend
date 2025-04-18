package com.InventoryManager.services.business;

import com.InventoryManager.daos.business.ISaleDao;
import com.InventoryManager.models.business.Product;
import com.InventoryManager.models.business.Sale;
import com.InventoryManager.models.business.SaleDetail;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService {
    @Autowired
    private ISaleDao saleDao;

    @Autowired
    private IProductService productService;

    @Override
    public List<Sale> getAllSales() {
        return saleDao.getAllSales();
    }

    @Override
    @Transactional
    public Sale save(Sale sale) {
        double totalVenta = 0;

        for (SaleDetail detail : sale.getSaleDetails()) {
            int quantity = detail.getQuantity();
            Product product = productService.findById(detail.getProduct().getId());

            if (quantity <= 0) {
                throw new IllegalArgumentException("La cantidad debe ser mayor a 0 para el producto: " + product.getName());
            }

            if (product.getStock() < quantity) {
                throw new IllegalArgumentException("Stock insuficiente para el producto: " + product.getName());
            }

            double subtotal = product.getPrice() * quantity;

            if (detail.getDiscount() > 0) {
                subtotal -= subtotal * (detail.getDiscount() / 100);
            }

            detail.setTotalAmount(subtotal);

            totalVenta += subtotal;

            product.setStock(product.getStock() - quantity);
            productService.save(product);
        }

        sale.setTotal(totalVenta);

        Sale savedSale = saleDao.save(sale);

        return savedSale;
    }


    @Override
    public Sale getSaleById(Long id) {
        return saleDao.getSaleById(id);
    }
}
