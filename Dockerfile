# Set the base image
FROM adoptopenjdk:16-jre-hotspot

# Set the working directory to /app
WORKDIR /app


COPY booklist.csv /app


# Copy the LibraryBook.jar file to the container
COPY LibraryBook11.jar /app

# Expose the port that the application will listen on
EXPOSE 9090

# Define the command to run when the container starts
CMD ["java", "-jar", "LibraryBook11.jar"]