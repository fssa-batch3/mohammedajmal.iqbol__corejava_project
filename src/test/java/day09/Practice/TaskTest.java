package day09.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day09.Practice.*;

import org.junit.jupiter.api.Test;

import day06.Practice.Task;

public class TaskTest {

	@Test
    public void GetTodo() {
		Task t1 = new Task("Wake Up",1);        
		
        assertEquals("Wake Up",t1.gettaskName());
        assertEquals(1,t1.getTaskPriority());
        
    }
}