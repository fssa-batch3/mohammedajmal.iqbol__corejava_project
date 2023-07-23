package day10.Practice;

import java.util.ArrayList;
import java.util.regex.Pattern;

import day10.Solved.ValidationException;

class Email {
	String email;
	
	public Email(String email) {
		this.email = email;
	}
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidate {
	
	public void validate(Email e)  throws InvalidEmailException {
		 String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			if(Pattern.matches(emailRegex , e.email)) {
				System.out.println("The Given " + e.email + " Email Is Valid");
				return;
			}
		throw new InvalidEmailException( "The Given " + e.email + " Email Is Invalid");
	}
}


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
