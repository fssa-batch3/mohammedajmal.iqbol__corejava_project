package day09.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import day09.Practice.*;

import org.junit.jupiter.api.Test;

import day06.Practice.Task;

public class TaskTest {

	@Test
    public void EqualsTaskName() {
		Task t1 = new Task("Wake Up",1);        
        assertEquals("Wake Up",t1.gettaskName());
    }
	
	@Test
    public void EqualsTaskPriority() {
		Task t1 = new Task("Wake Up",1);        
        assertEquals(1,t1.getTaskPriority());
    }
	
	ArrayList<Task> task = new ArrayList<>();
	
	@Test
	public void GetArrayListWithoutSorting() {
		Task t1 = new Task("Wake Up",3);  
		Task t2 = new Task("Take Bath",1);  
		Task t3 = new Task("Go to Office",2);  
		task.add(t1);
		task.add(t2);
		task.add(t3);
		String s = Integer.toString(task.get(0).getTaskPriority());
		// valid input
		assertTrue(s.equals("3"),"the given condition is true");
	}
	
	@Test
	public void EqualsAssertFalseTaskPriorityWithoutSorting() {
		Task t1 = new Task("Wake Up",3);  
		Task t2 = new Task("Take Bath",1);  
		Task t3 = new Task("Go to Office",2);  
		task.add(t1);
		task.add(t2);
		task.add(t3);
		String s = Integer.toString(task.get(0).getTaskPriority());
		// valid input
		assertFalse(s.equals("1"),"the given condition is true");
	}
	
	@Test
	public void GetCollectionWithSorting() {
		Task t1 = new Task("Wake Up",3);  
		Task t2 = new Task("Take Bath",1);  
		Task t3 = new Task("Go to Office",2);  
		task.add(t1);
		task.add(t2);
		task.add(t3);
		
		Collections.sort(task,Comparator.comparing(Task::getTaskPriority));
		String s = Integer.toString(task.get(0).getTaskPriority());
		// valid input
		assertTrue( s.equals("1"),"the given condition is true");
		
	}
	
}