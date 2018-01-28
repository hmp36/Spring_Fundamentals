package com.HP.login_reg.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.login_reg.models.User;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
	User findByUsername(String name);
}