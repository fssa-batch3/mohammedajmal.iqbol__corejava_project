package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

import day06.Practice.*;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
	
	@Test
	public void GetTodoName() {
		RemoveDuplicateArrayList r = new RemoveDuplicateArrayList();
		// valid input
		r.setA("Wake Up");
		assertEquals("Wake Up", r.getA());
	}
	
	@Test
	public void GetTodoName2() {
		RemoveDuplicateArrayList r = new RemoveDuplicateArrayList();
		// True input
		String test = "Tirunelveli";
		String test2 = "Tirunelveli";
		r.setA(test);
		assertTrue(r.getA().equals(test2),"the given condition is true");
	}
	
	@Test
	public void GetTodoName3() {
		RemoveDuplicateArrayList r = new RemoveDuplicateArrayList();
		// False input
		String test = "Tirunelveli";
		String test2 = "Chennai";
		r.setA(test);
		assertFalse(r.getA().equals(test2),"the given condition is true");
	}

}
