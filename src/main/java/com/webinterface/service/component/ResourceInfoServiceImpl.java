/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.adapter.ResourceInfoProxy;
import com.webinterface.service.adapter.ServicesProxy;
import com.webinterface.service.domain.ResourceGroupList;
import com.webinterface.service.domain.ResourceInfo;

/**
 * @author PRASADBolla
 *
 */
@Component
public class ResourceInfoServiceImpl {
	@Autowired
	private ServicesProxy servicesProxy;
	
	@Autowired
	private ResourceInfoProxy resourceInfoProxy;

	/**
	 * @param subscriptionIdentifier
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public ResourceInfo getResourceInfo(String subscriptionIdentifier,
			String authorizationCode) {

		return servicesProxy.getServicesBySubscriptionIdentifier(subscriptionIdentifier, authorizationCode);
	}
	
	public ResourceGroupList getResourceGroups(String subscriptionIdentifier,
			String authorizationCode) {

		return resourceInfoProxy.getResourceGroupsBySubscriptionId(subscriptionIdentifier, authorizationCode);
	}
}
