package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
public class Myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void testSayHello() {
        System.out.println(myi18NController.sayHello());
    }

}
