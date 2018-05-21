package com.stackroute.zuulproxydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.stackroute.zuulproxydemo.filters.ErrorFilter;
import com.stackroute.zuulproxydemo.filters.PostFilter;
import com.stackroute.zuulproxydemo.filters.PreFilter;
import com.stackroute.zuulproxydemo.filters.RouteFilter;


@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayProxyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayProxyDemoApplication.class, args);
	}
	
	  @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }
}
