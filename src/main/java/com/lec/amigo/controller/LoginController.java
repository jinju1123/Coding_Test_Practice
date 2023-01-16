package com.lec.amigo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.amigo.dao.UserDAO;
import com.lec.amigo.impl.UserServiceImpl;
import com.lec.amigo.vo.UserVO;

@Controller
public class LoginController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(UserVO userVO) {	
		return "view/login/login_form.jsp"; 
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO userVO, UserDAO userDAO, HttpSession sess) {
		
		System.out.println("sadsad");
		System.out.println(userVO.getUser_email()+userVO.getUser_pw());
		
		UserVO user = userDAO.getUser(userVO.getUser_email());
		

		if(user == null) {
			sess.setAttribute("isLoginSuccess", false);
			return "view/login/login_form.jsp";
		}
		
		if(!user.getUser_pw().equals(userVO.getUser_pw())) {
			sess.setAttribute("matchedPassword", false);
			return "view/login/login_form.jsp";
		} else {
			sess.setAttribute("matchedPassword", true);
		}
		
		if(user.getUser_email().equals(userVO.getUser_email())) {
			sess.setAttribute("user", user);
			if(user.getUser_type().equals("A")) {
				sess.setAttribute("isAdmin", true);
			} else {
				sess.setAttribute("isAdmin", false);
			}
			return "view/main.jsp";
		} else {
			sess.setAttribute("isLoginSuccess", false);
			return "view/login/login_form.jsp";
		}
		
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "home.jsp";
	}
	
}
