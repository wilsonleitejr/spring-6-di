package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("prod")
public class EnvironmentControllerTestProd {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testGetEnvironment() {
        String env = environmentController.getEnvironment();
        System.out.println("Current Environment: " + env);
        assert env != null;
    }
}