package com.example.helloworld.arabic;

import com.example.helloworld.HelloWorldService;

public class ArabicHelloWorld implements HelloWorldService {
  public String getHello() {
    return "marhabaan bialealam.";
  }

  public String getLanguage () {
    return "Arabic";
  }
}
