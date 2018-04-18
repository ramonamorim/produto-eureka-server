package br.com.empresa.produtoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProdutoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoEurekaServerApplication.class, args);
	}
	
}
