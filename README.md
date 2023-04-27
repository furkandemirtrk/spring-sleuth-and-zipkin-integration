# Spring Sleuth And Zipkin Integration

## Zipkin Installation

#### You can install zipkin with the following codes.

##### Installation with Docker
```
docker run -d -p 9411:9411 openzipkin/zipkin
```

##### Installation with Java Jar
```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

##### Or you can install zipkin project from openzipkin to develop new features.
```
git clone https://github.com/openzipkin/zipkin
```


...
