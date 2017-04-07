package com.example.helloworld.spanish;

import com.example.helloworld.HelloWorldService;

public class SpanishHelloWorld implements HelloWorldService {
  public String getHello() {
    return "Hola Mundo.";
  }

  public String getLanguage () {
    return "Spanish";
  }
}
