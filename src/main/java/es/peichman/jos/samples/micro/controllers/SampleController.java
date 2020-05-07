package es.peichman.jos.samples.micro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/regards")
	public String callService() {
		return "Regards from service-two";
	}
}
