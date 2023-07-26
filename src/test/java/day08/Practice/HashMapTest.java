package day08.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HashMapTest {

	@Test
	public void GetKeyValuePairsCount() {
		
		HashMapPractice1 h = new HashMapPractice1();
		String line1 = "hr,hr,hr";
		String str = h.Array(line1).toString().replace("{","").replace("}", "");
		assertEquals("hr=3",str);
		
		String line2 = "sales,sales";
		String str2 = h.Array(line2).toString().replace("{","").replace("}", "");
		assertEquals("sales=2",str2);
	}
	
	
}
