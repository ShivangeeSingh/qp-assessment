package com.dq.assessment.Service;

import com.dq.assessment.Entity.GroceryItem;

import java.util.List;

public interface GroceryItemService {

    public GroceryItem addGroceryItem(GroceryItem groceryItem);

    public List<GroceryItem> getAllGroceryItems();

    public void deleteGroceryItem(Long id);

    public GroceryItem updateGroceryItem(Long id, GroceryItem updatedItem);

}
