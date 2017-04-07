package com.example.helloworld.english;

import com.example.helloworld.HelloWorldService;

public class EnglishHelloWorld implements HelloWorldService {
  public String getHello() {
    return "Hello World.";
  }

  public String getLanguage () {
    return "English";
  }
}
