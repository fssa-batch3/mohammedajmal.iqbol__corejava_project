package day10.Practice;

import day10.Solved.ValidationException;

public class EmailCheck {

	public static void main(String[] args) {
		
		try {
			EmailValidator.validate();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}
}
