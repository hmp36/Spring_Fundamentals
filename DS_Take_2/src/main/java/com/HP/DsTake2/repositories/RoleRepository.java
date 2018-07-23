package com.HP.DsTake2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.DsTake2.models.Role;

@Repository 												
public interface RoleRepository extends CrudRepository<Role,Long>{
		
}
