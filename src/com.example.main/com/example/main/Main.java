package com.example.main;

import com.example.helloworld.HelloWorldService;
import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) {
    Iterable<HelloWorldService> services = ServiceLoader.load(HelloWorldService.class);
    for (HelloWorldService service : services) {
      System.out.println(service.getLanguage() + ": " + service.getHello());
    }
  }
}
