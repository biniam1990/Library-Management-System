package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class Member extends Account {
	
	private LocalDate dateOfMembership;
	private int totalBooksCheckedOut;
	
	/**
	 * @return the dateOfMembership
	 */
	public LocalDate getDateOfMembership() {
		return dateOfMembership;
	}
	/**
	 * @param dateOfMembership the dateOfMembership to set
	 */
	public void setDateOfMembership(LocalDate dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}
	/**
	 * @return the totalBooksCheckedOut
	 */
	public int getTotalBooksCheckedOut() {
		return totalBooksCheckedOut;
	}
	/**
	 * @param totalBooksCheckedOut the totalBooksCheckedOut to set
	 */
	public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
		this.totalBooksCheckedOut = totalBooksCheckedOut;
	}
	
	
	
	

}
