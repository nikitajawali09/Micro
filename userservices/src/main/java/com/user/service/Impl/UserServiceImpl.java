package com.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserEntity;
import com.users.dao.UserDao;
import com.users.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public UserEntity searchByUserId(Long userId) {
		UserEntity userEntity=userDao.searchByUserId(userId);
		return userEntity;
	}

	
}
