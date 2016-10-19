package com.inga.service;

import java.util.List;
import java.util.Map;

import com.inga.bean.TUser;

/**
 * service
 * @author user
 *
 */
public interface TUserService {

	public List<TUser> selectByTUser(TUser tUser , int page , int rows);

	public List<TUser> getUserByid2(String id);

	public List<TUser> getUserById(String id);
	
	public List<Map<String, String>> queryAddress();
	
	public boolean delUserById(String id);
	
	public boolean addUser(TUser tuser);
	
}
