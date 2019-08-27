package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 通过订单id获取订单信息
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	/**
	 * 增加订单
	 * @param order
	 */
	void addOrder(Order order);
}
