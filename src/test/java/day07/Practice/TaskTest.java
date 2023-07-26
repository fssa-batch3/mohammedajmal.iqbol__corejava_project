package day07.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import day07.Practice.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day07.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
	

	int ArrayListCount = 0;
	int HashListCount = 0;
	
	
	@Test
	public void GetTodoCountInArrayListAssertTrue() {

		ArrayList<Task> arr = new ArrayList<>();
		 Task task1 = new Task("Todo",1,"2023-07-22");
	        Task task2 = new Task("Todo",1,"2023-07-22");
	        arr.add(task1);
	        arr.add(task2);
	        
	        for (Task i: arr) { ArrayListCount++;}
	        
        HashSet<Task> distinctTask = new HashSet<>(arr);
	        
	        
	        for (Task i: distinctTask) {HashListCount++;}
		
	    //true statement ArrayList
		assertTrue(Integer.toString(ArrayListCount).equals("2"),"the given condition is true");
		
		 //true statement HashList
		assertTrue(Integer.toString(HashListCount).equals("1"),"the given condition is true");
		
	}
	
	
	@Test
	public void GetTodoCountInArrayListAssertFalse() {

		ArrayList<Task> arr = new ArrayList<>();
		 Task task1 = new Task("Todo",1,"2023-07-22");
	        Task task2 = new Task("Todo",1,"2023-07-22");
	        arr.add(task1);
	        arr.add(task2);
	        
	        for (Task i: arr) { ArrayListCount++;}
	        
        HashSet<Task> distinctTask = new HashSet<>(arr);
	        
	        
	        for (Task i: distinctTask) {HashListCount++;}
		
	    //false statement ArrayList
		assertFalse(Integer.toString(ArrayListCount).equals("0"),"the given condition is false");
		
		//false statement HashList
	    assertFalse(Integer.toString(HashListCount).equals("0"),"the given condition is true");
		
	}
	
	
	@Test
	public void GetTodoCountInArrayListAssertEquals() {

		
	    //false statement so true
		assertEquals(ArrayListCount,HashListCount);
		
	}
	
}