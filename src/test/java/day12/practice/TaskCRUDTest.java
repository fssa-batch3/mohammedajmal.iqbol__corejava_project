package day12.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import day11.Practice.*;
import day12.Practice.*;
import day12.Practice.*;

public class TaskCRUDTest {
	

	// task status set and get from task class 
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
	
	// set and get values from cloud DB using SELECT Query
	@Test
	public void GetTaskObjectFromCloudDatabase() throws SQLException, day12.Practice.DAOException {
		
		CreateTask t1 = new CreateTask(11,"Meeting with Ahamed","Not Completed"); 
		
		TaskCRUD tcreate = new TaskCRUD();
		String s = "rows added : 1";
		assertTrue("the given two is equal",tcreate.createTask(t1).equals(s));
		
		
	}
}