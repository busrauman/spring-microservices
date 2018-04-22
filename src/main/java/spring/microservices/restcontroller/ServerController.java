package spring.microservices.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/server")
public class ServerController {

	@GetMapping("/hello")
	public String callGreetingServer() {
		return "Hello Spring Cloud";
	}
}
