package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String surname;
    private String nickname;
    
    protected Person() { /* why JPA */ }
    
    public Person(String name, String surname, String nickname) {
      this.name = name;
      this.surname = surname;
      this.nickname = nickname;
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

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public void setSurname(String surname) {
      this.surname = surname;
    }

    public Long getId() {
      return id;
    }
    
    
}
