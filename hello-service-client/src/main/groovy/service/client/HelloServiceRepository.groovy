package service.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@FeignClient("hello-service")
interface HelloServiceRepository {
    @RequestMapping(value = "/helloyou", method = RequestMethod.GET)
    def sayHello()
}