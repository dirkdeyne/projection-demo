package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;
    
    protected Person() { /* why JPA */ }
    
    public Person(String name, String surname) {
      super();
      this.name = name;
      this.surname = surname;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSurname() {
      return surname;
    }

    public void setSurname(String surname) {
      this.surname = surname;
    }

    public Long getId() {
      return id;
    }
    
    
}
