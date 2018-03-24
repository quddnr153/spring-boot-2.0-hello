package me.spring.boot.bangsong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 2018-03-24
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class BangsongController {
	@RequestMapping("/bs")
	public Bangsong bs() {
		Bangsong bangsong = new Bangsong();
		bangsong.setSubject("Subject");
		bangsong.setTitle("title");

		return bangsong;
	}
}
