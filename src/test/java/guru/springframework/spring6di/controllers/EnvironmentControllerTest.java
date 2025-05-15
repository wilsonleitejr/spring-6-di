package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testGetEnvironment() {
        String env = environmentController.getEnvironment();
        System.out.println("Current Environment: " + env);
        assert env != null;
    }
}
