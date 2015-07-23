package helloservice.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class HelloYouService {
	@Autowired
	DiscoveryClient client

    @Value('${message}')
    def message

	@RequestMapping(name = "/", method = RequestMethod.GET,  produces = "application/json;charset=utf-8")
    String hi() {
    	ServiceInstance localInstance = client.getLocalServiceInstance()

    	"Hello for you! INS: " + message + " : " +localInstance.getServiceId()+":"+localInstance.getHost()+":"+localInstance.getPort()
    }
}