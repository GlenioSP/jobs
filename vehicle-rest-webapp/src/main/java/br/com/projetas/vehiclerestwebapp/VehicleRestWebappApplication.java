package br.com.projetas.vehiclerestwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VehicleRestWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRestWebappApplication.class, args);
	}
}
