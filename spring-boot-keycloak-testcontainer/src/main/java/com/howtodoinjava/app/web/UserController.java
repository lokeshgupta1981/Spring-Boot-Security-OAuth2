package com.howtodoinjava.app.web;

import com.howtodoinjava.app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("me")
  public User getMe() {
    return new User(1L, "test-user", "TestUser", "", "test-user@howtodoinjava.com");
  }
}

