package com.webinterface.service.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.webinterface.service.domain.ClientInfo;

@FeignClient(contextId = "clientInfoClient",name="externalgetserviceapi", url="http://52.228.102.206:80")
@Component
public interface ClientInfoProxy {
	@GetMapping("/clientInfos/clientInfo/{emailId}")
	public ClientInfo getClientInfo(@PathVariable("emailId") String emailId);

}