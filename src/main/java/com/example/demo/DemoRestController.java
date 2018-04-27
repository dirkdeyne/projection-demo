package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
  
  PersonRepository personRepository;

  public DemoRestController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }
  
  @GetMapping("/person/{name}")
  public List<NameProjection> getByName(@PathVariable("name") String name) {
    return personRepository.findByNameContains(name);
  }
  
  
}
