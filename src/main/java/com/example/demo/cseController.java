package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class cseController {
	@GetMapping("/cseadd")
	public int addCse(@RequestParam int a, @RequestParam int b)
	{
		int result = a+b;
		System.out.print("Addition operation is perfoemed by 24P35A0557" + result);
		return result;
	}

}
