package com.HP.DsTake2.services;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.stereotype.Service;

import com.HP.DsTake2.models.Bundle;
import com.HP.DsTake2.repositories.BundleRepository;

@Service
public class BundleService {
	private static BundleRepository bundleRepository;

	public BundleRepository getPackageRepository() {
		return bundleRepository;
	}

	public void setPackageRepository(BundleRepository bundleRepository) {
		BundleService.bundleRepository = bundleRepository;
	}

	public static void select() {
	
	}

	public static void create(Bundle bundle){
		Repository.save(bundle);
		
	}
		


	
}