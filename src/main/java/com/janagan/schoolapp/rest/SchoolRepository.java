package com.janagan.schoolapp.rest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "schools", path = "schools")
public interface SchoolRepository extends MongoRepository<School, String> {

	List<School> findBySubject(@Param("subject") String subject);

}