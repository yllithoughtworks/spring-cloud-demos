package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Gunnar Hillert
 *
 */
@ComponentScan
@EnableZuulProxy
@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class ApiGateWay {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApiGateWay.class, args);
	}

}
