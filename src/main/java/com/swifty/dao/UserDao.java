package com.swifty.dao;

import com.swifty.domain.User;

public interface UserDao {

	/** * @param userId * @return User */
    public User selectUserById(Integer userId); 
}
