package com.taobao.top.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.top.Constants;

/**
 * 符合TOP习惯的纯字符串字典结构。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TopHashMap extends HashMap<String, String> {

	private static final long serialVersionUID = -1277791390393392630L;

	public TopHashMap() {
		super();
	}

	public TopHashMap(Map<? extends String, ? extends String> m) {
		super(m);
	}

	public String put(String key, Object value) {
		String strValue;

		if (value == null) {
			strValue = null;
		} else if (value instanceof String) {
			strValue = (String) value;
		} else if (value instanceof Integer) {
			strValue = ((Integer) value).toString();
		} else if (value instanceof Long) {
			strValue = ((Long) value).toString();
		} else if (value instanceof Boolean) {
			strValue = ((Boolean) value).toString();
		} else if (value instanceof Date) {
			DateFormat format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
			strValue = format.format((Date) value);
		} else {
			strValue = value.toString();
		}

		return this.put(key, strValue);
	}

	public String put(String key, String value) {
		if (StrUtils.areNotEmpty(key, value)) {
			return super.put(key, value);
		} else {
			return null;
		}
	}

}
