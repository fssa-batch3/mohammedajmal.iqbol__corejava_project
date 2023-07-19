package day08.Practice;

import java.util.*;

public class DeptEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the comma-separated Department, Employee (press Enter twice to finish):");

        HashMap<String, List<String>> departmentEmployees = new HashMap<>();

        while (true) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            String[] values = line.split(",");
            String department = values[0].trim();
            String employee = values[1].trim();

            if (departmentEmployees.containsKey(department)) {
                List<String> employees = departmentEmployees.get(department);
                employees.add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployees.put(department, employees);
            }
        }

        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();

            StringBuilder output = new StringBuilder(department + ": ");
            for (int i = 0; i < employees.size(); i++) {
                output.append(employees.get(i));
                if (i < employees.size() - 1) {
                    output.append(", ");
                }
            }
            System.out.println(output.toString());
        }

    }
}