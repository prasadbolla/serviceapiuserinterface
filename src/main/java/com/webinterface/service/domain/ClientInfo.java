/**
 * 
 */
package com.webinterface.service.domain;

/**
 * @author PRASADBolla
 *
 */
public class ClientInfo {
public String clientId;
public String clientSecret;
public String tentId;
/**
 * 
 */
public ClientInfo() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the clientId
 */
public String getClientId() {
	return clientId;
}
/**
 * @param clientId the clientId to set
 */
public void setClientId(String clientId) {
	this.clientId = clientId;
}
/**
 * @param clientId
 * @param clientSecret
 * @param tentId
 */
public ClientInfo(String clientId, String clientSecret, String tentId) {
	super();
	this.clientId = clientId;
	this.clientSecret = clientSecret;
	this.tentId = tentId;
}
/**
 * @return the clientSecret
 */
public String getClientSecret() {
	return clientSecret;
}
/**
 * @param clientSecret the clientSecret to set
 */
public void setClientSecret(String clientSecret) {
	this.clientSecret = clientSecret;
}
/**
 * @return the tentId
 */
public String getTentId() {
	return tentId;
}
/**
 * @param tentId the tentId to set
 */
public void setTentId(String tentId) {
	this.tentId = tentId;
}
}
