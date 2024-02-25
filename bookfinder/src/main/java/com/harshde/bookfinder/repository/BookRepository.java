package com.harshde.bookfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshde.bookfinder.models.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	Book findByBookId(long bookId);
	Book findByBookCategory(String bookGenre);
	Book deleteByBookId(long bookId);
}
