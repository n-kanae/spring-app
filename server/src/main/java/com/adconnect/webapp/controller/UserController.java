package com.adconnect.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adconnect.webapp.repository.UserRepository;

@RestController
public class UserController {

  private final UserRepository repository;

  @Autowired
  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @RequestMapping("/")
  public String user() {
    return String.valueOf(repository.findAll());
  }
}
