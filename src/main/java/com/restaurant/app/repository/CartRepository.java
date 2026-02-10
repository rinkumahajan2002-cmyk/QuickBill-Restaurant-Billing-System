package com.restaurant.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurant.app.entity.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Long> {
}

