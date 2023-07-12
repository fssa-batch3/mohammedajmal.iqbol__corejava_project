package day03.Practice;

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public User(String name, String email , String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
}
