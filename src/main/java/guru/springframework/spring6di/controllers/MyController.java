package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController() {
		this.greetingService = new GreetingServiceImpl();
	}

	public String sayHello() {
		System.out.println("I'm in the controller");

		return greetingService.sayGreeting();
	}

	public void beforeInit() {
		System.out.println("## Before Init - Called by Bean Post Processor");
	}

	public void afterInit() {
		System.out.println("## After Init - Called by Bean Post Processor");
	}
}
