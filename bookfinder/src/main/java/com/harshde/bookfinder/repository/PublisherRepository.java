package com.harshde.bookfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.harshde.bookfinder.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{
	
	Publisher findByPublisherId(long publisherId);
	
	@Query(value="select p.* from Publisher p where p.PublisherId = ?1",nativeQuery = true)
	Publisher findByPublisherDetails(long publisherId);
	
	@Query(value="delete from Publisher p where p.PublisherId = ?1", nativeQuery = true)
	Publisher removePublisher(long publihserId);
	

}
