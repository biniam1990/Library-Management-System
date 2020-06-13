package com.management.library.librarymanagement.service.impl;

import java.time.LocalDate;
import java.util.List;

import com.management.library.librarymanagement.model.Book;
import com.management.library.librarymanagement.service.SearchService;

public class Catalog implements SearchService {
	
	private LocalDate creationDate;
	
	private int totalBooks;
	
	
	
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
	 * @return the totalBooks
	 */
	public int getTotalBooks() {
		return totalBooks;
	}



	/**
	 * @param totalBooks the totalBooks to set
	 */
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}



	public boolean updateCatalog() {
		
		return true;
	}
	
	

	@Override
	public List<Book> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchByPubDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

}
