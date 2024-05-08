# Base image
FROM mysql:latest

# Environment variables
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=
ENV MYSQL_DATABASE=shorturl

# Copy initialization scripts to the container

USER root

# Expose PostgreSQL port
EXPOSE 3306

COPY shorturl.sql /.
COPY setup.sh /docker-entrypoint-initdb.d
