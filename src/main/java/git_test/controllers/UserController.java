package git_test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/greet")
	public String hell() {
		return "Hi";
	}
	@GetMapping("/record")
	public String record() {
		return "record";
	}

}
