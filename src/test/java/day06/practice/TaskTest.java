package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day06.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
	
	@Test
	public void CheckTodoNameAndPriorityUsingassertEquals() {
		Task t = new Task("Wake Up",1);
		// valid input
		assertEquals("Wake Up", t.gettaskName());
		assertEquals(1, t.getTaskPriority());
	}
	
	@Test
	public void CheckTodoNameAndPriorityUsingassertTrue() {
		Task t = new Task("Take Bath",2);
		String s = "Take Bath";
		// valid input
		assertTrue(Integer.toString(t.getTaskPriority()).equals("2"),"the given condition is true");
	}
	
	@Test
	public void CheckTodoNameAndPriorityUsingassertFalse() {
		Task t = new Task("Take Bath",2);
		// valid input
		assertFalse(t.gettaskName().equals("Walk 5 kms"),"the given condition is true");
	}
}