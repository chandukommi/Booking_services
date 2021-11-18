package com.htc.bookingservice.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "bookingdetails")
public class BookingDetails implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5772415394388436427L;
	@Id
	@GeneratedValue
	private long bookingId;
	private List<UserService>users;
	private List<CentreService>vaccinationcentres;
	private LocalDateTime bookingDate;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(long bookingId, List<UserService> users, List<CentreService> vaccinationcentres,
			LocalDateTime localDateTime) {
		super();
		this.bookingId = bookingId;
		this.users = users;
		this.vaccinationcentres = vaccinationcentres;
		this.bookingDate = localDateTime;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public List<UserService> getUsers() {
		return users;
	}
	public void setUsers(List<UserService> users) {
		this.users = users;
	}
	public List<CentreService> getVaccinationcentres() {
		return vaccinationcentres;
	}
	public void setVaccinationcentres(List<CentreService> vaccinationcentres) {
		this.vaccinationcentres = vaccinationcentres;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", users=" + users + ", vaccinationcentres="
				+ vaccinationcentres + ", bookingDate=" + bookingDate + "]";
	}

	
	
	
}
