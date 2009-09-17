﻿package com.taobao.top.domain;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 商品搜索结果。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ItemSearch extends BaseObject {

	/** 商品列表 */
	@JsonProperty("item_list")
	private List<Item> items;

	/** 商品分类列表 */
	@JsonProperty("category_list")
	private List<ItemCategory> itemCats;

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<ItemCategory> getItemCats() {
		return this.itemCats;
	}

	public void setItemCats(List<ItemCategory> itemCats) {
		this.itemCats = itemCats;
	}

}
