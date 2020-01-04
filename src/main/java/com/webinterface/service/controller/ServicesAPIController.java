package com.webinterface.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.webinterface.service.component.ClientInfoServiceImpl;
import com.webinterface.service.component.ResourceInfoServiceImpl;
import com.webinterface.service.component.SubscriptionInfoServiceImpl;
import com.webinterface.service.domain.ClientInfo;
import com.webinterface.service.domain.ResourceInfo;

@RestController
@CrossOrigin
public class ServicesAPIController {
	@Autowired
	public ClientInfoServiceImpl clientInfoServiceImpl;
	@Autowired
	public SubscriptionInfoServiceImpl subscriptionInfoServiceImpl;
	@Autowired
	public ResourceInfoServiceImpl resourceInfoServiceImpl;

	@GetMapping(value = "/clientInfo/{emailId}")
	public ResponseEntity<ClientInfo> getClientInfo(@PathVariable String emailId) {
		ClientInfo infoUIResponse = clientInfoServiceImpl
				.getClientInfo(emailId);
		if (infoUIResponse != null && infoUIResponse.getClientId() != null)
			return ResponseEntity.ok(infoUIResponse);

		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/subscriptions/subscription")
	public ResponseEntity<ResourceInfo> getSubscriptionIdBasedOnAuth(
			@RequestHeader String authorizationCode) {
		return ResponseEntity.ok(subscriptionInfoServiceImpl
				.getSubscriptionInfo(authorizationCode));

	}
	@GetMapping(value = "/services/service/{subscriptionId}")
	public ResponseEntity<ResourceInfo> getResourceInfoBasedOnAuth(
			@PathVariable String subscriptionId, @RequestHeader String authorizationCode) {
		return ResponseEntity.ok(resourceInfoServiceImpl
				.getResourceInfo(subscriptionId, authorizationCode));

	}
}