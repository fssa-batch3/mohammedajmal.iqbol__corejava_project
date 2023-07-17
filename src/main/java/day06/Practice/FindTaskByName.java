package day06.Practice;

import java.util.ArrayList;

public class FindTaskByName {
	
	String name;
	ArrayList<String> array = new ArrayList<>();

	public FindTaskByName(String name, ArrayList<String> array) {
		this.name = name;
		this.array = array;
	}
	
	public boolean isThere() {
		
		for(String a : array){
			String index = a.replaceAll("\\s+\\d+", "");
			if(name.contains(index)){
                  return true;
			}
		}
		
		return false;
	}
	
}
