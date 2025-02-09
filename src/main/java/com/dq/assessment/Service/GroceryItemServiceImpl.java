package com.dq.assessment.Service;

import com.dq.assessment.Entity.GroceryItem;
import com.dq.assessment.Repo.GroceryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemServiceImpl implements GroceryItemService{

    @Autowired
    private GroceryItemRepo repo;

    public GroceryItem addGroceryItem(GroceryItem groceryItem) {
        return repo.save(groceryItem);
    }

    public List<GroceryItem> getAllGroceryItems() {
        return repo.findAll();
    }

    public void deleteGroceryItem(Long id) {
        repo.deleteById(id);
    }

    public GroceryItem updateGroceryItem(Long id, GroceryItem updatedItem) {
        GroceryItem existingItem = repo.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        existingItem.setName(updatedItem.getName());
        existingItem.setPrice(updatedItem.getPrice());
        existingItem.setInventory(updatedItem.getInventory());
        return repo.save(existingItem);
    }
}
