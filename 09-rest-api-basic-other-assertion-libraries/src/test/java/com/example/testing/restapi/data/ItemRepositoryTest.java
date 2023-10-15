package com.example.testing.restapi.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.testing.restapi.model.Item;

/**
 * 
 * @DataJpaTest is Annotation that focuses only on JPA components.
 *
 */

@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repository;
	
	/**
	 * This test is an overkill and not required for the case when our repository is extends JpaRepository. 
	 * But it's useful when our repository directly uses Hibernate.
	 * So keeping this here for reference purposes.
	 */
	@Test
	public void testFindAll() {
		List<Item> items = repository.findAll();
		assertEquals(3, items.size());
	}
}
