package org.zs.spring_boot_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
		// @SpringBootTest will attempt to load application context, if it fails it will
		// through exception and this test will fail
	}

}
