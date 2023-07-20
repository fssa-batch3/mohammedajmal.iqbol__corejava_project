package day09.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColleactionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers in a line: ");
		String line1 = scan.nextLine();
		String[] linesplit = line1.split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<linesplit.length; i++) {
			arr.add(Integer.parseInt(linesplit[i]));
		}
		
		Collections.sort(arr);
		
		System.out.println("Sorted list: " + arr);
	}

}
