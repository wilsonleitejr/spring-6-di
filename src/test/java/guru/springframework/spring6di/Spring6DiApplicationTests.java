package guru.springframework.spring6di;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController mycontroller;

	@Test
	void testAutoWired() {
		System.out.println(mycontroller.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());

		assertNotNull(myController);
	}

    @Test
    void contextLoads() {
    }

}
