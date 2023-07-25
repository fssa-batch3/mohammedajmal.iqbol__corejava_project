package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import day06.Practice.*;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
	@Test
	public void GetTodoNameAndPriority() {
		RemoveDuplicateArrayList r = new RemoveDuplicateArrayList();

		// valid input
		r.setA("Tirunelveli");
		assertEquals("Tirunelveli", r.getA());
		
	}
}
