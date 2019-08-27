package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 根据用户ID获取用户信息
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	/**
	 * 增加用户积分
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);
}
