package org.snacks.four;

import java.util.ArrayList;

public class Snack4 {

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
		
		boolean swap = false;
		
		do {
			
			for(int i = 1; i < arrayList.size(); i++) {
				String firstWord = arrayList.get(i);
				String secondWord = arrayList.get(i-1);
				if (firstWord.compareTo(secondWord) > 0) {
					arrayList.add(i, secondWord);
					arrayList.add(i-1, firstWord);	
					swap = false;
				} else {
					swap = true;
				}
			}
			
		} while (swap);
	}

}
