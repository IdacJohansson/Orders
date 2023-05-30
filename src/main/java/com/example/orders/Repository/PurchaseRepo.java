package com.example.orders.Repository;

import com.example.orders.Model.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepo extends CrudRepository<Purchases, Long> {

    List<Purchases> findAllBy();
    List<Purchases> findAllByDate(String date);

    public List<Purchases> findAllByCustomerId(long id);
}
