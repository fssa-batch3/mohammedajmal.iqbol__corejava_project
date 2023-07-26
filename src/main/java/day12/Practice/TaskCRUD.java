package day12.Practice;

import day11.Practice.TaskDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import day11.Solved.ConnectionUtil;
import day12.Solved.TestUserUpdatePassword;

class Task {

    private int id;
    private String name;
    private String status;

    public Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

class DAOException extends Exception {
    public DAOException(String message) {
        super(message);
    }
}

public class TaskCRUD {
    public void createTask(Task task) throws DAOException, SQLException {

        Connection connection = ConnectionUtil.getConnection();
        String query = "INSERT INTO task (userID , name , status) VALUES (?,?,?);";
        if (!task.getName().isEmpty() || !task.getStatus().isEmpty()) {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, task.getId());
            pst.setString(2, task.getName());
            pst.setString(3, task.getStatus());
            int rows = pst.executeUpdate();
            System.out.println("rows added : " + rows);
            pst.close();
        } else {
            throw new DAOException("task name and status should not be null");
        }
    }

    public void updateTask(Task task) throws DAOException, SQLException {

        Connection connection = ConnectionUtil.getConnection();
        String query = "UPDATE task SET name=? , status=? WHERE userID=1;";
        if (!task.getName().isEmpty() || !task.getStatus().isEmpty()) {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, task.getName());
            pst.setString(2, task.getStatus());
            int rows = pst.executeUpdate();
            System.out.println("rows updated : " + rows);
            pst.close();
        } else {
            throw new DAOException("Updating task name and status should not be null");
        }

    }

    public void deleteTask(int taskId) throws DAOException, SQLException {

        Connection connection = ConnectionUtil.getConnection();
        String query = "DELETE FROM task WHERE userID=" + taskId + ";";
        PreparedStatement pst = connection.prepareStatement(query);
        int rows = pst.executeUpdate();
        System.out.println("rows updated : " + rows);
        pst.close();
    }

    public List<Task> getAllTasks() throws DAOException, SQLException {

        List<Task> tasks = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query = "SELECT * FROM task";

        try (PreparedStatement pst = connection.prepareStatement(query);
             ResultSet resultSet = pst.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("userID");
                String name = resultSet.getString("name");
                String status = resultSet.getString("status");
                Task task = new Task(id, name, status);
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasks;

    }


    public static void main(String[] args) throws DAOException, SQLException {

        //create tasks

//        Task t = new Task(1,"Wake Up Early","Not Completed");
        Task tnew = new Task(1,"go to bed Early","Pending");
//        Task t3 = new Task(2,"bath","Completed");
        TaskCRUD t1 = new TaskCRUD();
//        t1.createTask(t);
//        t1.createTask(t3);
//        t1.createTask(tnew);

        // read or select tasks
        Task t1update = new Task("Wake Up Early","Completed");
        TaskCRUD tupdate = new TaskCRUD();
//        tupdate.updateTask(t1update);

        //delete task 1
        // PASSING userID in parameter
//        tupdate.deleteTask(1);


        // slect and gettings all tasks in arraylist
        for (Task te : tupdate.getAllTasks()) {
            System.out.println( "Task ID: " + te.getId() + " " + "Task Name: " + te.getName() + " " + "Task Status: " + te.getStatus());
        }

    }

}

