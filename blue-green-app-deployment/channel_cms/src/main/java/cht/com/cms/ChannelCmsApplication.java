package cht.com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ChannelCmsApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ChannelCmsApplication.class, args);
	}

	public static int max(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}

}
