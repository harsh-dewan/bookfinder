package com.harhde.bookfinder.services;

import com.harshde.bookfinder.repository.PublisherRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshde.bookfinder.exceptions.PublisherNotFoundException;
import com.harshde.bookfinder.models.Publisher;

@Service
public class PublisherServices {
	
	@Autowired
	public PublisherRepository publisherRepository;
	
	public Publisher getPublisherDetailsById( long publisherId) {
		Publisher publisher =  publisherRepository.findByPublisherDetails(publisherId);
		if( publisher == null ) throw new PublisherNotFoundException("Publisher not found <"+publisherId+">");
		return publisher;
	}
	
	public List<Publisher> listAllPublishers() {
		List<Publisher> publisherList =  publisherRepository.findAll();
		if( publisherList == null || publisherList.size() == 0) throw new PublisherNotFoundException("No Publishers found, list is empty");
		return publisherList;
	}
	
	public Publisher addNewPublisher(Publisher newPublisher) {
		if( publisherRepository.findByPublisherId(newPublisher.getPublisherId()) == null ) 
			return publisherRepository.save(newPublisher);
		throw new PublisherNotFoundException("Record already present with publisherId <"+newPublisher.getPublisherId()+">");
	}
	
	public Publisher updatePub(Publisher updatedPublisher) {
		if( publisherRepository.findByPublisherId(updatedPublisher.getPublisherId()) == null )
			throw new PublisherNotFoundException("No record present with publisherId <"+updatedPublisher.getPublisherId()+">");
		return publisherRepository.save(updatedPublisher);
	}
	
	public Publisher removePublisher(long publisherId) {
		if( publisherRepository.findByPublisherId(publisherId) == null )
			throw new PublisherNotFoundException("Publisher with id <"+publisherId+">");
		return publisherRepository.removePublisher(publisherId);
	}
}
