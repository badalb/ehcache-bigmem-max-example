package com.test.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

public class CacheClient {

	public static void main(String[] args) {

		Cache cache = CacheManagerConfig.getCache("myBigMemoryMaxStore");

		Element elm = cache.get("key1");
		Employee emp = (Employee) elm.getObjectValue();
		System.out.println(emp.getName() + ":" + emp.getSalary());

		Element elm1 = cache.get("key2");
		Employee emp1 = (Employee) elm1.getObjectValue();
		System.out.println(emp1.getName() + ":" + emp1.getSalary());

		Element elm2 = cache.get("key3");
		Employee emp2 = (Employee) elm2.getObjectValue();
		System.out.println(emp2.getName() + ":" + emp2.getSalary());

	}

}
