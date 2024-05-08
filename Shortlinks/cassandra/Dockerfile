# Base image
FROM cassandra:latest

# Environment variables
ENV CASSANDRA_CLUSTER_NAME=shortlinks_cluster
ENV CASSANDRA_ENDPOINT_SNITCH=GossipingPropertyFileSnitch
ENV CASSANDRA_LOCAL_DC=datacenter1
ENV CASSANDRA_DC=datacenter1

# Copy initialization scripts to the container

USER postgres

# Expose PostgreSQL port
EXPOSE 9042

# COPY short_links_app_db.sql /.
# COPY setup.sh /docker-entrypoint-initdb.d
