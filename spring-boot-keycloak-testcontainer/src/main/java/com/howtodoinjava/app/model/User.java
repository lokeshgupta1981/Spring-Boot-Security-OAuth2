package com.howtodoinjava.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private long id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
}
