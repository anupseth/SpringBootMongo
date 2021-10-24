package com.example.SpringBootMongo.model.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringBootMongo.model.Payload;

public interface PayloadRepo extends MongoRepository<Payload, String> {
	
	public List<Payload> getByStatus(String status);

}
