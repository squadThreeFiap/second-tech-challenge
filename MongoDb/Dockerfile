# Use the official MongoDB image
FROM mongo:latest

# Set the MongoDB environment variables to control the username, password, and database name
ENV MONGO_INITDB_ROOT_USERNAME=mongoadmin
ENV MONGO_INITDB_ROOT_PASSWORD=secret
ENV MONGO_INITDB_DATABASE=secondTechChallengeDB

# Expose the default MongoDB port
EXPOSE 27017

# Copy any custom scripts you want to run on initialization
# COPY ./mongo-init.js /docker-entrypoint-initdb.d/
