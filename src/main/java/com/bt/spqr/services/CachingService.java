package com.bt.spqr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CachingService {

	@Autowired
	CacheManager cacheManager;
	
	public void evictAllCaches() {
		System.out.println("Clearing Caches.");
	    cacheManager.getCacheNames().stream()
	      .forEach(cacheName -> cacheManager.getCache(cacheName).clear());
	}

	
	@Scheduled(fixedRate = 360000)
	public void evictAllcachesAtIntervals() {
		System.out.println("Automatic cache eviction called");
	    evictAllCaches();
	}
}
