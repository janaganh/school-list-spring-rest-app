package com.janagan.schoolapp.rest;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
 
public class MongoConfig 
{
  public @Bean Mongo mongo() throws Exception {
      return new Mongo("localhost");
  }

  public @Bean MongoTemplate mongoTemplate() throws Exception {
      return new MongoTemplate(mongo(), "schools");
  }



}