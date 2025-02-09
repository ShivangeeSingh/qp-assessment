package com.dq.assessment.Service;

import com.dq.assessment.Entity.Orders;

import java.util.List;

public interface OrderService {

    public Orders placeOrder(Long userId, Long itemId, int quantity);

    public List<Orders> getUserOrders(Long userId);
}
