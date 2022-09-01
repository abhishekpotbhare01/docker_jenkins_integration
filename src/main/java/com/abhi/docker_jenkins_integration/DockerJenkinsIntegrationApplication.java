package com.abhi.docker_jenkins_integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {
    public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplication.class);

    public void init() {
        logger.info("Application Started");
    }

    public static void main(String[] args) {
        logger.info("Application executed");
        logger.info("Application executed 2 line");
        SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
        logger.info("Hello ABhishek");
        logger.info("Hello ABhishek 01");
    }
}
