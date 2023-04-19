package com.howtodoinjava.app.web;

import com.howtodoinjava.app.model.User;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("me")
  public User getMe(JwtAuthenticationToken principal) {

    String username = principal.getTokenAttributes().get("preferred_username").toString();
    String name = principal.getTokenAttributes().get("name").toString();
    String email = principal.getTokenAttributes().get("email").toString();

    return new User(1L, username, name, "", email);
  }
}

