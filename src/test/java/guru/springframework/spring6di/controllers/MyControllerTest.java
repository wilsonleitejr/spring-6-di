package guru.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class MyControllerTest {

	@Test
	void testSayHello() {
		MyController myController = new MyController();

		assertNotNull(myController);

		System.out.println(myController.sayHello());
	}

}
