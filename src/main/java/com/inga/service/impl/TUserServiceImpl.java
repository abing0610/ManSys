package com.inga.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.inga.bean.TUser;
import com.inga.dao.TUserDao;
import com.inga.service.TUserService;

/**
 * service实现类
 * @author user
 *
 */
@Service
public class TUserServiceImpl implements TUserService {

	@Resource
	private TUserDao userDao;


	/**
	 * 分页功能模块
	 * @param tUser
	 * @param page
	 * @param rows
	 * @return
	 */

	public List<TUser> selectByTUser(TUser tUser, int page, int rows) {

//		PageHelper.startPage(page , rows);

		List<TUser> list = userDao.selectByTUser(tUser);

		return list;
	}

	/**
	 * 测试分页是否能够使用
	 * @param id
	 * @return
	 */
	public  List<TUser> getUserByid2(String id){

//		Pageable pageable = new Pageable(0, 5);
//
//		Page<TUser> userPage = userDao.getUserById(pageable);
//
//		List<TUser> list = new ArrayList<TUser>();
//		list = userPage.getContent();

		return  null;
	}

	/**
	 * 获取tuser信息，使用了Cacheable信息,用的是spring的缓存
	 * @param id
	 * @return
	 */
//	@Cacheable(value = "userCache")
	public List<TUser> getUserById(String id) {
		// TODO Auto-generated method stub

//		Pageable pageable = new Pageable(1, 5);
//		Page<TUser> userPage = userDao.getUserById(pageable);
//		List<TUser> list = new ArrayList<TUser>();
//		list = userPage.getContent();

//		List<TUser> list = new ArrayList<TUser>();
//		list = userDao.getUserById();
		return null;
	}

	public List<Map<String, String>> queryAddress() {
		// TODO Auto-generated method stub
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		list = userDao.queryAddress();
		
		return list;
	}


	public boolean delUserById(String id) {
		// TODO Auto-generated method stub
		boolean b = userDao.delUserById(id);
		System.out.println(" b : " + b);
		return b;
	}

	public boolean addUser(TUser tuser) {
		// TODO Auto-generated method stub
		
		boolean b = userDao.addUser(tuser);
		
		return b;
	}
	
	

}
