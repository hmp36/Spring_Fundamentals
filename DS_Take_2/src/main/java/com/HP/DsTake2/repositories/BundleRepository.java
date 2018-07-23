package com.HP.DsTake2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HP.DsTake2.models.Bundle;

@Repository 												
public interface BundleRepository extends CrudRepository<Bundle,Long>{

	
		
}
