module com.example.helloworld.arabic {
  requires com.example.helloworld;
  exports com.example.helloworld.arabic;

  provides com.example.helloworld.HelloWorldService with com.example.helloworld.arabic.ArabicHelloWorld;
}
