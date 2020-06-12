package com.management.library.librarymanagement.model;

import java.util.List;

public class Library {
	
	private String name;
	private Address address; 
	List<BookItem> bookItems;
	
	public Library(String name, Address address, List<BookItem> bookItems) {
		super();
		this.name = name;
		this.address = address;
		this.bookItems = bookItems;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
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
