package com.example.rest.services.restful.webservices;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Autowired
	private MessageSource messageSource;
	
	//@RequestMapping(method= RequestMethod.GET, path = "/hello")
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World, This is Sathvik";
	}
	
	@GetMapping(path = "/student")
	public Student studentDetails() {
		
		Student s = new Student("sai", 111, "Guntur");
		
		//String s1 = s.display();
		
		return s;
	}
	
	@GetMapping(path = "/path-variable/{name}")
	public String pathVariable(@PathVariable String name) {
		return  String.format("Hello %s", name);
	}
	
	@GetMapping(path = "/hello-world-internationalization")
	public String helloWorldIntl(@RequestHeader(name = "Accept-Language", required=false) Locale locale) {
		return  messageSource.getMessage("Thank.you.message", null, locale);
	}

}
