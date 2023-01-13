package com.lec.amigo.dao;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.amigo.mapper.UserRowMapper;
import com.lec.amigo.vo.UserVO;

@Repository("userDAO")
@PropertySource("classpath:config/usersql.properties")
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment environment;
	
	private String sql="";
	private String selectByEmail ="";
	
	@PostConstruct
	public void getSqlPropeties() {
		selectByEmail = environment.getProperty("selectByEmail");
	}

	public UserVO getUser(UserVO user) {
		Object[] args = { user.getUser_email() };
		return (UserVO) jdbcTemplate.queryForObject(selectByEmail, args, new UserRowMapper());
	}

	
	
}
