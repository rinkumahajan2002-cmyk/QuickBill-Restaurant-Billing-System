package com.restaurant.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.app.entity.CartItem;
import com.restaurant.app.entity.Cusdetail;
import com.restaurant.app.entity.FoodItem;
import com.restaurant.app.repository.CartRepository;
import com.restaurant.app.repository.CusdetailRepository;
import com.restaurant.app.repository.FoodRepository;

@Service
public class OrderService {

	@Autowired
	private FoodRepository foodRepo;

	@Autowired
	private CartRepository cartRepo;

	@Autowired
	private CusdetailRepository cusRepo;

	private Cusdetail tempCustomer;

	public List<FoodItem> getMenu() {
		return foodRepo.findAll();
	}

	public void addToCart(Long id, int qty) {
		FoodItem f = foodRepo.findById(id).orElseThrow();

		CartItem d = new CartItem();
		d.setFoodName(f.getName());
		d.setPrice(f.getPrice());
		d.setQuantity(qty);
		d.setTotal(f.getPrice() * qty);

		if (tempCustomer == null) {
			tempCustomer = new Cusdetail();
		}
		tempCustomer.getCartItems().add(d);
	}

	public List<CartItem> getCart() {
		if (tempCustomer == null)
			return new ArrayList<>();
		return tempCustomer.getCartItems();
	}

	public int getTotal() {
		int sum = 0;
		for (CartItem item : getCart()) {
			sum += item.getTotal();
		}
		return sum;
	}

	public void clearCart() {
		if (tempCustomer != null) {
			tempCustomer.getCartItems().clear();
		}
	}

	public void storeTempCustomer(Cusdetail customer) {
		this.tempCustomer = customer;
	}

	public void saveFinalCustomer(String paymentStatus) {
		if (tempCustomer == null)
			return;

		tempCustomer.setTotal(getTotal());
		tempCustomer.setPaymentStatus(paymentStatus);

		cusRepo.save(tempCustomer);

		tempCustomer = null;
	}

}
