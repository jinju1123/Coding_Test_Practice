package com.lec.amigo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.amigo.vo.ChatVO;

public class ChatRowMapper implements RowMapper<ChatVO>{

	@Override
	public ChatVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChatVO chat = new ChatVO();
		
		chat.setIndex(rs.getInt("chat_index"));
		chat.setUser(rs.getString("chat_user"));
		chat.setContent(rs.getString("chat_content"));
		chat.setDate(rs.getDate("chat_reg_date"));
		chat.setRead_is(rs.getBoolean("read_is"));
		
		return chat;
	}
	
	
}
