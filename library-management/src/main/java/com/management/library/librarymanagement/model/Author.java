package com.management.library.librarymanagement.model;

import java.util.List;
import java.util.Objects;

public class Author {
	
	private String name;
	private String description;
	List<Book> books;
	
	public Author(String name, String description, List<Book> books) {
		super();
		this.name = name;
		this.description = description;
		this.books = books;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public int hashCode() {
		return Objects.hash(books, description, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(books, other.books) && Objects.equals(description, other.description)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", description=" + description + ", books=" + books + "]";
	}
	

}
