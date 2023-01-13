package com.lec.amigo.chat;

import java.io.IOException;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lec.amigo.dao.ChatDAO;
import com.lec.amigo.vo.ChatVO;

@ServerEndpoint("/chatserver")
public class ChatServer{
	
	// 현재 채팅 서버에 접속한 클라이언트(WebSocket Session) 목록
	// static 붙여야함!!
	private static List<Session> list = new ArrayList<Session>();
	private static final Logger logger = LoggerFactory.getLogger(ChatServer.class);
	
	ChatDAO chatDao = new ChatDAO();
	
	private void print(String msg) {
		System.out.printf("[%tT] %s\n", Calendar.getInstance(), msg);
	}
	
	@OnOpen
	public void handleOpen(Session session) {
		print("클라이언트 연결");
		list.add(session);
		
		 // 접속자 관리(****)
	}
	
	@OnMessage
	public void handleMessage(String msg, Session session) {
		
		
		//msg에서 인덱스 번호 빼옴
		//인덱스번호에 맞는 리스트에 세션저장
		//해당 리스트를 더 큰 리스트에 저장
		
		List<List> ListSessionList = new ArrayList();
		System.out.println(msg+"메세지임");
		
		// 로그인할 때: 1#유저명
		// 대화  할 때: 2유저명#메세지		
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
			list.remove(session);
		}
		
	}
	
	@OnClose
	public void handleClose(Session session) {
		list.remove(session);
		System.out.println("방나가기!!!!");
	}
	
	@OnError
	public void handleError(Throwable t) {
		
	}

}