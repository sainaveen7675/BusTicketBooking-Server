package com.bus.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.ticketbooking.model.TravelBooking;
import com.bus.ticketbooking.repository.TravelBookingRepository;

@Service
public class TravelBookingService {

	private final TravelBookingRepository travelBookingRepository;

	@Autowired
	public TravelBookingService(TravelBookingRepository travelBookingRepository) {
		this.travelBookingRepository = travelBookingRepository;
	}

	public TravelBooking saveTravelBooking(TravelBooking travelBooking) {
		return travelBookingRepository.save(travelBooking);
	}
}