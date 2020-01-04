/**
 * 
 */
package com.webinterface.service.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webinterface.service.adapter.ClientInfoProxy;
import com.webinterface.service.domain.ClientInfo;

/**
 * @author PRASADBolla
 *
 */
@Component
public class ClientInfoServiceImpl {
	@Autowired
	private ClientInfoProxy clientInfoProxy;

	/**
	 * @param tenentId
	 * @param serviceType
	 * @return
	 */
	public ClientInfo getClientInfo(String emailId) {

		return clientInfoProxy.getClientInfo(emailId);
	}
}
