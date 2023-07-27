package day10.Practice;

import java.util.regex.Pattern;

public class EmailValidate {
	
	public static void validate(Email e)  throws InvalidEmailException {
		 String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			if(Pattern.matches(emailRegex , e.email)) {
				System.out.println("The Given " + e.email + " Email Is Valid");
				return;
			}
		throw new InvalidEmailException( "The Given " + e.email + " Email Is Invalid");
	}
}