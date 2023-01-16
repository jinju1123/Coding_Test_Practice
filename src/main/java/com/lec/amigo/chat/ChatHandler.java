package com.lec.amigo.chat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.lec.amigo.dao.ChatDAO;
import com.lec.amigo.vo.UserVO;

public class ChatHandler extends TextWebSocketHandler{
	
	private static List<WebSocketSession> sessions = new ArrayList();
	
	//private static final Logger logger = LoggerFactory.getLogger(ChatServer.class);
	//ChatDAO chatDao = new ChatDAO();
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("서버연결");
		sessions.add(session);
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("메세지");		
		String senderId = getId(session);
		
		
		System.out.println(message);
		
		String msg = message.getPayload();
		
		String no;
		String roomIndex;
		String sendUser;
		String text;
			
		String[] strs = msg.split("#");
			if(strs!=null && strs.length==4) {
				no = strs[0];
				sendUser =strs[1];
				text = strs[2];
				roomIndex = strs[3];
		}
			
		
			
			
		
		
		
		//protocol:댓글작성자, 게시글작성자, 
		
		
		/*
		//msg에서 인덱스 번호 빼옴
		//인덱스번호에 맞는 리스트에 세션저장
		//해당 리스트를 더 큰 리스트에 저장
		
		List<List> ListSessionList = new ArrayList();
		System.out.println(msg+"메세지임");
		
		// 로그인할 때: 1#유저명
		// 대화  할 때: 2유저명#메세지
		
		String[] msgList;
		
		String msgl = msg.getPayload();
		
		/*
		for(int i=0, i++;, :i<4) {
			msgl.split("#");
		}
		
		int index = msg.indexOf("#", 2);
		String no = msg.substring(0, 1); 
		String user = msg.substring(2, index);
		
		String txt = msg.substring(index+1);
		
		int txtIndex = txt.indexOf("#",1);
		int roomindex = Integer.parseInt(txt.substring(txtIndex+1));
			
		if(txt.contains("#")) {
			txt = txt.substring(0,txtIndex);	
		}		
		
		/*
		if(index2>0) {
		txt = msg.substring(index + 1, index2);
		chat_index = Integer.parseInt(msg.substring(index2+1));	
		chatDao.insertChat(chat_index, user, txt);
		}else {
		txt = msg.substring(index+1);
		}
		
		*/
		
		/*
		//session.getBasicRemote().sendObject(txt);
		//방에 인덱스 삽입
		
		chatDao.setRoom(session, roomindex);
		
		//user+message형태로 오나보다
		System.out.println("내 세션아이디:"+session.getId());
		
		List<String> idList = chatDao.getSessionsId(roomindex);
		//룸인덱스를 통해 해당 인덱스의 idList를 얻어왔음
		
		//이 각각의 아이디와 sessionList의 각각의 session의 아이디가 일치하면 문자 보내면 됨
		
		
		
			
		
		if (no.equals("1")) {
			// 누군가 접속 > 1#아무개
			
			for(String id:idList) {
				for (Session s : list) {
					
					System.out.println("세션의 아이디 확인용"+s.getId());
					if(s.getId().equals(id)) {
						if (s != session) { // 현재 접속자가 아닌 나머지 사람들				
							try {
								s.getBasicRemote().sendText("1#" + user + "#");
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			
		
			
			
			
		} else if (no.equals("2")) {
			chatDao.insertChat(roomindex, user, txt);
			
			
			for(String id:idList) {
				
			
			// 누군가 메세지를 전송
			for (Session s : list) {
				
				if(id.equals(s.getId())) {
					if (s != session) { // 현재 접속자가 아닌 나머지 사람들							
						try {
							System.out.println("2#" + user + ":" + txt);
							s.getBasicRemote().sendText("2#" + user +"#" + txt);
						} catch (IOException e) {
							e.printStackTrace();
						}
					
					}
				}
				
			}
			}
		} else if (no.equals("3")) {
			
			
			for(String id:idList) {
			// 누군가 접속 > 3#아무개
				for (Session s : list) {
					
					if(id.equals(s.getId())) {
						if (s != session) { // 현재 접속자가 아닌 나머지 사람들
							try {
								s.getBasicRemote().sendText("3#" + user + "#");
							} catch (IOException e) {
								e.printStackTrace();
							}
						}	
					}
				}
			
			}
			sessions.remove(session);
			
		}
		*/
		
		
	}
	
	private String getId(WebSocketSession session) {
		Map<String, Object> httpSession = session.getAttributes();
		
		UserVO loginUser = (UserVO)httpSession.get("힝");
		
		if(loginUser!=null) {
			return session.getId();
		}else return loginUser.getUser_name();
		
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		
	}
}
