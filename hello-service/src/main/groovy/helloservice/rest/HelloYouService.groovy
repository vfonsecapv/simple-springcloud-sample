package helloservice.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.cloud.context.config.annotation.RefreshScope

@RefreshScope
@RestController
@RequestMapping("hello")
class HelloYouService {
	@Autowired
	DiscoveryClient client

    @Value('${message}')
    def message

	@RequestMapping(method = RequestMethod.GET)
    String hi() {
    	ServiceInstance localInstance = client.getLocalServiceInstance()

    	message + " : " + localInstance.getServiceId() + " : " + localInstance.getPort()
    }
}