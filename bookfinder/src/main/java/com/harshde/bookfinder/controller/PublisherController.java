package com.harshde.bookfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.harhde.bookfinder.services.PublisherServices;
import com.harshde.bookfinder.models.Publisher;

@RestController
@RequestMapping("/bookfinder/publisher")
public class PublisherController {
	
	@Autowired
	public PublisherServices publisherServices;
	
	//getPublisherByName
	@GetMapping("/findpublisher/{publisherId}")
	public Publisher getPublisher(@PathVariable long publihserId) {
		return publisherServices.getPublisherDetailsById(publihserId);
	}
	//getPublisherList
	@GetMapping("/listpublisher")
	public List<Publisher> getPublisherList(){
		return publisherServices.listAllPublishers();
	}
	
	//[POST]
	@PostMapping("/addnewpublisher/")
	public Publisher createNewPublisher(@RequestBody Publisher publisher) {
		return publisherServices.addNewPublisher(publisher);
	}
	
	//[PUT]
	//updatePublisherDetailsByPublisherId
	@PutMapping("/updatepublisher")
	public Publisher updatePublisher(@RequestBody Publisher publisher) {
		return publisherServices.updatePub(publisher);
	}
	
	//[DELETE]
	//deletePublisherById
	@DeleteMapping("/deletepublisher/{publisherId}")
	public Publisher deletePublisher(@PathVariable long  publisherId) {
		return publisherServices.removePublisher(publisherId);
	}
}
