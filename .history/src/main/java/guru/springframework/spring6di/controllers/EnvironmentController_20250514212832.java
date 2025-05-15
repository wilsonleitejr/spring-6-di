package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService EnvironmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.EnvironmentService = environmentService;
    }

}
