package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class BookLending {
	
	private LocalDate creationDate;
	private LocalDate dueDate;
	private LocalDate returnDate;
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
	 * @return the returnDate
	 */
	public LocalDate getReturnDate() {
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	

}
