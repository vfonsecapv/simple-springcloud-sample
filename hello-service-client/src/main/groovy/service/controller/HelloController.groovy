package service.controller

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import service.client.HelloServiceRepository

@RestController
@RequestMapping("/hello")
class HelloController {
    @Autowired
    HelloServiceRepository say

    @CacheResult
    @HystrixCommand(fallbackMethod = "defaultHello")
    @RequestMapping(name = "/", method = RequestMethod.GET)
    String sayHello() {
        say.sayHello()
    }


    def defaultHello() {
        "No hello for you!"
    }
}
