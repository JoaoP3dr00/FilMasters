package com.gcs.FilMasters;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootTest
class FilMastersApplicationTests {
	@Test
	void mainTest() {
		//System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "");
		FilMastersApplication.main(new String[]{});
	}
}
