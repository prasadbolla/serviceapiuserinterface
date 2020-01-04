/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.adapter.SubscriptionInfoProxy;
import com.webinterface.service.domain.ResourceInfo;

/**
 * @author PRASADBolla
 *
 */
@Component
public class SubscriptionInfoServiceImpl {
	@Autowired
	private SubscriptionInfoProxy subscriptionInfoProxy;

	/**
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public ResourceInfo getSubscriptionInfo(String authorizationCode) {

		return subscriptionInfoProxy.getSubscriptionIdBasedOnAuth(authorizationCode);
	}
}
