package day07.Practice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Task {

    private int id;
    private String name;
    private LocalDate deadline;

    public Task(String name, int id,String date) {
        this.name = name;
        this.id = id;
        this.deadline = LocalDate.parse(date);
    }
    
    public String getName() {
    	return name;
    }
    
    public LocalDate getDate() {
    	return deadline;
    }
    
    public int getId() {
    	return id;
    }

    @Override
    public String toString() {
        return "Task : "+ name + ", Deadline :" + deadline + ", Id :" + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Task task = (Task) obj;
        return id == task.id && Objects.equals(name, task.name) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, deadline);
    }

    public static void main(String[] args) {
        ArrayList<Task> arr = new ArrayList <> ();
        Task task1 = new Task("Todo",1,"2023-07-22");
        Task task4 = new Task("Todo",1,"2023-07-22");
        Task task2 = new Task("Sleep",2,"2015-06-05");
        Task task3 = new Task("Drink",3,"2033-09-30");
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);
        arr.add(task4);

        HashSet<Task> distinctTask = new HashSet<>(arr);
        
        for (Task i: distinctTask) {
            System.out.println(i);
        }
        
    }
}