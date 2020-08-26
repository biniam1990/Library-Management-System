package com.management.library.librarymanagement.model;

import java.util.List;

public class Fine {
	
	private double amount;
	private FineTransaction fineTransaction;
	List<Notification> notifications;

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
	

}
