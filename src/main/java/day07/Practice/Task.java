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
    
    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
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
}