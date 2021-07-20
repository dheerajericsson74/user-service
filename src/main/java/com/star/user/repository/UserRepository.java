package com.star.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User getByUserId(Long userId);

}
