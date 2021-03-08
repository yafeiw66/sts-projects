package com.rk.spring.issues;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/topics")
	String index()  {
		 return "hello, rick";
	 }
}
