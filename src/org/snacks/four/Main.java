package org.snacks.four;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Geena");
		arrayList.add("Geeno");
		arrayList.add("Geene");
		arrayList.add("Geeni");
		arrayList.add("Geenu");
		arrayList.add("Geenatti");
		arrayList.add("Geenotti");
		arrayList.add("Geenetti");
		arrayList.add("Geenitti");
		arrayList.add("Geenutti");
		
		for (String name : arrayList) {
			for(int i = 0; i < name.length(); i++) {
				  char lettera = name.charAt(i);
				    break;
			}
		}
	
	}

}
