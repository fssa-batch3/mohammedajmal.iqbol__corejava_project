package day11.practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import day11.Practice.*;

public class TestTaskDAO {

	
	@Test
	public void CreateTaskIDInCloudDatabase() {
		
		CreateTask t1 = new CreateTask(1,"Wake Up Early","Not Completed"); 
		assertTrue(1 == t1.getId(),"the given condition is true");
	}
	
	@Test
	public void GetTaskNameInCloudDatabase() {
		
		CreateTask t1 = new CreateTask(1,"Wake Up Early","Not Completed"); 
		assertTrue(t1.getName().equals("Wake Up Early"),"the given condition is true");
	}
	
	@Test
	public void GetTaskStatusInCloudDatabase() {
		
		CreateTask t1 = new CreateTask(1,"Wake Up Early","Not Completed"); 
		assertTrue(t1.getStatus().equals("Not Completed"),"the given condition is true");
	}
	
	
	@Test
	public void GetTaskStatusAssertFalseInCloudDatabase() {
		
		CreateTask t1 = new CreateTask(1,"Wake Up Early","Not Completed"); 
		assertFalse(t1.getStatus().equals("Completed"),"the given condition is true");
	}
}
