package com.example.orders.Service;

import com.example.orders.Model.Purchases;
import com.example.orders.Repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasesService {

    @Autowired
    PurchaseRepo purchaseRepo;

    public List<Purchases> getAllPurchases() {
        return (List<Purchases>) purchaseRepo.findAll();
    }

    public Purchases getPurchasesById(Long id) {
        return purchaseRepo.findById(id).get();
    }
}
