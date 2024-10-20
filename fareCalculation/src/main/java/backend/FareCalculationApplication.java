package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "backend")
@EnableDiscoveryClient
public class FareCalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FareCalculationApplication.class, args);
	}

}
