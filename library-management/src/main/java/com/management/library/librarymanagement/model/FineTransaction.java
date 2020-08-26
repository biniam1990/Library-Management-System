package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class FineTransaction {
	
	private LocalDate creationDate;
	private double amount;
	private Fine fine;
	
	
	
	
	public boolean intiateTransaction() {
		
		return true;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}




	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}




	/**
	 * @return the fine
	 */
	public Fine getFine() {
		return fine;
	}




	/**
	 * @param fine the fine to set
	 */
	public void setFine(Fine fine) {
		this.fine = fine;
	}
	

}
