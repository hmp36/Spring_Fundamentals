package com.HP.login.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.login.models.User;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
	User findByEmail(String email);
}
