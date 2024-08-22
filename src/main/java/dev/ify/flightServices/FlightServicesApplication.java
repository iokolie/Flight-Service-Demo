package dev.ify.flightServices;

import dev.ify.flightServices.Services.FlightBookingService;
import dev.ify.flightServices.dto.FlightBookingAcknowledgement;
import dev.ify.flightServices.dto.FlightBookingRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@SpringBootApplication
@EnableTransactionManagement
public class FlightServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlightServicesApplication.class, args);
	}

}
