/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.adapter.ResourceInfoProxy;
import com.webinterface.service.domain.ResourceInfo;

/**
 * @author PRASADBolla
 *
 */
@Component
public class ResourceInfoServiceImpl {
	@Autowired
	private ResourceInfoProxy resourceInfoProxy;

	/**
	 * @param subscriptionId
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public ResourceInfo getResourceInfo(String subscriptionId,
			String authorizationCode) {

		return resourceInfoProxy.getServiceInfoBySubscriptionId(subscriptionId,
				authorizationCode);
	}
}
