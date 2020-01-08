package com.webinterface.service.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.webinterface.service.domain.ResourceInfo;

@FeignClient(contextId = "servicesInfoClient", name = "externalgetserviceapi", url = "http://52.228.103.152:80")
@Component
public interface ServicesProxy {
	@GetMapping("services/service/{subscriptionIdentifier}")
	public ResourceInfo getServicesBySubscriptionIdentifier(@PathVariable("subscriptionIdentifier") String subscriptionIdentifier,
			@RequestHeader("authorizationCode") String authorizationCode);

}