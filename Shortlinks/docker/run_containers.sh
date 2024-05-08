#!/bin/bash
#Budowanie Obrazu
#echo "Budowanie Obrazu shorturl-read"
#docker build -t Shortlinks ../shorturl-read/.
#echo "Budowanie Obrazu shorturl-save"
#docker build -t Shortlinks ../shorturl-save/.
#echo "Budowanie Obrazu BazaDanych"
#docker build -t Shortlinks ../phpmyadmin/.

if [ $# -eq 0 ]; then
    echo "No argument supplied
    'up' - run containers
    'down' - stop and remove containers"
elif [ $1 == "up" ]; then
    echo "Containers Run"
    docker-compose  \
    -f ./docker.yml  $1 -d
elif [ $1 == "down" ]; then
    echo "Containers Down"
    docker-compose  \
    -f docker.yml $1
fi