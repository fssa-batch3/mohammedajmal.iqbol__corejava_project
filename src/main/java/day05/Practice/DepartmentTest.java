package day05.Practice;

public class DepartmentTest {

    public static void main(String[] args) {
        Department department = new Department("Programming", 389);
        Student student = new Student("Ajmal", 423, department);
        System.out.println(student);
    }
}