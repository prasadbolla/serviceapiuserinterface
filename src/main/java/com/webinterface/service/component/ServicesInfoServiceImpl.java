/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.adapter.ServicesProxy;
import com.webinterface.service.component.mapper.ServiceResponseMapper;
import com.webinterface.service.domain.GetServiceInfoResponse;

/**
 * @author PRASADBolla
 *
 */
@Component
public class ServicesInfoServiceImpl {
	@Autowired
	private ServicesProxy servicesProxy;

	/**
	 * @param subscriptionId
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public GetServiceInfoResponse getServiceInfo(String subscriptionIdentifier,
			String authorizationCode) {

		return ServiceResponseMapper.mapper(servicesProxy
				.getServicesBySubscriptionIdentifier(subscriptionIdentifier, authorizationCode));
	}
}
