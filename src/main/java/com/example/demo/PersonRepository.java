package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {

  List<NameProjection> findByNameContains(String name);


}
