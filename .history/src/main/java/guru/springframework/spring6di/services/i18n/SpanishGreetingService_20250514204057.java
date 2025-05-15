package guru.springframework.spring6di.services.i18n;

import org.springframework.stereotype.Service;

import guru.springframework.spring6di.services.GreetingService;

@Service
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}
