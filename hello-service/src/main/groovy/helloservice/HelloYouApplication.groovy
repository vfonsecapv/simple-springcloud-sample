package helloservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.ribbon.RibbonClient

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "hello-service", configuration = HelloYourProducer.class)
class HelloYouApplication {
    static void main(String[] args) {
        SpringApplication.run(HelloYouApplication.class, args)
    }
}
