package com.visa.prj.client;

import com.visa.prj.util.ArrayUtil;

public class SortClient {

	public static void main(String args[]) {
		String[] names = {"Calvin","George","Lee","Angelina","Brad"};
		
		ArrayUtil.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
