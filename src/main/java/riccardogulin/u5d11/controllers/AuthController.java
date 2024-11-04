package riccardogulin.u5d11.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riccardogulin.u5d11.payloads.UserLoginDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping("/login")
	public String login(@RequestBody UserLoginDTO body) {
		return "token";
	}
}
