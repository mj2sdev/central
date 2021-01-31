package io.mj2sdev.central;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.mj2sdev.central.repository.mongodb.DoodleRepo;

@SpringBootTest
class CentralApplicationTests {

	@Autowired
	private DoodleRepo doodleRepo;

	@Test
	void contextLoads() {}

}
