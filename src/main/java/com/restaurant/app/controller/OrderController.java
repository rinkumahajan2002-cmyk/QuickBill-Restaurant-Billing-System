package com.restaurant.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.restaurant.app.entity.Cusdetail;
import com.restaurant.app.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("customer", new Cusdetail());
		return "name";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Cusdetail customer) {
		service.storeTempCustomer(customer);
		return "redirect:/menu";
	}

	@GetMapping("/menu")
	public String menu(Model model) {
		model.addAttribute("menu", service.getMenu());
		model.addAttribute("cart", service.getCart());
		model.addAttribute("total", service.getTotal());
		return "menu";
	}

	@PostMapping("/add")
	public String add(@RequestParam Long foodId, @RequestParam int quantity) {
		service.addToCart(foodId, quantity);
		return "redirect:/menu";
	}

	@PostMapping("/finalBill")
	public String finalBill(@RequestParam String paymentStatus) {

		service.saveFinalCustomer(paymentStatus);

		return "redirect:/";
	}

	@PostMapping("/clear")
	public String clear() {
		service.clearCart();
		return "redirect:/";
	}
}
