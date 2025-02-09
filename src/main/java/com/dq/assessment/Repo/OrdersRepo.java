package com.dq.assessment.Repo;

import com.dq.assessment.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepo extends JpaRepository<Orders, Long> {

    @Query("SELECT o FROM Orders o WHERE o.userId = :userId")
    List<Orders> findByUserId(@Param("userId") Long userId);
}
