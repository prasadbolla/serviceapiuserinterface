/**
 * 
 */
package com.webinterface.service.component.mapper;

import java.util.ArrayList;
import java.util.List;

import com.webinterface.service.domain.Category;
import com.webinterface.service.domain.GetServiceInfoResponse;
import com.webinterface.service.domain.ResourceInfo;
import com.webinterface.service.utility.CommonUtil;

/**
 * @author PRASADBolla
 *
 */
public class ServiceResponseMapper {
	//to be completed
	public static GetServiceInfoResponse mapper(ResourceInfo resourceInfo) {
		if (resourceInfo != null && CommonUtil.isEmptyArray(resourceInfo.getValue())) {
			List<Category> categories = new ArrayList<Category>();
			for(int i=0; i < resourceInfo.getValue().length; i++){
				
			}
			GetServiceInfoResponse getServiceInfoResponse = new GetServiceInfoResponse();
		}
		return null;
	}
}
