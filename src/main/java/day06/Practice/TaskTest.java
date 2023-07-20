package day06.Practice;

import java.util.ArrayList;

public class TaskTest {

	public static void main(String[] args) {
		
		Task t1 = new Task("Wake Up",1);
		Task t2 = new Task("Run 5 kms",2);
		Task t3 = new Task("Drink Water",3);
		Task t4 = new Task("Eat Breakfast",4);
		Task t5 = new Task("Go to Sleep",5);
		
		String task1 = t1.gettaskName() + " " + t1.getTaskPriority() + "\n";
		String task2 = t2.gettaskName() + " " + t2.getTaskPriority() + "\n";
		String task3 = t3.gettaskName() + " " + t3.getTaskPriority() + "\n";
		String task4 = t4.gettaskName() + " " + t4.getTaskPriority() + "\n";
		String task5 = t5.gettaskName() + " " + t5.getTaskPriority() + "\n";
		
		ArrayList<String> array = new ArrayList<>();
		
		array.add(task1);
		array.add(task2);
		array.add(task3);
		array.add(task4);
		array.add(task5);
		
		System.out.println(array.toString().replaceAll("\\[|\\]", "").replaceAll(", ", ""));
			
		FindTaskByName f = new FindTaskByName("Go to Sleep",array);
		
		if(f.isThere()) {
			System.out.println("task is there");
		} else {
			System.out.println("task is not there");
		}
		
	}
}
