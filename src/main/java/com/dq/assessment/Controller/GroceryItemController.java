package com.dq.assessment.Controller;


import com.dq.assessment.Entity.GroceryItem;
import com.dq.assessment.Service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryItemController {

    @Autowired
    private GroceryItemService _groceryItemService;

    @PostMapping("/add")
    public GroceryItem addGroceryItem(
            @RequestBody GroceryItem groceryItem) {
        return _groceryItemService.addGroceryItem(groceryItem);
    }

    @GetMapping("/all")
    public List<GroceryItem> getAllGroceryItems() {
        return _groceryItemService.getAllGroceryItems();
    }

    @DeleteMapping("/delete")
    public void deleteGroceryItem(
            @RequestParam Long id) {
        _groceryItemService.deleteGroceryItem(id);
    }

    @PutMapping("/update")
    public GroceryItem updateGroceryItem(
            @RequestParam Long id,
            @RequestBody GroceryItem updatedItem) {
        return _groceryItemService.updateGroceryItem(id, updatedItem);
    }
}
