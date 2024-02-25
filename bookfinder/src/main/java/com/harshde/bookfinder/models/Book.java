package com.harshde.bookfinder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Book (id, name, author, publication, year, edition, category, price)
@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BookId")
	private long bookId;
	@Column(name="BookName")
	private String bookName;
	@Column(name="BookAuthor")
	private String bookAuthor;
	@Column(name="BookPublisher")
	private String bookPublisher;
	@Column(name="BookYear")
	private String bookYear;
	@Column(name="BookEdition")
	private String bookEdition;
	@Column(name="BookCategory")
	private String bookCategory;
	@Column(name="BookPrice")
	private String bookPrice;
	
	public Book() {
		super();
	}
	
	public Book(long bookId, String bookName, String bookAuthor, String bookPublisher, String bookYear,
			String bookEdition, String bookCategory, String bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookYear = bookYear;
		this.bookEdition = bookEdition;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
	}
	
	public long getBookId() {
		return bookId;
	}
	
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookPublisher() {
		return bookPublisher;
	}
	
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public String getBookYear() {
		return bookYear;
	}
	
	public void setBookYear(String bookYear) {
		this.bookYear = bookYear;
	}
	
	public String getBookEdition() {
		return bookEdition;
	}
	
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public String getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublisher="
				+ bookPublisher + ", bookYear=" + bookYear + ", bookEdition=" + bookEdition + ", bookCategory="
				+ bookCategory + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
