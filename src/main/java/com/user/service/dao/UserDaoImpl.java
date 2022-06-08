package com.user.service.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.user.service.model.User;
import com.user.service.queries.UserServiceQueries;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	NamedParameterJdbcTemplate template;  	
	
	@Override
	public String getUserNameById(int id) {
		Map<String,Object> paramMap=new HashMap<String,Object>();  
		paramMap.put("id",id);
		return template.queryForObject(UserServiceQueries.GET_USER_BY_ID, paramMap, String.class);
	}

}
