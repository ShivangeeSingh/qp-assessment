package com.dq.assessment.Repo;

import com.dq.assessment.Entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Long> {
}
