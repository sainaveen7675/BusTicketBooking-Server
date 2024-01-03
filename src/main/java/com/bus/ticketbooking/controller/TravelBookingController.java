package com.bus.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bus.ticketbooking.model.TravelBooking;
import com.bus.ticketbooking.service.TravelBookingService;

@RestController
@RequestMapping("/api/travelbookings")
@CrossOrigin
public class TravelBookingController {

	private final TravelBookingService travelBookingService;

	@Autowired
	public TravelBookingController(TravelBookingService travelBookingService) {
		this.travelBookingService = travelBookingService;
	}

	@PostMapping("/save")
	public ResponseEntity<TravelBooking> saveTravelBooking(@RequestBody TravelBooking travelBooking) {
		TravelBooking savedBooking = travelBookingService.saveTravelBooking(travelBooking);
		return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
	}

}