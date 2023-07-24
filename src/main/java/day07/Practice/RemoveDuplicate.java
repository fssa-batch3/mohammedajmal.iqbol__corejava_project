package day07.Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	
	/*
	Question#1: Create an ArrayList<Integer> of numbers with duplicate entries. 
	Use an HashSet<Integer> to remove the duplicates and display the Unique values
	*/

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(50);
		array.add(50);
		array.add(100);
		array.add(150);
		array.add(150);
		array.add(200);
		
		System.out.println("arrayList " + array);
		
		HashSet<Integer> array2 = new HashSet<>(array);
		
		System.out.println("HashSet " + array2);
		
		for(int i : array2) {
			System.out.println(i);
		}
		
	}
}
