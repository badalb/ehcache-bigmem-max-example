package com.test.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

public class CacheManagerConfig {

	// Create a singleton CacheManager using defaults
	private static CacheManager manager = CacheManager
			.create("config/ehcache.xml");

	public static CacheManager getCacheManager() {
		if (manager == null) {
			manager = CacheManager.create();
		}
		return manager;
	}

	/*
	 * public static void createCache(String cacheName, int maxEntriesLocalHeap)
	 * {
	 * 
	 * // Create a Cache specifying its configuration. Cache newCacheInstance =
	 * new Cache(new CacheConfiguration(cacheName, maxEntriesLocalHeap)
	 * .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LRU) .eternal(true)
	 * //.timeToLiveSeconds(60) //.timeToIdleSeconds(30)
	 * //.diskExpiryThreadIntervalSeconds(0) .persistence( new
	 * PersistenceConfiguration() .strategy(Strategy.LOCALTEMPSWAP)));
	 * 
	 * manager.addCache(newCacheInstance); }
	 */

	public static Cache getCache(String cacheName) {
		Cache cache = manager.getCache(cacheName);
		return cache;
	}
}
