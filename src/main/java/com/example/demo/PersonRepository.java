package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PersonRepository  extends CrudRepository<Person, Long> {
  
  @RestResource(path="name", rel="by-name-contains")
  Page<Person> findByNameContains(@Param("name") String name, Pageable page);
  
  @RestResource(path="surname", rel="by-surname-contains")
  Page<Person> findBySurnameContains(@Param("name") String name, Pageable page);
  
  @RestResource(path="nickname", rel="by-nickname-contains")
  Page<Person> findByNicknameContains(@Param("name") String name, Pageable page);

}
