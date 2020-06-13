package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class BarcodeReader {
	
	private String id;
	private LocalDate registeredAt;
	private boolean active;
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the registeredAt
	 */
	public LocalDate getRegisteredAt() {
		return registeredAt;
	}



	/**
	 * @param registeredAt the registeredAt to set
	 */
	public void setRegisteredAt(LocalDate registeredAt) {
		this.registeredAt = registeredAt;
	}



	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}



	public boolean isActive() {
		
		return true;
	}
	

}
