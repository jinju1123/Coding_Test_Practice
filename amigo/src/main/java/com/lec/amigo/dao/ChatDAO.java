package com.lec.amigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.amigo.chat.JDBCUtility.JDBCUtility;
import com.lec.amigo.vo.ChatVO;
import com.lec.amigo.vo.UserVO;

@Repository("chatdao")
public class ChatDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int idCheck(String id) {
		
		boolean check = false;
		Connection conn = JDBCUtility.getConnection();
		
		int asd = 0;
		
		String sql = "select * from chatMessage where chat_user=?";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				asd = rs.getInt("chat_index");
				JDBCUtility.commit(conn);
				return asd;
			}else {
				JDBCUtility.rollback(conn);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, rs, pstmt);
		}
		
			
		return asd;
	}
	
	
	public List<ChatVO> getChatList(int index){
		List<ChatVO> chatList = new ArrayList<ChatVO>();
		Connection conn = JDBCUtility.getConnection();
		String sql = "select * from chatMessage where chat_index=?";
		
		ResultSet rs =null;
		PreparedStatement pstmt=null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, index);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ChatVO chat = new ChatVO();
				chat.setIndex(rs.getInt("chat_index"));
				chat.setUser(rs.getString("chat_user"));
				chat.setContent(rs.getString("chat_content"));
				chat.setDate(rs.getDate("chat_reg_date"));
				chat.setRead_is(rs.getBoolean("read_is"));
				chatList.add(chat);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, rs, pstmt);
		}
		

	
		return chatList;
	}
	
	public void insertChat(int index, String user, String content) {
		
		Connection conn = JDBCUtility.getConnection();
		String sql = "insert into chatMessage(chat_index, chat_user, chat_content, chat_reg_date, read_is) values(?,?,?,SYSDATE(),0)";
		
		int row = 0;
		PreparedStatement pstmt=null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, index);
			pstmt.setString(2, user);
			pstmt.setString(3, content);
			row = pstmt.executeUpdate();
			
			if(row>0) {
			System.out.println(row+"건이 업데이트됐습니다");
			System.out.println("디비 삽입성공!");
			JDBCUtility.commit(conn);
			}else {
				JDBCUtility.rollback(conn);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, null, pstmt);
		}
		
		
	}
	
	public void setRoom(Session session, int roomNo){	
		String sql = "insert into chatRoom values(?,?)";
		Connection conn = JDBCUtility.getConnection();
		PreparedStatement pstmt = null;
		String sessionId = session.getId();
		int row=0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, roomNo);
			pstmt.setString(2, sessionId);
			
			
			row = pstmt.executeUpdate();
			
			if(row>0) {
				System.out.println(row+"건 삽입 성공!");
				JDBCUtility.commit(conn);
			}else {
				System.out.println("실패");
				JDBCUtility.rollback(conn);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, null, pstmt);
		}
		
	}
	
	public List<String> getSessionsId(int roomNo) {
		
		String sql = "select session_id from chatRoom where chat_index=?";
		Connection conn = JDBCUtility.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		List<String> idList = new ArrayList();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, roomNo);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				idList.add(id);
		
			}
			return idList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, rs, pstmt);
		}
		
		
		
		 
		return null;
	}
	
	
}
