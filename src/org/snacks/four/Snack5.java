package org.snacks.four;

import java.util.HashMap;

public class Snack5 {
	
	public static void checkChiaveDuplicata(HashMap<String, String> map, String value){
		
		if (map.containsKey(value)) {
			System.out.println("elemento esistente");
		} else {
			System.out.println("puoi aggiungere l'elemento");
		}
		
	}

	public static void main(String[] args) {
	
			HashMap<String,String> map = new  HashMap<String,String>();
			
			map.put("tizio", "Geeno");
			map.put("tizia", "Geena");
			map.put("tizie", "Geene");
			map.put("tiziu", "Geenu");
			
			Snack5.checkChiaveDuplicata(map, "tizio");
			
	}

}
