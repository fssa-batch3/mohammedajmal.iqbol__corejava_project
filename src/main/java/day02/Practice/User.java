package day02.Practice;

public class User {
	
	private int id;
	private String name;
	private String password;
	private String emailId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getemailId() {
		return emailId;
	}
	
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		
    User u = new User();
    u.setId(1);
    u.setName("Mohammed Ajmal");
    u.setPassword("ajuma@789");
    u.setemailId("freekyajmal@gmail.com");
    
    
    System.out.println(u.getId());
    System.out.println(u.getName());
    System.out.println(u.getPassword());
    System.out.println(u.getemailId());
		
	}
}
