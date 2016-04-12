package helloservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class HelloYouApplication {
	
    static void main(String[] args) {
        SpringApplication.run HelloYouApplication.class, args
    }
}
