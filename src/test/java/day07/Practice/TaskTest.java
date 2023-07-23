package day07.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day07.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	public void GetTodo() {
		Task t = new Task("Todo", 1, "2023-07-22");

		LocalDate l = LocalDate.of(2023, 07, 22);
		LocalDate l2 = LocalDate.of(2023, 07, 12);

		// valid input
		assertEquals("Todo", t.getName());
		assertEquals(1, t.getId());
		assertEquals(l, t.getDate());
		
	}
}
