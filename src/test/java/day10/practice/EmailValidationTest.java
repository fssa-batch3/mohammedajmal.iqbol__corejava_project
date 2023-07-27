package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import day10.Practice.EmailCheck;
import day10.Practice.InvalidEmailException;
import day10.Practice.EmailValidate;
import day10.Practice.Email;


public class EmailValidationTest {

    @Test
    public void testValidEmail() {
        try {
        	Email e = new Email("freekyajmal@gmail.com");
            EmailValidate.validate(e);
        } catch (InvalidEmailException e) {
            fail("Email validation should not throw an exception for a valid email.");
        }
    }
    
    @Test
    public void testInvalidEmail() {
        try {
            // Change the email to an invalid one.
            Email e = new Email("invalid-email");
            EmailValidate.validate(e);
            fail("Email validation should throw an exception for an invalid email.");
        } catch (InvalidEmailException e) {
            // We expect an InvalidEmailException to be thrown.
            assertEquals("Invalid email address: " + "invalid-email", e.getMessage());
        }
    }
}