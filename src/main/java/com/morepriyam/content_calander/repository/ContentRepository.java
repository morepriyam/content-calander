package com.morepriyam.content_calander.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.morepriyam.content_calander.model.Content;
import com.morepriyam.content_calander.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer>{

	
	List<Content> findAllByTitleContains(String keyword);
	
	
	@Query(""" 
			select * from "Content" where status = :status
			""")

	List<Content> listbyStatus(@Param("status") Status status);
} 