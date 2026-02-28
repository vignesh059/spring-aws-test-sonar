package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class cseControllerTest {
	@Autowired
	cseController c;
	@Test
	void test() {
		int result = c.addCse(2, 3);
		assertEquals(5, result);
	}

}
