package day09.Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task {
	private int id;
	private String name;
    private LocalDate deadline;
    
    public Task(int id, String name, LocalDate deadline) {
    	this.id = id;
    	this.name = name;
    	this.deadline = deadline;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setDeadline(LocalDate deadline) {
    	this.deadline = deadline;
    }
    
    public int getId() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    public LocalDate getDeadline() {
    	return deadline;
    }
    
    
    public static void main(String[] args) {
    	
    	ArrayList<Task> arr = new ArrayList<>();
    	
    	Task t1 = new Task(3,"Coding",LocalDate.of(2022,10,22));
    	Task t2 = new Task(5,"Product Design",LocalDate.of(2022,10,01));
    	Task t3 = new Task(1,"Software Design",LocalDate.of(2022,10,07));
    	Task t4 = new Task(3,"Coding",LocalDate.of(2022,10,22));
    	
    	arr.add(t1);
    	arr.add(t2);
    	arr.add(t3);
    	arr.add(t4);
    	
    	 Collections.sort(arr,Comparator.comparing(Task::getDeadline));
    	 
    	 for (Task task : arr) {
             System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
         }
    }
}
