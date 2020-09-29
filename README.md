# Spring boot with kafka java
This template produced the User object on the kafka and consumed the same.


# Note
1. I used jsonSerializer for serializing the class and then send it to the kafka.
2. For consuming, I simply use the StringDeserializer
3. This application is up on the server on the port 9000.
4. Your bootstrap-servers is running on the port 9092

# Important
1. Please make sure that you already installed and run the zookeeper and kafka.
2. Since we are using the spring boot we don't need to create the Configuration classes for the serialisation and deserialization, just add your configuration in the application.yml
3. I used spring-kafka dependency to make this template



# How to run
1. Run the main class by right clicking on the Application class and click on the run.
2. Please install postman to produce the message by hitting the post request like this `localhost:9000/kafka/publish`
3. Now you published the User data and application already consumed your user data and provides you the logger info, for viewing this go to the console where your application is running.
  