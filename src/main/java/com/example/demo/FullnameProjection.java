package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullname", types= Person.class)
public interface FullnameProjection {
  
  @Value("#{target.getName()} #{target.getSurname()}")
  String getFullname();
  
}
