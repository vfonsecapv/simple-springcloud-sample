package eurekaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@EnableAutoConfiguration
@SpringBootApplication
class EurekaServer {

    static void main(String[] args) {
        SpringApplication.run EurekaServer.class, args
    }
}