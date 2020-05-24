package io.cloud.discover.front.cloudfrontdiscovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudFrontDiscoveryApplication implements CommandLineRunner {
    private static Logger LOGGER = LoggerFactory.getLogger(CloudFrontDiscoveryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudFrontDiscoveryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("booting eureka server ...");
    }
}
