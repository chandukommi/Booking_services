package com.htc.bookingservice.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservice.dao.InterfaceBooking;
import com.htc.bookingservice.dao.InterfaceVaccinationCentres;
import com.htc.bookingservice.entity.BookingDetails;


@RestController("/api")
public class BookingController {

	 private static final Logger LOG = Logger.getLogger(BookingController.class.getName());
	 
	 @Autowired
	 private InterfaceVaccinationCentres vaccinationcentres;
	 
	 @Autowired
	 private InterfaceBooking booking;
	 
	 @GetMapping("/centresbypincode/{pincode}")
		BookingDetails getVaccinationcentrebyPincode(@PathVariable long pincode)
		{
		 LOG.config("BEFORE CALLING GET METHOD");
		 BookingDetails bookingdetails =null;
		 bookingdetails=vaccinationcentres.getvaccinationcentresById(pincode);
		 LOG.config("BEFORE CALLING GET METHOD");
			return bookingdetails;
			
		}
	 
	 @GetMapping("/centres/{centreId}")
	 BookingDetails getVaccinationcentrebyId(@PathVariable Long centreId)
		{
		 BookingDetails bookings =null;
		 bookings=vaccinationcentres.getvaccinationcentresBycentreId(centreId);
			return bookings;
			
		}
	 
	 @PostMapping("/bookings")
		BookingDetails createBookingDetails(@RequestBody BookingDetails bookingdetails)
		{
			return booking.save(bookingdetails);
			
		}
		
	 
	
}
