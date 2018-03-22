/**
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package me.spring.boot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Byungwook Lee
 */
@Controller
public class FreemarkerController {
	@GetMapping("/freemarker")
	public String freemarker(Model model, @RequestParam String name) {
		model.addAttribute("user", name);

		return "freemarker";
	}
}
