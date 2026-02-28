package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class cseController {
	@GetMapping("/cseadd")
	public int addCse(@RequestParam int a, @RequestParam int b)
	{
		return a+b;
	}

}
