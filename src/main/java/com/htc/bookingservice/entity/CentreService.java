package com.htc.bookingservice.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "centredetails")
public class CentreService  {
	
	public CentreService(long centreId, String centreAddress, long pincode, LocalDateTime scheduleddateTime) {
		super();
		this.centreId = centreId;
		this.centreAddress = centreAddress;
		this.pincode = pincode;
		this.scheduleddateTime = scheduleddateTime;
	}

	private long centreId;
	private String centreAddress;
	@Id
	private long pincode;
	private LocalDateTime scheduleddateTime;
	
	
	public CentreService() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CentreService [centreId=" + centreId + ", centreAddress=" + centreAddress + ", pincode=" + pincode
				+ ", scheduleddateTime=" + scheduleddateTime + "]";
	}


	public long getCentreId() {
		return centreId;
	}


	public void setCentreId(long centreId) {
		this.centreId = centreId;
	}


	public String getCentreAddress() {
		return centreAddress;
	}


	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public LocalDateTime getScheduleddateTime() {
		return scheduleddateTime;
	}


	public void setScheduleddateTime(LocalDateTime scheduleddateTime) {
		this.scheduleddateTime = scheduleddateTime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centreAddress == null) ? 0 : centreAddress.hashCode());
		result = prime * result + (int) (centreId ^ (centreId >>> 32));
		result = prime * result + (int) (pincode ^ (pincode >>> 32));
		result = prime * result + ((scheduleddateTime == null) ? 0 : scheduleddateTime.hashCode());
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
		CentreService other = (CentreService) obj;
		if (centreAddress == null) {
			if (other.centreAddress != null)
				return false;
		} else if (!centreAddress.equals(other.centreAddress))
			return false;
		if (centreId != other.centreId)
			return false;
		if (pincode != other.pincode)
			return false;
		if (scheduleddateTime == null) {
			if (other.scheduleddateTime != null)
				return false;
		} else if (!scheduleddateTime.equals(other.scheduleddateTime))
			return false;
		return true;
	}
	

}
