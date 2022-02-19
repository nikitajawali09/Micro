package com.users.dao;

import com.user.entity.UserEntity;

public interface UserDao {

	public UserEntity searchByUserId(Long userId);
}
