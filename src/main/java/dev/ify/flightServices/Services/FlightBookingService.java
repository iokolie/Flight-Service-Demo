package dev.ify.flightServices.Services;

import dev.ify.flightServices.Entity.PassengerInfo;
import dev.ify.flightServices.Entity.PaymentInfo;
import dev.ify.flightServices.Repository.PassengerInfoRepository;
import dev.ify.flightServices.Repository.PaymentInfoRepository;
import dev.ify.flightServices.Utils.PaymentUtils;
import dev.ify.flightServices.dto.FlightBookingAcknowledgement;
import dev.ify.flightServices.dto.FlightBookingRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor

public class FlightBookingService {
    private PassengerInfoRepository passengerInfoRepository;

    private PaymentInfoRepository paymentInfoRepository;


    @Transactional//(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);



        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getpId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
            
    }
}
