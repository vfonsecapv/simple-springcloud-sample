package helloservice.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance

@RestController
@RequestMapping("/helloyou")
class HelloYouService {
	@Autowired
	DiscoveryClient client

	@HystrixCommand(fallbackMethod = "defaultHello")
	@RequestMapping("/hi")
    def hi() {
    	ServiceInstance localInstance = client.getLocalServiceInstance()

    	"Hello for you! INS: " + localInstance.getServiceId()+":"+localInstance.getHost()+":"+localInstance.getPort()
    }

    def defaultHello() {
        "No hello for you!"
    }
}