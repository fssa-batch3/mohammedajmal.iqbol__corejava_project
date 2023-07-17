package day06.Practice;
import java.util.ArrayList;

public class Task {
	 
    public String taskName;
    public int priority;
    
    
     public Task(String taskName , int priority) {
    	 this.taskName = taskName;
    	 this.priority = priority;
     }
     
     public void setTaskName(String taskName) {
    	 this.taskName = taskName;
     }
     
     public String gettaskName() {
    	 return taskName;
     }
     
     public void TaskPriority(int priority) {
    	 this.priority = priority;
     }
     
     public int getTaskPriority() {
    	 return priority;
     }
}