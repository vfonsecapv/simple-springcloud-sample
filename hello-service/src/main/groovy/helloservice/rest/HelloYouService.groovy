package helloservice.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class HelloYouService {
    @Value('${message}')
    def message

	@RequestMapping(name = "/", method = RequestMethod.GET,  produces = "application/json;charset=utf-8")
    String hi() {
    	"Olá, " + message
    }
}