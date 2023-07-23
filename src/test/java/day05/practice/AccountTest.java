package day05.practice;

import day05.Practice.Account;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AccountTest {

	@Test
	public void getName() {
		Account a = new Account("AX001", 6000);
		
		assertEquals("AX001",a.getAccNo());
		assertEquals(6000,a.getBalance());
	}
	
}
