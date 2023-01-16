package com.lec.amigo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.amigo.vo.UserVO;
import com.lec.amigo.mapper.UserRowMapper;

@Repository("userDAO")
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment environment;
	
	private String selectByEmail = "select * from user where user_email=?";

	public UserVO getUser(String user_email) {
		Object[] args = { user_email };
		return (UserVO) jdbcTemplate.queryForObject(selectByEmail, args, new UserRowMapper());
	}

}
