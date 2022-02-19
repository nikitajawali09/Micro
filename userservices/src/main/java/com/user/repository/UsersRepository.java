package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.entity.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long>{

	@Query(value = "select p from UserEntity p where p.userId =:userId")
	public UserEntity searchByUserId(
			@Param("userId") Long userId
			);
	
}
