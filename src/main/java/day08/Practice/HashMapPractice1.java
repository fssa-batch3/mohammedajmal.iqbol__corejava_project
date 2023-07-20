package day08.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice1 {
	
	public static HashMap<String,Integer> Array(String line1) {
		
		HashMap<String,Integer> arrayNew = new HashMap<>();
		
		 String[] linesplit = line1.split(",");
			
			for(String i : linesplit) {
				arrayNew.put(i.toLowerCase().trim(),arrayNew.getOrDefault(i.toLowerCase().trim(), 0) + 1);
			}
			
			return arrayNew;
			
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
        String line1 = scan.nextLine();
        HashMap<String,Integer> arrayNew1 = new HashMap<>(Array(line1));
 		
		for(String arrayset : arrayNew1.keySet()) {
			Integer count = arrayNew1.get(arrayset);
			System.out.println(arrayset + " " + count);
       }
   }
}

