package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day06.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	public void GetTodoNameAndPriority() {
		Task t = new Task("Wake Up",1);

		// valid input
		assertEquals("Wake Up", t.gettaskName());
		assertEquals(1, t.getTaskPriority());
	}
}