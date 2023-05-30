package com.example.orders.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int balance;


    public Item(String name, double price, int balance) {
        this.name = name;
        this.price = price;
        this.balance = balance;
    }
}
