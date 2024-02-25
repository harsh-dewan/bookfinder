package com.harshde.bookfinder.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Publisher(id, name, location, contact)

@Entity
@Table(name="Publisher")
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PublisherId")
	private long publisherId;
	
	@Column(name="PublisherName")
	private String publisherName;
	
	@Column(name="PublisherEmailId")
	private String publisherEmailId;
	
	
	public Publisher() {}
	
	public Publisher(long publisherId, String publisherName, String publisherEmailId) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherEmailId = publisherEmailId;
	}



	public long getPublisherId() {
		return publisherId;
	}



	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
	}



	public String getPublisherName() {
		return publisherName;
	}



	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}



	public String getPublisherEmailId() {
		return publisherEmailId;
	}



	public void setPublisherEmailId(String publisherEmailId) {
		this.publisherEmailId = publisherEmailId;
	}



	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherEmailId="
				+ publisherEmailId + "]";
	}
	
	

}
