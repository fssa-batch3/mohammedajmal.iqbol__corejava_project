package day02.Practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above 
		System.out.println("ERROR: " + msg);
	}
	
	
	// Similarly write overloaded methods for error and info.
	public static void main(String[] args) {
		Logger l = new Logger();
		l.debug("This is a Debug message");
		l.info("This is an info message");
		l.error("This is an error message");
		
	}
}
