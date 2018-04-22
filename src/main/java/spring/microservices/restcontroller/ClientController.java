package spring.microservices.restcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
@Autowired 	RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public ResponseEntity<String> callGreetingServer() throws URISyntaxException {
		String url="http://localhost:8080/rest/server/hello";
		

        URI uri = new URI( String.format( url, URLEncoder.encode(  "UTF8" ) ));
		ResponseEntity<String > res = restTemplate.getForEntity(url, String.class);
		return res;
	}

}