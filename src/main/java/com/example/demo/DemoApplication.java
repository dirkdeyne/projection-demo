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
     Set<Person> people = Stream.of("Deyne,Dirk,deynedirk","Devos,Eric,fastric","Mahsum,Demir,mahsumdemir","Gierke,Oliver,spring-oliver")
           .map(s -> s.split(","))
           .map(a -> new Person(a[0], a[1],a[2]))
           .collect(Collectors.toSet());
           
     personRepo.save(people);
  
  }
  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
