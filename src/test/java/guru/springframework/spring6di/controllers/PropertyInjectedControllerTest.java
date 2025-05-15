package guru.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

	@Autowired
	PropertyInjectedController propertyInjectedController;

	@Test
	void testSayHello() {
		assertNotNull(propertyInjectedController);
		System.out.println(propertyInjectedController.sayHello());
	}

}
