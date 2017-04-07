module com.example.helloworld {
  exports com.example.helloworld;
  exports com.example.helloworld.english;

  provides com.example.helloworld.HelloWorldService with com.example.helloworld.english.EnglishHelloWorld;
}