package service.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("HELLO-SERVICE")
interface HelloServiceRepository {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello()
}