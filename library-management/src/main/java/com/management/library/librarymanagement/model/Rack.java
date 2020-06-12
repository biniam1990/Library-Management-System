package com.management.library.librarymanagement.model;

import java.util.List;

public class Rack {

	private int number;
	private String locationIdentifier;
	private List<BookItem> bookItems;
	
	public Rack(int number, String locationIdentifier, List<BookItem> bookItems) {
		super();
		this.number = number;
		this.locationIdentifier = locationIdentifier;
		this.bookItems = bookItems;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the locationIdentifier
	 */
	public String getLocationIdentifier() {
		return locationIdentifier;
	}

	/**
	 * @param locationIdentifier the locationIdentifier to set
	 */
	public void setLocationIdentifier(String locationIdentifier) {
		this.locationIdentifier = locationIdentifier;
	}

	/**
	 * @return the bookItems
	 */
	public List<BookItem> getBookItems() {
		return bookItems;
	}

	/**
	 * @param bookItems the bookItems to set
	 */
	public void setBookItems(List<BookItem> bookItems) {
		this.bookItems = bookItems;
	}
	
	
	

}
