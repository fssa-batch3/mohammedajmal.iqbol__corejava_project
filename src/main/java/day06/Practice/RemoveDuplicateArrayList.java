package day06.Practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayList {
	
	private String a;
	
	
  public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


public static void main(String[] args) {
	
	RemoveDuplicateArrayList r = new RemoveDuplicateArrayList();
	  
	  List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
//Add logic to remove the duplicate Array and 
//store the unique city name is an another ArrayList
		List<String> cityListNew = new ArrayList<String>();
		
		for(String city : cityList) {
			if(!cityListNew.contains(city)){
				cityListNew.add(city);
			}
		}
		
		System.out.println(cityListNew);
  }
}
