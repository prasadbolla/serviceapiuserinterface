package com.webinterface.service.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.webinterface.service.domain.ResourceGroupList;
import com.webinterface.service.domain.ResourceInfo;

@FeignClient(contextId = "resourceInfoClient", name = "externalgetserviceapi", url = "http://localhost:8081")
@Component
public interface ResourceInfoProxy {
	@GetMapping("services/service/{subscriptionId}")
	public ResourceInfo getServiceInfoBySubscriptionId(@PathVariable("subscriptionId") String subscriptionId,
			@RequestHeader("authorizationCode") String authorizationCode);
	
	@GetMapping("services/service/{subscriptionId}/resourceGroups")
	public ResourceGroupList getResourceGroupsBySubscriptionId(@PathVariable("subscriptionId") String subscriptionId,
			@RequestHeader("authorizationCode") String authorizationCode);

}