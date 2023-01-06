package com.lec.board.vo;

import java.util.Date;

public class BoardVO {

	private int member_no;
	private String member_nick;
	private int ubd_no;
	private String ubd_dogType;
	private String ubd_subject;
	private String ubd_content;
	private int ubd_readcount;
	private Date ubd_regdate;
	private String ubd_file;
	private int ubd_like_cnt;
	
	
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public int getUbd_no() {
		return ubd_no;
	}
	public void setUbd_no(int ubd_no) {
		this.ubd_no = ubd_no;
	}
	public String getUbd_dogType() {
		return ubd_dogType;
	}
	public void setUbd_dogType(String ubd_dogType) {
		this.ubd_dogType = ubd_dogType;
	}
	public String getUbd_subject() {
		return ubd_subject;
	}
	public void setUbd_subject(String ubd_subject) {
		this.ubd_subject = ubd_subject;
	}
	public String getUbd_content() {
		return ubd_content;
	}
	public void setUbd_content(String ubd_content) {
		this.ubd_content = ubd_content;
	}
	public int getUbd_readcount() {
		return ubd_readcount;
	}
	public void setUbd_readcount(int ubd_readcount) {
		this.ubd_readcount = ubd_readcount;
	}
	public Date getUbd_regdate() {
		return ubd_regdate;
	}
	public void setUbd_regdate(Date ubd_regdate) {
		this.ubd_regdate = ubd_regdate;
	}
	public String getUbd_file() {
		return ubd_file;
	}
	public void setUbd_file(String ubd_file) {
		this.ubd_file = ubd_file;
	}
	public int getUbd_like_cnt() {
		return ubd_like_cnt;
	}
	public void setUbd_like_cnt(int ubd_like_cnt) {
		this.ubd_like_cnt = ubd_like_cnt;
	}
	
	@Override
	public String toString() {
		return "[member_no=" + member_no + ", member_nick=" + member_nick + ", ubd_no=" + ubd_no
				+ ", ubd_dogType=" + ubd_dogType + ", ubd_subject=" + ubd_subject + ", ubd_content=" + ubd_content
				+ ", ubd_regdate=" + ubd_regdate + "]";
	}
	

	
}
