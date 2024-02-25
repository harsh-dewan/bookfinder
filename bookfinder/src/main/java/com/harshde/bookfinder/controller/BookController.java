package com.harshde.bookfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harhde.bookfinder.services.BookServices;
import com.harshde.bookfinder.models.Book;

@RestController
@RequestMapping("/bookfinder/book/")
public class BookController {
	
	
	@Autowired
	public BookServices bookService;
	
	//getBookDetailsByName
	@GetMapping("/findbook/{bookId}")
	public Book getBookById(@PathVariable("bookId") long bookId) {
		return bookService.findByBookId(bookId);
	}
	
	//[GET]
	//getBookDetailsByGenre
	@GetMapping("/findbook/")
	public Book getBookByGenre(@RequestParam(name="bookGenre") String bookGenre) {
		return bookService.findByGenre(bookGenre);
	}
	
	//getBookList
	@GetMapping("/listbooks/")
	public List<Book> getBookList() {
		return bookService.listAllBooks();
	}

	//[POST]
	@PostMapping("/addbook/")
	public Book createNewBook(@RequestBody Book newBook ) {
		System.out.println("addnewrequets received!!");
		return bookService.addNewBook(newBook);
	}
	
	//[PUT]
	//updateBookDetailsByUserId
	@PutMapping("/updatebook/")
	public Book updateBookDetails(@RequestBody Book updateBook) {
		return bookService.updateBookInfo(updateBook);
	}
	
	//[DELETE]
	//deleteAuthorById
	@DeleteMapping("/deletebook/{bookId}")
	public Book deleteBookDetails(@PathVariable long bookId) {
		return bookService.deleteBookInfo(bookId);
	}
	
	
	
	
	
	
	
	
}
