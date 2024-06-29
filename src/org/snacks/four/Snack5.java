package org.snacks.four;

import java.util.HashMap;

public class Snack5 {
	
	public boolean checkChiaveDuplicata(HashMap<String, String> map, String value){
		
		return map.containsValue(value);
		
	}

	public static void main(String[] args) {
	
			HashMap<String,String> map = new  HashMap<String,String>();
			
			map.put("tizio", "Geeno");
			map.put("tizia", "Geena");
			map.put("tizie", "Geene");
			map.put("tiziu", "Geenu");
			
			
	}

}
