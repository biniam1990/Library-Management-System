package com.management.library.librarymanagement.service;

import java.time.LocalDate;
import java.util.List;

import com.management.library.librarymanagement.model.Book;

public interface SearchService {
    /**
     * 
     * @param title
     * @return
     */
	public List<Book> searchByTitle(String title);

	/**
	 * 
	 * @param author
	 * @return
	 */
	public List<Book> searchByAuthor(String author);
	
	 /**
	  * 
	  * @param subject
	  * @return
	  */
	public List<Book> searchBySubject(String subject);
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public List<Book> searchByPubDate(LocalDate date);
	
	
	

}
