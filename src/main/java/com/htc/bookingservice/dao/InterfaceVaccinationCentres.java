package com.htc.bookingservice.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.bookingservice.entity.BookingDetails;


@Service
@FeignClient(url = "http://localhost:8091/vaccinationcentre-management",name="vaccinationcentre-management")

public interface InterfaceVaccinationCentres {
	
	@GetMapping("/api/vaccinations/{pincode}")
	BookingDetails getvaccinationcentresById(@PathVariable("pincode") Long pincode);
	
	@GetMapping("/api/vaccinationdetails/{centreId}")
	BookingDetails getvaccinationcentresBycentreId(@PathVariable("centreId") Long centreId);

}
