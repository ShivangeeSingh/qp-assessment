package com.dq.assessment.Controller;


import com.dq.assessment.Entity.Orders;
import com.dq.assessment.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public Orders placeOrder(
            @RequestParam Long userId,
            @RequestParam Long itemId,
            @RequestParam int quantity) {
        return orderService.placeOrder(userId, itemId, quantity);
    }

    @GetMapping("/getOrderHistory")
    public List<Orders> getUserOrders(
            @RequestParam Long userId) {
        return orderService.getUserOrders(userId);
    }

}
