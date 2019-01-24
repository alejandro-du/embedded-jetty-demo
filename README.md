# embedded-jetty-demo

This demo shows how to package a Vaadin 12+ application as an "uber jar" using an embedded Jetty server.

# Try it out

```
git clone https://github.com/alejandro-du/embedded-jetty-demo.git
cd embedded-jetty-demo
mvn package
java -jar target/embedded-jetty-demo-1.0-SNAPSHOT.jar
```

The app should be visible at http://localhost:8080

During development you can create a run configuration for the `com.example.Application` class.
