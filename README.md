# spring-boot-docker-postgresql

Spring boot docker postgresql Sample

```
$ git clone https://github.com/wonwoo/spring-boot-docker-postgresql.git
$ cd spring-boot-docker-postgresql
$ mvn clean package docker:build
```

#### postgresql pull 
```
$ docker run --name spring-boot-postgres -e POSTGRES_PASSWORD=dbpassword -e POSTGRES_DB=docker -d postgres
```

#### spring boot link postgresql run
```
$ docker run --name spring-boot-docker-postgresql --link spring-boot-postgres:postgres -p 8080:8080 -d wonwoo/spring-boot-docker-postgresql
```


#### spring boot log
```
docker logs $CONTAINER_ID 
```

#### test
[http://localhost:8080/accounts](http://localhost:8080/accounts)

