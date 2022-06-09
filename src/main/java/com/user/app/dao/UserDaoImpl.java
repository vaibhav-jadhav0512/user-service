package com.user.app.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.user.app.exception.UserNotFoundException;
import com.user.app.queries.UserServiceQueries;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	NamedParameterJdbcTemplate template;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public String getUserNameById(int id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		String name = null;
		try {
			name = template.queryForObject(UserServiceQueries.GET_USER_BY_ID, paramMap, String.class);
		} catch (EmptyResultDataAccessException e) {
			LOGGER.error("User not found");
		}
		if (name == null)
			throw new UserNotFoundException("User not found");
		return name;
	}

}
