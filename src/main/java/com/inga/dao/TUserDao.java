package com.inga.dao;

import java.util.List;
import java.util.Map;

import com.inga.bean.TUser;
import com.inga.utils.mybatis.MyBatisDao;

@MyBatisDao
public interface TUserDao {

	public List<TUser> selectByTUser(TUser tUser);
	
//	public Page<TUser> getUserById(Pageable Pageable);
	
	public List<Map<String, String>> queryAddress();
	
	public boolean delUserById(String id);
	
	public boolean addUser(TUser tuser);


}
