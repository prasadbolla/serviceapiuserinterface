/**
 * 
 */
package com.webinterface.service.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRASADBolla
 *
 */
public class GetServiceInfoResponse {
public List<Category> categories;

public GetServiceInfoResponse(List<Category> categories) {
	this.categories=categories;
}

public GetServiceInfoResponse() {
	// TODO Auto-generated constructor stub
}

/**
 * @return the categories
 */
public List<Category> getCategories() {
	if(categories == null)
		categories = new ArrayList();
	return categories;
}
}
