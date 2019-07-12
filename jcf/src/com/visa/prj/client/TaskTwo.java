package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.visa.prj.entity.Product;

public class TaskTwo {
	public static void main(String[] args) {
		Product product = new Product(645, "Hp Laptop", 135000.00, "computer", 100);
		Map<String, Object> storage = storeInfo(product);
		System.out.println(storage);
	}
	
	public static Map<String, Object> storeInfo(Object o){
		Map<String, Object> map = new HashMap<>();
		Class clazz = o.getClass();
		Method[] methods = clazz.getMethods();
		
		for (Method method : methods) {
			if(method.getName().startsWith("get")) {
				try {
					map.put(method.getName().substring(3).toUpperCase(), method.invoke(o));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return map;
	}
}
