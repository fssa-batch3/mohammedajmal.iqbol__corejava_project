package day07.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import day07.Practice.*;

import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
    public void GetTodo() {
        ArrayList<Task> arr = new ArrayList <> ();
        Task t = new Task("Todo",1,"2023-07-22");
        arr.add(t);
        
        LocalDate l = LocalDate.of(2023,07,22);
        
        assertEquals("Todo",t.getName());
        assertEquals(1,t.getId());
        assertEquals(l,t.getDate());
    }
	
}
