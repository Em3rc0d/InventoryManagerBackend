package com.InventoryManager.controllers.business;

import com.InventoryManager.models.business.Sale;
import com.InventoryManager.services.business.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/sale")
public class SaleController {

    @Autowired
    private ISaleService saleService;

    @GetMapping("/all")
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @PostMapping
    public Sale saveSale(@RequestBody Sale sale){
        return saleService.save(sale);
    }
}
