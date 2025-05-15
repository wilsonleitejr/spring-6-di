package guru.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

	@Autowired
	ConstructorInjectedController constructorInjectedController;

	@Test
	void testSayHello() {
		assertNotNull(constructorInjectedController);

		System.out.println(constructorInjectedController.sayHello());
	}

}
