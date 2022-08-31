package com.abhi.docker_jenkins_integration;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class DockerJenkinsIntegrationApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case Executing....");
        assertEquals(true, true);
    }
}
