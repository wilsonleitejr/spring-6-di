package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev","EN")
@SpringBootTest
public class EnvironmentControllerTestDev {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testGetEnvironment() {
        String env = environmentController.getEnvironment();
        System.out.println("Current Environment: " + env);
        assert env != null;
    }
}