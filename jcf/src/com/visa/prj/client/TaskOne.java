package com.visa.prj.client;

import java.util.HashSet;
import java.util.Set;

public class TaskOne {

	public static void main(String[] args) {
		String str = "we are the world we are the children";
		String[] str2 = str.split(" ");
		Set<String> unique = new HashSet<>();
		Set<String> duplicate = new HashSet<>();

		for (String s : str2) {
			if (!unique.add(s)) {
				duplicate.add(s);
			}
		}
		unique.removeAll(duplicate);
		System.out.println(unique);
		System.out.println(duplicate);

	}
}
