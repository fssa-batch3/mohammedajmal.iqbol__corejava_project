package day04.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day04.Practice.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	@Test
	public void GetRectangleArea() {
		Rectangle r = new Rectangle(5,5);

		// valid input
		assertEquals(5.0, r.getLength());
		assertEquals(5.0, r.getBreadth());
		assertEquals(25.0, r.calculateArea());
		
	}
}
