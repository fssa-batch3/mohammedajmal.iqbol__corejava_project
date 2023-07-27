package day10.Practice;

import java.util.ArrayList;
import java.util.regex.Pattern;

import day10.Solved.ValidationException;


public class EmailCheck {
	public static void main(String[] args) {
		
		EmailValidate em = new EmailValidate();
		try {
            Email e = new Email("freekyajmal@example.com");
			em.validate(e);
		} catch (InvalidEmailException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
