package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.list.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemsListGetRequest implements TopRequest {

	private String fields;
	private String iids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIids(String iids) {
		this.iids = iids;
	}

	public String getApiName() {
		return "taobao.items.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("iids", this.iids);
		return params;
	}

}