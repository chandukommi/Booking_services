package com.htc.bookingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.bookingservice.entity.BookingDetails;


public interface InterfaceBooking extends JpaRepository<BookingDetails, Long> {

}
