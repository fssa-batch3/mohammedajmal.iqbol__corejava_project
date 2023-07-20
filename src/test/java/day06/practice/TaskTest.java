package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day06.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
    public void GetTodo() {
        ArrayList<Task> arr = new ArrayList <> ();
        Task t1 = new Task(1,"Coding",LocalDate.of(2022,10,22));;
        arr.add(t1);
        
        LocalDate l = LocalDate.of(2022,10,22);
        
        assertEquals("Coding",t1.getName());
        assertEquals(1,t1.getId());
        assertEquals(l,t1.getDeadline());
        
    }
}