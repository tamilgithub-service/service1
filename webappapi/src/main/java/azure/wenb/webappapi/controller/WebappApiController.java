package azure.wenb.webappapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebappApiController {

	@GetMapping("/v1/demo")
	public ResponseEntity getData(){
		System.out.println("Azure demo function");
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
}
