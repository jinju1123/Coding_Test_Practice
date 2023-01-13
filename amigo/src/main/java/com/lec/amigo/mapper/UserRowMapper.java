package com.lec.amigo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.amigo.vo.UserVO;

public class UserRowMapper implements RowMapper<UserVO>{

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVO user = new UserVO();
		user.setUser_no(rs.getInt("user_no"));
		user.setUser_type(rs.getString("user_type"));
		user.setUser_nick(rs.getString("user_nick"));
		user.setUser_name(rs.getString("user_name"));
		user.setUser_email(rs.getString("user_email"));
		user.setUser_pw(rs.getString("user_pw"));
		user.setUser_addr(rs.getString("user_addr"));
		user.setUser_photo(rs.getString("user_photo"));
		return user;
	}
	
	

}
