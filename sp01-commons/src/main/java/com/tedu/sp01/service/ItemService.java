package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 根据订单id获取商品信息
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少商品数量
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
