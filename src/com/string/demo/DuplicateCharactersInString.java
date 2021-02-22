package com.string.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String s = "India is my country";
		findDuplicateChar(s);

	}
	private static void findDuplicateChar(String s) {
		
		char[] charArray = s.toCharArray(); 
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (Character ch : charArray) {  
            if (m.containsKey(ch)) {  
                m.put(ch, m.get(ch) + 1);  
            } else {  
                m.put(ch, 1);  
            }  
        }  
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" is "+ entry.getValue());
			}
		}
		
		/*Set<Character> keys = m.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        } */ 		
		
	}

}

