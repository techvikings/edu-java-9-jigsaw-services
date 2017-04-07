package com.example.helloworld.catalan;

import com.example.helloworld.HelloWorldService;

public class CatalanHelloWorld implements HelloWorldService {
  public String getHello() {
    return "Hola món.";
  }

  public String getLanguage () {
    return "Catalan";
  }
}
