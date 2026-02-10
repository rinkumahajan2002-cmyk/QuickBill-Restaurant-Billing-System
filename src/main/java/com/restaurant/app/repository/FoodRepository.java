
package com.restaurant.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.app.entity.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Long> {
}
