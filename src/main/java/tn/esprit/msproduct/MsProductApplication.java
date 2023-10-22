package tn.esprit.msproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EntityScan(basePackages = {"tn.esprit.msproduct.Entity"})
@ComponentScan(basePackages = {"tn.esprit.msproduct.Controller","tn.esprit.msproduct.Service"})
@EnableJpaRepositories(basePackages = {"tn.esprit.msproduct.Repository"})
public class MsProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductApplication.class, args);
	}

}
