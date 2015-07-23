package helloservice

import com.netflix.client.config.DefaultClientConfigImpl
import com.netflix.client.config.IClientConfig
import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.WeightedResponseTimeRule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloYourProducer {
    @Bean
    IClientConfig ribbonClientConfig() {
        DefaultClientConfigImpl config = new DefaultClientConfigImpl()
        config.loadProperties "hello-service"
        config
    }

    @Bean
    IRule ribbonRule(IClientConfig config) {
        WeightedResponseTimeRule rule = new WeightedResponseTimeRule()
        rule.initWithNiwsConfig config
        rule
    }
}
