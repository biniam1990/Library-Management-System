package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class BookReservation {
	
	private LocalDate creationDate;
	private ReservationStatus reservationStatus;
	
	
	public BookReservation fetchReservationStatus() {
		
		return new BookReservation();
	}


	/**
	 * @return the creationDate
	 */
	public LocalDate getCreationDate() {
		return creationDate;
	}


	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}


	/**
	 * @return the reservationStatus
	 */
	public ReservationStatus getReservationStatus() {
		return reservationStatus;
	}


	/**
	 * @param reservationStatus the reservationStatus to set
	 */
	public void setReservationStatus(ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	
	

}
