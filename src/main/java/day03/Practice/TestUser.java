package day03.Practice;

public class TestUser {

  public static void main(String[] args) {

	  User u = new User("Ajmal","ajmal@gmail.com","blue@432");
	  
	  System.out.println(u.getId());
	  System.out.println(u.getName());
	  System.out.println(u.getEmail());
	  System.out.println(u.getPassword());
	  
	  User user = new User(1,"Ajmal");
	  
	  System.out.println(user.getId());
	  System.out.println(user.getName());
	  System.out.println(user.getEmail());
	  System.out.println(user.getPassword());

  }
}
