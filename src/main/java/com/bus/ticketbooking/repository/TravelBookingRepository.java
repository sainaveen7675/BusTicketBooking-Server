package com.bus.ticketbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.ticketbooking.model.TravelBooking;

@Repository
public interface TravelBookingRepository extends JpaRepository<TravelBooking, Integer> {

}