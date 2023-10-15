package com.example.testing.restapi.business;

import org.springframework.stereotype.Component;

import com.example.testing.restapi.model.Item;

@Component
public class ItemBusinessService {

	public Item retrieveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
}
