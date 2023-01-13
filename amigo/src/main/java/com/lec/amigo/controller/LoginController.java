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
	public String login(UserVO vo) {	
		return "view/login/login_form.jsp"; 
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login (UserVO userVO, UserDAO userDAO, HttpSession sess) {
		
		UserVO user = userDAO.getUser(userVO);
		
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
		
		if(user.getUser_email().equalsIgnoreCase(userVO.getUser_email())) {
			sess.setAttribute("user", user);
			sess.setAttribute("perPage", 10);
			if(user.getUser_type().equalsIgnoreCase("A")) {
				sess.setAttribute("isAdmin", true);
			} else {
				sess.setAttribute("isAdmin", false);
			}
			return "view/login/login_success.jsp";
		} else {
			sess.setAttribute("isLoginSuccess", false);
			return "view/login/login_form.jsp";
		}

	}
	
}
