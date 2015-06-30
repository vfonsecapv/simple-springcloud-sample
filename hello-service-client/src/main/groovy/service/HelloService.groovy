package service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
class HelloService {

    static void main(String[] args) {
        SpringApplication.run(HelloService.class, args)
    }
}
