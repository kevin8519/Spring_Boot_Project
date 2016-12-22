package com.example.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StatusUpdateDao extends /*CrudRepository*/PagingAndSortingRepository <StatusUpdate,Long> {
	
	StatusUpdate findFirstByOrderByAddedDesc();
	
	
	
}