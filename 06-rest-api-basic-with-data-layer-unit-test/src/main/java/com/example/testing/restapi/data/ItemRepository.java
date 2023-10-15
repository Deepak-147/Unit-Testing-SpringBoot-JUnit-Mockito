package com.example.testing.restapi.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.restapi.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
}
