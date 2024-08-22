package dev.ify.flightServices.dto;

import dev.ify.flightServices.Entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//helps generate getters and setters
@AllArgsConstructor //generate a constructor for all the fields in the class
public class FlightBookingAcknowledgement {



    public FlightBookingAcknowledgement(String success, double fare, String s, PassengerInfo passengerInfo) {
    }
}
