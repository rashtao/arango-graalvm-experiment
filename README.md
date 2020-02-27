# arangodb graalvm experiment

## prerequisites

- Checkout and install the latest snapshot version of the driver:

```shell script
git clone git@github.com:arangodb/arangodb-java-driver.git
cd arangodb-java-driver
mvn clean install -Dgpg.skip -DskipTests=true
``` 

## run

```shell script
docker run -e ARANGO_ROOT_PASSWORD=test -p 8529:8529 --rm arangodb:3.6
mvn clean package && ./target/graalvm-experiment 
```

## results

| jvm    | native |
| ------ | ------ |
| 200 ms | 2 ms   |

