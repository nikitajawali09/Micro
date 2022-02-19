package com.users.service;

import org.springframework.stereotype.Service;
import com.user.entity.UserEntity;

@Service
public interface UserService {
	
	public UserEntity searchByUserId(Long userId);
}
