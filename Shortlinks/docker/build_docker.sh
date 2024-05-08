#!/bin/bash
#Budowanie Obrazu
echo "Budowanie Obrazu shorturl-read"
docker build -t Shortlinks ../shorturl-read/.
echo "Budowanie Obrazu shorturl-save"
docker build -t Shortlinks ../shorturl-save/.
echo "Budowanie Obrazu BazaDanych"
docker build -t Shortlinks ../cassandra/.