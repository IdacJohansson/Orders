package com.example.orders.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Purchases {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;
    private Long customerId;

    public Purchases(String date, Long customerId) {
        this.date = date;
        this.customerId = customerId;
    }

    @ElementCollection
    private List<Long> Item;
}
