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
		boolean match = false;
		for(String a : array){
			String index = a.replaceAll("\\s+\\d+", "");
			if(!name.contains(index)){
                  match = true;
			}
		}
		return match;
	}
}
