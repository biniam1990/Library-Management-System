package com.management.library.librarymanagement.model;

public class Account {
	
	private String id;
	private String password;
	private AccountStatus accountStatus;
	private Person person;
	private LibraryCard libraryCard;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the accountStatus
	 */
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
	/**
	 * @return the libraryCard
	 */
	public LibraryCard getLibraryCard() {
		return libraryCard;
	}
	/**
	 * @param libraryCard the libraryCard to set
	 */
	public void setLibraryCard(LibraryCard libraryCard) {
		this.libraryCard = libraryCard;
	}
	public boolean resetPassword() {
		
		return true;
	}
	

}
