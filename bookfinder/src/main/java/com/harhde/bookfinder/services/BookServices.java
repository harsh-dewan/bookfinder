package com.harhde.bookfinder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshde.bookfinder.exceptions.BookNotFoundException;
import com.harshde.bookfinder.models.Book;
import com.harshde.bookfinder.repository.BookRepository;

@Service
public class BookServices {
	
	@Autowired
	public BookRepository bookRepository;
	
	public Book findByBookId(long bookId) {
		Book fetchedBook = bookRepository.findByBookId(bookId);
		if( fetchedBook == null )
			throw new BookNotFoundException("Book with id <"+bookId+"> not found");
		return fetchedBook;
	}
	
	public List<Book> listAllBooks() {
		List<Book> bookList = bookRepository.findAll();
		if( bookList == null || bookList.size() == 0) 
			throw new BookNotFoundException("No Books in the record, list is empty");
		return bookList;
	}
	
	public Book findByGenre(String bookGenre) {
		Book fetchedBook =  bookRepository.findByBookCategory(bookGenre);
		if( fetchedBook == null )
			throw new BookNotFoundException("No book found with genre <"+bookGenre+">");
		return fetchedBook;
	}
	
	public Book addNewBook(Book newBook) {
		if( bookRepository.findByBookId(newBook.getBookId()) != null ) {
			System.out.println("book details already present");
			throw new BookNotFoundException("Book Details Already Present");
		}
		System.out.println("returning newBook");
		return bookRepository.save(newBook);
	}
	
	public Book updateBookInfo(Book updateBook) {
		if( bookRepository.findByBookId(updateBook.getBookId()) == null )
			throw new BookNotFoundException("Book with id <"+updateBook.getBookId()+"> not found");
		return bookRepository.save(updateBook);
	}
	
	public Book deleteBookInfo(long bookId) {
		
		if( bookRepository.findByBookId(bookId) == null )
			throw new BookNotFoundException("Book with id <"+bookId+"> not found");
		return bookRepository.deleteByBookId(bookId);
	}
	
}
