package com.swifty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swifty.dao.UserDao;
import com.swifty.domain.User;

@Service
public class UserServiceImpl implements UserService {

	
	  @Autowired  
	  private UserDao userDao;  

	    public User selectUserById(Integer userId) {  
	        return userDao.selectUserById(userId);  

	    }  
}
