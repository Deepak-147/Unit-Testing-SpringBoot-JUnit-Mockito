package com.example.testing.restapi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.testing.restapi.data.ItemRepository;
import com.example.testing.restapi.model.Item;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository repository;

	public Item retrieveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> retrieveAllItems() {
		// Interaction with data layer
		List<Item> items = repository.findAll();
		
		// Business logic
		for (Item item : items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		
		return items;
	}
	
}
