package com.pontogov.server.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

  @GetMapping("/health")
  public boolean health() {
    return true;
  }
}