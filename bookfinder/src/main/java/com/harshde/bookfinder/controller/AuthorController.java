package com.harshde.bookfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harhde.bookfinder.services.AuthorServices;
import com.harshde.bookfinder.models.Author;

@RestController
@RequestMapping("/bookfinder/author/")
public class AuthorController {
	
	
	@Autowired
	public AuthorServices authorService;
	
	//getAuthorList
	@GetMapping("/get/authorlist/")
	public List<Author> getAuthorList() {
		return authorService.listAllAuthors();
	}
	
	//getAuthorById
	@GetMapping("/getauthor/")
	public Author getAuthorDetails(@RequestParam(name="authorId") long authorId) {
		return authorService.fetchAuthorById(authorId);
	}	
	
	//[POST]
	//postNewAuthor
	@PostMapping("/addauthor/")
	public Author addNewAuthor(@RequestBody Author newAuthor) {
		return authorService.addNewAuthorDetails(newAuthor);
	}
	
	//[PUT]
	//updateAuthorDetailsByAuthorId
	@PutMapping("/updateauthor/")
	public Author updateAuthor(@RequestBody Author updatedAuthor ) {
		return authorService.updateAuthorDetails(updatedAuthor);
	}
	
	//[DELETE]
	//deleteAuthorById
	@DeleteMapping("/deleteauthor/")
	public Author deleteAuthor(@RequestParam(name="authorId") long authorId) {
		return authorService.removeAuthor(authorId);
	}
	
}
