package com.example.orders;

import com.example.orders.Model.Purchases;
import com.example.orders.Repository.PurchaseRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }

    @Bean
    public CommandLineRunner pojo(PurchaseRepo purchaseRepo) {
        return args -> {

            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(4)).toString())
                            .customerId(1L)
                            .Item(List.of(10L, 12L, 4L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(14)).toString())
                            .customerId(1L)
                            .Item(List.of(11L, 12L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(2)).toString())
                            .customerId(2L)
                            .Item(List.of(1L, 12L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(43)).toString())
                            .customerId(3L)
                            .Item(List.of(1L, 12L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(2)).toString())
                            .customerId(4L)
                            .Item(List.of(1L, 2L, 4L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(4)).toString())
                            .customerId(5L)
                            .Item(List.of(1L, 2L, 4L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(14)).toString())
                            .customerId(6L)
                            .Item(List.of(1L, 2L, 4L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(24)).toString())
                            .customerId(6L)
                            .Item(List.of(1L, 2L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(14)).toString())
                            .customerId(7L)
                            .Item(List.of(1L, 14L, 6L))
                            .build()
            );
            purchaseRepo.save(
                    Purchases.builder()
                            .date(Date.valueOf(LocalDate.now().minusMonths(42)).toString())
                            .customerId(8L)
                            .Item(List.of(1L, 12L, 4L, 6L))
                            .build()
            );
        };


    }



       /*@Bean
        RestTemplate restTemplate () {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate;
        }*/

    }

