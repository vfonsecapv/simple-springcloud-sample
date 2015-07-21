package service.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("hello-service")
interface HelloServiceRepository {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    String sayHello()
}