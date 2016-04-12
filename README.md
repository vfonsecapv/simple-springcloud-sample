[Simple Spring Cloud Sample]

@Pivotal

Using config repo, for config server apps .yml:

https://github.com/vfonsecapv/config

Open source example for Spring Cloud (http://projects.spring.io/spring-cloud/)  - Angel SR6

[How to use]

* You can use BOSH-LITE, but need to deploy some services:

	* You need RabbitMQ service. (https://github.com/pivotal-cf/cf-rabbitmq-release)

	* You need to create some CUPS:

		* cf cups config-service -p '{"uri":"http://config-server-url.host.com"}'

		* cf cups eureka-service -p '{"uri":"eureka-server-url-no-http.host.com"}'