package com.management.library.librarymanagement.model;

import java.util.List;
import java.util.Objects;

public class Book {

	private String ISBN;
	private String title;
	private String subject;
	private String publisher;
	private String language;
	private int numberOfPages;
	List<Author> authors;
	
	public Book () {
		
	}
	
	public Book(String iSBN, String title, String subject, String publisher, String language, int numberOfPages,
			List<Author> authors) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.subject = subject;
		this.publisher = publisher;
		this.language = language;
		this.numberOfPages = numberOfPages;
		this.authors = authors;
	}
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	/**
	 * @return the authors
	 */
	public List<Author> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ISBN, authors, language, numberOfPages, publisher, subject, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(authors, other.authors)
				&& Objects.equals(language, other.language) && numberOfPages == other.numberOfPages
				&& Objects.equals(publisher, other.publisher) && Objects.equals(subject, other.subject)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", subject=" + subject + ", publisher=" + publisher
				+ ", language=" + language + ", numberOfPages=" + numberOfPages + ", authors=" + authors + "]";
	} 
	
	
}
