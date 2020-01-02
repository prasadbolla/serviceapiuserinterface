/**
 * 
 */
package com.webinterface.service.service;

import java.util.HashMap;

import com.webinterface.service.domain.ClientInfo;

/**
 * @author PRASADBolla
 *
 */
public class ClientInfoRepository {
 public static HashMap<String, ClientInfo> clientInfoHashMap = new HashMap<String, ClientInfo>();
 static{
	 clientInfoHashMap.put("miltonapplebuyers.onmicrosoft.com", new ClientInfo("8418ad51-113c-49dd-9b5b-be264b5d8eec", "h-_xfS9yifq6I_aZdLfD.aIoi1fzqtI5", "32161c04-7d4b-4c08-9016-fb826fed8909"));
	 clientInfoHashMap.put("venuamanchaoutlook.onmicrosoft.com", new ClientInfo("6b4ab6d3-56bf-4c5a-bee3-3bec45b317b7", "RWiJH./p.pC:SBTYFjQwJQ2kflmBu222", "4ef33c2d-f3ca-4762-86ae-68946432666f"));
 }
 
 public static ClientInfo getClinetInfo(String emailId){
	 String domain = emailId .substring(emailId .indexOf("@") + 1);
	 return clientInfoHashMap.get(domain);
 }
 public static void main(String[] a){
	 ClientInfoRepository client = new ClientInfoRepository();
	 ClientInfo c = client.getClinetInfo("prasadbolla@venuamanchaoutlook.onmicrosoft.com");
	 System.out.println("hello");
 }
}
