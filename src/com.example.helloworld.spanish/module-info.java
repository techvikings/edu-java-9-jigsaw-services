module com.example.helloworld.spanish {
  requires com.example.helloworld;
  exports com.example.helloworld.spanish;
  exports com.example.helloworld.catalan;

  provides com.example.helloworld.HelloWorldService
      with com.example.helloworld.spanish.SpanishHelloWorld, com.example.helloworld.catalan.CatalanHelloWorld;
}
