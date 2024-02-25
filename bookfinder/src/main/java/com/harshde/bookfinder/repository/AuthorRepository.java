package com.harshde.bookfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshde.bookfinder.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	Author findByAuthorId(long authorId);
	Author deleteByAuthorId(long authorId);

}
