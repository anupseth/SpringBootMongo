package com.example.SpringBootMongo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.SpringBootMongo.model.Payload;
import com.example.SpringBootMongo.model.repo.PayloadRepo;

@RestController
public class PayloadController {
	
	@Autowired
	private PayloadRepo payloadRepo;
	
	@PostMapping("/savePayload")
	public Payload savePayloadToDb(@RequestBody Payload payload) {
		
		Payload savePayload = payloadRepo.save(payload);
		
		return savePayload;
	}
	
	@Transactional
	@PutMapping("/processDocs")
	public List<Payload> processAllInProgressDoc(){
		
		List<Payload> payloadByStatusList = payloadRepo.getByStatus("inprogress");
		
		payloadByStatusList.forEach((payload) -> {
			payload.setData(payload.getData() + "  : processed data");
			payload.setStatus("complete");
			payloadRepo.save(payload);
		});
		
		return payloadByStatusList;
	}
	
}
