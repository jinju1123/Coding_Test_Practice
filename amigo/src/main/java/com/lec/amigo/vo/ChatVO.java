package com.lec.amigo.vo;

import java.util.Date;

public class ChatVO {
	
	private int index;
	private String user;
	private String content;
	private Date date;
	private boolean read_is;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isRead_is() {
		return read_is;
	}
	public void setRead_is(boolean read_is) {
		this.read_is = read_is;
	}
	
	
	
}
