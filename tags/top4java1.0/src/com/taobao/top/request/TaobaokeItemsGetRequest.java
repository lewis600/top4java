package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.items.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeItemsGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 用户昵称 */
	private String nick;

	/** 商品标题中包含的关键字 */
	private String keyword;

	/** 商品所属分类编号 */
	private Long cid;

	/** 起始价格 */
	private String startPrice;

	/** 最高价格 */
	private String endPrice;

	/** 是否自动发货 */
	private Boolean autoSend;

	/** 商品所在地 */
	private String area;

	/** 卖家信用 */
	private String startCredit;

	/** 卖家信用 */
	private String endCredit;

	/** 默认排序 */
	private String orderBy;

	/** 是否查询消保卖家 */
	private Boolean guarantee;

	/** 起始佣金比率选项 */
	private String startCommissionRate;

	/** 最高佣金比率选项 */
	private String endCommissionRate;

	/** 起始累计推广量选项 */
	private String startCommissionNum;

	/** 最高累计推广量选项 */
	private String endCommissionNum;

	/** 页码 */
	private Integer pageNo;

	/** 每页返回结果数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public void setAutoSend(Boolean autoSend) {
		this.autoSend = autoSend;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setGuarantee(Boolean guarantee) {
		this.guarantee = guarantee;
	}

	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}

	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}

	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}

	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.taobaoke.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("keyword", this.keyword);
		params.put("cid", this.cid);
		params.put("start_price", this.startPrice);
		params.put("end_price", this.endPrice);
		params.put("auto_send", this.autoSend);
		params.put("area", this.area);
		params.put("start_credit", this.startCredit);
		params.put("end_credit", this.endCredit);
		params.put("sort", this.orderBy);
		params.put("is_guarantee", this.guarantee);
		params.put("start_commissionRate", this.startCommissionRate);
		params.put("end_commissionRate", this.endCommissionRate);
		params.put("start_commissionNum", this.startCommissionNum);
		params.put("end_commissionNum", this.endCommissionNum);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}