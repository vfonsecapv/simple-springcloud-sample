package helloservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableZuulProxy
class HelloYouApplication {
    static void main(String[] args) {
        SpringApplication.run(HelloYouApplication.class, args)
    }
}
