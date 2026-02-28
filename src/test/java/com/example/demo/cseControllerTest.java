package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class cseControllerTest {
	@Autowired
	cseController c;
	@Test
	void test1() {
		int result = c.addCse(2, 3);
		assertEquals(5, result);
	}

}