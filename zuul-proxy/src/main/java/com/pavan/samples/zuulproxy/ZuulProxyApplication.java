package com.pavan.samples.zuulproxy;

import com.pavan.samples.zuulproxy.filter.GatewayFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class ZuulProxyApplication {



	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}

	/**
	 * This bean is of type ZuulFilter and is available to catch the request configured with zuul gateway which passes through it.
	 * 	 * @return
	 */
	@Bean
	public GatewayFilter gatewayFilter() {
		return new GatewayFilter();
	}

}
