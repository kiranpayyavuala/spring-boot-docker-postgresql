#Spring boot docker postgresql Sample
-------------------------------------

git clone https://github.com/kiranpayyavuala/springbootpostgres.git

cd spring-boot-docker-postgresql


mvn clean install -Dmaven.test.skip=true docker:build

#postgresql pull 
----------------

#docker run --name spring-boot-postgres -e POSTGRES_PASSWORD=dbpassword -e POSTGRES_DB=docker -d postgres


now we opening the postgres container and login into postgres user and we create the password to postgres database(according to our application.yml)

docker exec -it spring-boot-postgres /bin/bash

su postgres

psql

for creating postgres database.

CREATE USER postgres WITH PASSWORD 'dbpassword';

if already created then set the password

ALTER USER postgres WITH PASSWORD 'dbpassword';

GRANT ALL PRIVILEGES ON DATABASE postgres to postgres;

\q and exit

#spring boot link postgresql run
--------------------------------

docker run --name spring-boot-docker-postgresql --link spring-boot-postgres:postgres -p 8080:8080 -d my/spring-boot-docker-postgresql

#spring boot log
----------------

docker logs $CONTAINER_ID 


#test
-----
[http://ouripaddress:8080/accounts]
