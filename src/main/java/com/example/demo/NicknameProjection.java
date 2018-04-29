package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nickname", types= Person.class)
public interface NicknameProjection {
  
  String getNickname();
  
}
