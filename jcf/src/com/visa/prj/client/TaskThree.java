package com.visa.prj.client;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskThree {

	public static void main(String[] args) {
		System.out.println(args);
		Map<String, Integer> frequency = getWordFrequency(args);
		System.out.println(frequency);
	}

	private static Map<String, Integer> getWordFrequency(String[] args) { 
		Map<String, Integer> frequency = new HashMap<>();
		for (String string : args) {
			if(frequency.get(string) == null) {
				frequency.put(string, 1);
			}
			else {
				frequency.put(string, frequency.get(string)+1);
			}
		}
		frequency = frequency.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e->e.getKey(), e->e.getValue(), (e1,e2)->e2, LinkedHashMap::new));
		return frequency;
	}

}
