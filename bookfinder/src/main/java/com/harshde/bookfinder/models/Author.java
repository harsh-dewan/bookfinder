package com.harshde.bookfinder.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Author(id, first name, last name, genre, contact)
@Entity
@Table(name="Author")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuthorId")
	private long authorId;
	
	@Column(name="AuthorFirstName")
	private String authorFirstName;
	
	@Column(name="AuthorLastName")
	private String authorLastName;
	
	@Column(name="Genre")
	private String genre;
	
	@Column(name="AuthorEmailId")
	private String authorEmailId;
	
	public Author() {}
	
	
	public Author(long authorId, String authorFirstName, String authorLastName, String genre, String authorEmailId) {
		super();
		this.authorId = authorId;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.genre = genre;
		this.authorEmailId = authorEmailId;
	}


	public long getAuthorId() {
		return authorId;
	}


	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}


	public String getAuthorFirstName() {
		return authorFirstName;
	}


	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}


	public String getAuthorLastName() {
		return authorLastName;
	}


	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAuthorEmailId() {
		return authorEmailId;
	}


	public void setAuthorEmailId(String authorEmailId) {
		this.authorEmailId = authorEmailId;
	}


	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorFirstName=" + authorFirstName + ", authorLastName="
				+ authorLastName + ", genre=" + genre + ", authorEmailId=" + authorEmailId + "]";
	}
	
	
	
	
}
