package com.howtodoinjava.app.web;

import com.howtodoinjava.app.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class.getName());


  @GetMapping("me")
  public User getMe(JwtAuthenticationToken principal) {

    LOGGER.info("Principal attributes:: " + principal.getTokenAttributes());

    String username = principal.getTokenAttributes().get("preferred_username").toString();
    /*String name = principal.getTokenAttributes().get("name").toString();
    String email = principal.getTokenAttributes().get("email").toString();*/

    return new User(1L, username, "", "", "");
  }
}

