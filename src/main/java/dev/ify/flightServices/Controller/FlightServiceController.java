package dev.ify.flightServices.Controller;

import dev.ify.flightServices.Services.FlightBookingService;
import dev.ify.flightServices.dto.FlightBookingAcknowledgement;
import dev.ify.flightServices.dto.FlightBookingRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FlightServiceController {
    private final FlightBookingService service;

    public FlightServiceController(FlightBookingService service) {
        this.service = service;
    }


    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }
}
