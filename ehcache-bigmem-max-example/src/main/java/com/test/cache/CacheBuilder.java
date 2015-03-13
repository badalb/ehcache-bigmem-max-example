package com.test.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

public class CacheBuilder {

	public static void main(String[] args) {
		pupolateCache();
	}

	private static void pupolateCache() {

		Cache cache = CacheManagerConfig.getCache("myBigMemoryMaxStore");

		Employee emp = new Employee();
		emp.setfName("John");
		emp.setlName("Terry");
		emp.setSalary(1000);

		Element element = new Element("key1", emp);
		cache.put(element);

		Employee emp1 = new Employee();
		emp1.setfName("Eden");
		emp1.setlName("Hazard");
		emp1.setSalary(2000);

		Element element1 = new Element("key2", emp1);
		cache.put(element1);

		Employee emp2 = new Employee();
		emp2.setfName("Arjen");
		emp2.setlName("Robben");
		emp2.setSalary(3000);

		Element element2 = new Element("key3", emp2);
		cache.put(element2);
	}

}
