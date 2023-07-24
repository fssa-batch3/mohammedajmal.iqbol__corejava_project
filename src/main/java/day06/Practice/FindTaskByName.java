package day06.Practice;

import java.util.ArrayList;

public class FindTaskByName {
	
	static String name;
	static ArrayList<String> array = new ArrayList<>();

	public FindTaskByName(String name, ArrayList<String> array) {
		this.name = name;
		this.array = array;
	}

	
	
public static boolean isThere() {
		for(String a : array){
			String index = a.replaceAll("\\s+\\d+", "");
			if(!name.equals(index)){
                 return false;
		     }
		}
		return true;
	}

}
