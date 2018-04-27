package com.example.demo;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
  
  @Autowired
  PersonRepository personRepo;
  
  @Override
  public void run(String... args) throws Exception {
     Set<Person> people = Stream.of("Deyne,Dirk","Devos,Eric","Mahsum,Mahsum")
           .map(s -> s.split(","))
           .map(a -> new Person(a[0], a[1]))
           .collect(Collectors.toSet());
           
     personRepo.saveAll(people);
     
     personRepo.findByNameContains("Deyn").forEach(n -> System.err.println(n.getName()));
  }
  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
