package day06.Practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayList {
  public static void main(String[] args) {
	  
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
