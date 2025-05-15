package guru.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

	@Autowired
	SetterInjectedController setterInjectedController;

	@Test
	void testSayHello() {
		assertNotNull(setterInjectedController);
		System.out.println(setterInjectedController.sayHello());
	}

}
