package day08.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice1 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> arrayNew = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
        String line1 = scan.nextLine();
        
        String[] linesplit = line1.split(",");
		
		for(String i : linesplit) {
			arrayNew.put(i.toLowerCase().trim(),arrayNew.getOrDefault(i.toLowerCase().trim(), 0) + 1);
		}
		
 		
		for(String arrayset : arrayNew.keySet()) {
			Integer count = arrayNew.get(arrayset);
			System.out.println(arrayset + " " + count);
       }
   }
}

