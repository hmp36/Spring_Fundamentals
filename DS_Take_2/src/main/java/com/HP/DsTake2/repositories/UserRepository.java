package com.HP.DsTake2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.DsTake2.models.User;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
	User findByFirstName(String name);

	User findByEmail(String email);
}