package day10.practice;

import day10.Practice.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;


public class ArrayExceptionTest {
    private UserManager userManager;

    @Before
    public void setUp() {
        userManager = new UserManager();
    }

    @Test
    public void testRegisterDuplicateUser() {
        User user1 = new User(1, "karthi", "karthi@gmail.com");
        User user2 = new User(2, "Ajmal", "ajmal@gmail.com");

        try {
            userManager.register(user1);
            userManager.register(user2);
        } catch (UserAlreadyExistsException e) {
            fail("User registration should not throw an exception for unique users.");
        }

        User duplicateUser = new User(3, "karthi", "karthi@gmail.com");
        try {
            userManager.register(duplicateUser);
            fail("User registration should throw an exception for duplicate users.");
        } catch (UserAlreadyExistsException e) {
            assertEquals("User with email " + duplicateUser.emailId + " already exists.", e.getMessage());
        }
    }
}