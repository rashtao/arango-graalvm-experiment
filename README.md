# arangodb graalvm experiment

## run

```shell script
docker run -e ARANGO_ROOT_PASSWORD=test -p 8529:8529 --rm arangodb:3.5
mvn clean package && ./target/graaldemo 
```

## results

| jvm    | native |
| ------ | ------ |
| 200 ms | 2 ms   |

