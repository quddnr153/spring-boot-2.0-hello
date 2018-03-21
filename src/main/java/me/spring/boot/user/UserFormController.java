package me.spring.boot.user;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Byungwook Lee on 2018-03-21
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Controller
public class UserFormController {
	@GetMapping("/user/new")
	public String userForm() {
		return "user/new";
	}

	@PostMapping("/user/new")
	public String newUser(@ModelAttribute User user, BindingResult error) {
		if (error.hasErrors()) {
			return "users/new";
		}

		// TODO: add User
		return "redirect:/users";
	}
}
