package com.user.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.app.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public String getUserNameById(int id) {
		return userDao.getUserNameById(id);
	}

}
