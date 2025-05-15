package guru.springframework.spring6di.services;

public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "dev";
    }

}
