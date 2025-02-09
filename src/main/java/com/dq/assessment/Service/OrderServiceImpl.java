package com.dq.assessment.Service;

import com.dq.assessment.Entity.GroceryItem;
import com.dq.assessment.Entity.Orders;
import com.dq.assessment.Repo.GroceryItemRepo;
import com.dq.assessment.Repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrdersRepo _repo;

    @Autowired
    GroceryItemRepo repo;

    public Orders placeOrder(Long userId, Long itemId, int quantity) {
        GroceryItem groceryItem = repo.findById(itemId).orElseThrow(() -> new RuntimeException("Item not found"));

        if (groceryItem.getInventory() < quantity) {
            throw new RuntimeException("Not enough inventory");
        }

        Orders order = new Orders();
        order.setUserId(userId);
        order.setGroceryItem(groceryItem);
        order.setQuantity(quantity);

        groceryItem.setInventory(groceryItem.getInventory() - quantity);
        repo.save(groceryItem);

        return _repo.save(order);
    }

    public List<Orders> getUserOrders(Long userId) {
        return _repo.findByUserId(userId);
    }


}
