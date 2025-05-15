package guru.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("greetingServicePropertyInjected")
	@Autowired
	GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
