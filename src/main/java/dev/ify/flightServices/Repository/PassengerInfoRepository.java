package dev.ify.flightServices.Repository;

import dev.ify.flightServices.Entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository <PassengerInfo, Long>{
}
