package com.user.dao.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.entity.UserEntity;
import com.user.repository.UsersRepository;
import com.users.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	UsersRepository usersRepository;
	
	@Override
	@Transactional
	public UserEntity searchByUserId(Long userId) {
		UserEntity userEntity=null;
		try {
			userEntity=usersRepository.searchByUserId(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userEntity;
	}

	
}
