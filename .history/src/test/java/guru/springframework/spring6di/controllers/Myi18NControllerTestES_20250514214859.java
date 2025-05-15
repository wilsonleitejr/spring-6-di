package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.spring6di.controllers.i18n.Myi18NController;

@SpringBootTest
public class Myi18NControllerTestES {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void testSayHello() {
        System.out.println(myi18NController.sayHello());
    }
}
