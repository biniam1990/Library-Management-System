package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class LibraryCard {
	
	private String cardNumber;
	private String barCode;
	private LocalDate issuedAt;
	private Account account;
	
	
	public boolean isActive() {
		
		return true;
	}


	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}


	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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
	 * @return the issuedAt
	 */
	public LocalDate getIssuedAt() {
		return issuedAt;
	}


	/**
	 * @param issuedAt the issuedAt to set
	 */
	public void setIssuedAt(LocalDate issuedAt) {
		this.issuedAt = issuedAt;
	}


	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}


	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}
