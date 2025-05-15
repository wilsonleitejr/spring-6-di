package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Myi18NControllerTest {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void testSayHello() {
        System.out.println(myi18NController.sayHello());
        // This will print "Hola Mundo - ES" if the SpanishGreetingService is used
        // and "Hello World - EN" if the EnglishGreetingService is used
    }
}
