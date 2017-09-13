package com.saral.training.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

	
	
	public static void main(String[] args) {

		Map<User, String> map = new HashMap<User, String>();
		System.out.println("created map");
		map.put(null, "xyz");
		map.put(new User(), "xy");
	
		
		map.toString();
		for(User s: map.keySet()){
			System.out.println("map iteration");
			System.out.println(map.get(s));
		}
		/*for(Map.Entry<String, String> ent:map.entrySet()){
			
		}*/
		
		
	}

}
