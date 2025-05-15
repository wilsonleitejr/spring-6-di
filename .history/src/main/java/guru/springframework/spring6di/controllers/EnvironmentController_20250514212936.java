package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.EnvironmentService;

@Controller
public class EnvironmentController {

    private final EnvironmentService EnvironmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.EnvironmentService = environmentService;
    }

    public String getEnvironment() {
        return EnvironmentService.getEnvironment();
    }
}
