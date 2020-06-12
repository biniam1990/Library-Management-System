package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class BookItem extends Book{
	private String barCode;
	private boolean isReferenceOnly;
	private LocalDate borrowed;
	private LocalDate dueDate;
	private double price;
	private BookFormat format;
	private LocalDate dateOfPurchase;
	private LocalDate publicashionDate;
	private Rack rack;
	
	public BookItem() {}
	
	public BookItem(String barCode, boolean isReferenceOnly, LocalDate borrowed, LocalDate dueDate, double price,
			BookFormat format, LocalDate dateOfPurchase, LocalDate publicashionDate, Rack rack) {
		
		this.barCode = barCode;
		this.isReferenceOnly = isReferenceOnly;
		this.borrowed = borrowed;
		this.dueDate = dueDate;
		this.price = price;
		this.format = format;
		this.dateOfPurchase = dateOfPurchase;
		this.publicashionDate = publicashionDate;
		this.rack = rack;
	}

	/**
	 * @return the barCode
	 */
	public String getBarCode() {
		return barCode;
	}

	/**
	 * @param barCode the barCode to set
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	/**
	 * @return the isReferenceOnly
	 */
	public boolean isReferenceOnly() {
		return isReferenceOnly;
	}

	/**
	 * @param isReferenceOnly the isReferenceOnly to set
	 */
	public void setReferenceOnly(boolean isReferenceOnly) {
		this.isReferenceOnly = isReferenceOnly;
	}

	/**
	 * @return the borrowed
	 */
	public LocalDate getBorrowed() {
		return borrowed;
	}

	/**
	 * @param borrowed the borrowed to set
	 */
	public void setBorrowed(LocalDate borrowed) {
		this.borrowed = borrowed;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the format
	 */
	public BookFormat getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(BookFormat format) {
		this.format = format;
	}

	/**
	 * @return the dateOfPurchase
	 */
	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	/**
	 * @param dateOfPurchase the dateOfPurchase to set
	 */
	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	/**
	 * @return the publicashionDate
	 */
	public LocalDate getPublicashionDate() {
		return publicashionDate;
	}

	/**
	 * @param publicashionDate the publicashionDate to set
	 */
	public void setPublicashionDate(LocalDate publicashionDate) {
		this.publicashionDate = publicashionDate;
	}

	/**
	 * @return the rack
	 */
	public Rack getRack() {
		return rack;
	}

	/**
	 * @param rack the rack to set
	 */
	public void setRack(Rack rack) {
		this.rack = rack;
	}
	
	
	

}
