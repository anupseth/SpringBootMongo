package com.example.SpringBootMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Payload")
public class Payload {
	
	@Id
	private String uuid;
	
	private String status;
	
	private String data;
	
	

}
