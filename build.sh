
#!/usr/bin/env bash

printf "***** BUILDING APP *****\n"
mvn clean -U I-Pnative-image package > /dev/null

printf "\n***** STARTING KAFKA INFRASTRUCTURE *****\n"
docker-compose up -d

printf "\n***** STARTING NATIVE APP *****\n"
./target/com.dccorp.nativeapps.nativecloudstreamsapplication

printf "\n***** SHUTING DOWN DOCKER *****\n"
docker-compose down

printf "\n***** DONE *****"
