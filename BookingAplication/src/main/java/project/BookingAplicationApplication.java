package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "project")
@EnableDiscoveryClient
@EntityScan(basePackages = "project.entity")
@EnableJpaRepositories(basePackages = "project.repository")
public class BookingAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAplicationApplication.class, args);
		System.err.println("account micro service up on port number: 9898");
	}

	// Definir o RestTemplate como um bean para ser injetado
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
