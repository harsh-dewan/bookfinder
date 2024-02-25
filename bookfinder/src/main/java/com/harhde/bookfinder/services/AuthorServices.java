package com.harhde.bookfinder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshde.bookfinder.repository.AuthorRepository;
import com.harshde.bookfinder.exceptions.AuthorNotFoundException;
import com.harshde.bookfinder.models.Author;

@Service
public class AuthorServices {
	
	@Autowired
	public AuthorRepository authorRepository;
	

	
	public List<Author> listAllAuthors() {
		List<Author> allAuthors = authorRepository.findAll();
		if( allAuthors != null &&  allAuthors.size() > 0 ) return allAuthors;
		else throw new AuthorNotFoundException("No Authors record found, list is empty");
	}
	
	public Author fetchAuthorById(long authorId) {
		Author author = authorRepository.findByAuthorId(authorId);
		if( author == null) throw new AuthorNotFoundException("No Authors record found with <"+author+ "> id");
		return author;
	}
	
	public Author addNewAuthorDetails(Author newAuthor) {
		if( authorRepository.findByAuthorId(newAuthor.getAuthorId()) != null )
			throw new AuthorNotFoundException("Author details already present in DB");
		return authorRepository.save(newAuthor);
	}
	
	public Author updateAuthorDetails(Author updatedAuthor) {
		if( authorRepository.findByAuthorId(updatedAuthor.getAuthorId()) == null ) 
			throw new AuthorNotFoundException("No Authors record found with <"+updatedAuthor.getAuthorId()+ "> id");
		return authorRepository.save(updatedAuthor);
	}
	
	public Author removeAuthor(long authorId) {
		if( authorRepository.findByAuthorId(authorId) == null ) 
			throw new AuthorNotFoundException("No Authors record found with <"+authorId+"> id");
		return authorRepository.deleteByAuthorId(authorId);
	}
}
