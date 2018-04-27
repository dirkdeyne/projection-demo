package com.example.demo;

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
     personRepo.save(new Person("Deyne","Dirk"));
     
     personRepo.findByNameContains("Deyn").forEach(n -> System.err.println(n.getName()));
  }
  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
