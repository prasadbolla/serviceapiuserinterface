package com.webinterface.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webinterface.service.domain.ClientInfo;
import com.webinterface.service.service.ClientInfoRepository;
 
@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class TestController {
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getTest()
    {
        return new ResponseEntity<>("{\"message\":\"App running!\"}", HttpStatus.OK);
    }
    
	@GetMapping(value = "/clientInfo/{emailId}")
	public ResponseEntity<ClientInfo> getClientInfo(
			@PathVariable String emailId) {
		ClientInfoRepository clientInfoRepository = new ClientInfoRepository();
		ClientInfo infoUIResponse = clientInfoRepository
				.getClinetInfo(emailId);
		if(infoUIResponse != null && infoUIResponse.getClientId() != null)
		return ResponseEntity.ok(infoUIResponse);
		
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
}