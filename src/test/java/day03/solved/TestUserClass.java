package day03.solved;
import day03.Practice.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUserClass {

	@Test
	public void TestGetUserDetails() {
	User u = new User("Ajmal","ajmal@gmail.com","blue@123");
	assertEquals("Ajmal",u.getName());
	assertEquals("ajmal@gmail.com",u.getEmail());
	assertEquals("blue@123",u.getPassword());
	
	}
}
