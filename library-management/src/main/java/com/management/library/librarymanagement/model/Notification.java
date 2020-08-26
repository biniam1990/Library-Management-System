package com.management.library.librarymanagement.model;

import java.time.LocalDate;

public class Notification {
	
	private int notificationId;
	private LocalDate createdOn;
	private String content;
	
	public boolean sendNotification () {
		
		return true;
	}

	/**
	 * @return the notificationId
	 */
	public int getNotificationId() {
		return notificationId;
	}

	/**
	 * @param notificationId the notificationId to set
	 */
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	/**
	 * @return the createdOn
	 */
	public LocalDate getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	

}
