package day03.Practice;

public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.print("id" + "=" + id);
        System.out.print(", ");
        System.out.print("name" + "=" + name);
        System.out.println();
    }
}