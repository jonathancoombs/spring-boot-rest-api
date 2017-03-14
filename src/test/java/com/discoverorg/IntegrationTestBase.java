package com.discoverorg;

import com.discoverorg.starters.RestApiApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@TestPropertySource(locations="classpath:application-test.properties")
@ContextConfiguration(classes = RestApiApplication.class)
public abstract class IntegrationTestBase {
}
