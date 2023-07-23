package day05.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import day05.Practice.Department;


public class TestDepartment {

	@Test
	public void getDepartment() {
		 Department d = new Department("Programming", 389);
         assertEquals("Programming",d.getdeptName());
	}
	
	public void getDeptId() {
		Department d = new Department("Programming", 389);
		assertEquals(389,d.getdeptId());
	}
	
}
