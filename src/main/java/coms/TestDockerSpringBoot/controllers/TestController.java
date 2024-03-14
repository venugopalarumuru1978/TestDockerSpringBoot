package coms.TestDockerSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("Test")
	public String DemoPage()
	{
		return "Docker with Jenkins Page";
	}
}
