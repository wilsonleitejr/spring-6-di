package guru.springframework.spring6di.services.i18n;

import org.springframework.stereotype.Service;

import guru.springframework.spring6di.services.GreetingService;

@Service("i18nService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}
