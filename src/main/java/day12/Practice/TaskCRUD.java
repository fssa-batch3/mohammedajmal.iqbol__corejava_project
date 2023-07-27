package day12.Practice;

import day11.Practice.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import day12.Practice.*;
import day11.Solved.ConnectionUtil;
import day12.Solved.TestUserUpdatePassword;


//class DAOException extends Exception {
//    public DAOException(String message) {
//        super(message);
//    }
//}

public class TaskCRUD {
    public String createTask(CreateTask task) throws DAOException, SQLException {

        Connection connection = ConnectionUtil.getConnection();
        String query = "INSERT INTO task (userID , name , status) VALUES (?,?,?);";
        if (!task.getName().isEmpty() || !task.getStatus().isEmpty()) {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, task.getId());
            pst.setString(2, task.getName());
            pst.setString(3, task.getStatus());
            int rows = pst.executeUpdate();
            return "rows added : " + rows;
        } else {
            throw new DAOException("task name and status should not be null");
        }
    }

    public void updateTask(CreateTask task) throws DAOException, SQLException {

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

    public List<CreateTask> getAllTasks() throws DAOException, SQLException {

        List<CreateTask> tasks = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query = "SELECT * FROM task";

        try (PreparedStatement pst = connection.prepareStatement(query);
             ResultSet resultSet = pst.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("userID");
                String name = resultSet.getString("name");
                String status = resultSet.getString("status");
                CreateTask task = new CreateTask(id, name, status);
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
    	CreateTask tnew = new CreateTask(1,"go to bed Early","Pending");
//        Task t3 = new Task(2,"bath","Completed");
        TaskCRUD t1 = new TaskCRUD();
//        t1.createTask(t);
//        t1.createTask(t3);
//        t1.createTask(tnew);

        // read or select tasks
        CreateTask t1update = new CreateTask(0, "Wake Up Early","Completed");
        TaskCRUD tupdate = new TaskCRUD();
//        tupdate.updateTask(t1update);

        //delete task 1
        // PASSING userID in parameter
//        tupdate.deleteTask(1);


        // select and gettings all tasks in arraylist
        for (CreateTask te : tupdate.getAllTasks()) {
            System.out.println( "Task ID: " + te.getId() + " " + "Task Name: " + te.getName() + " " + "Task Status: " + te.getStatus());
        }

    }

}

