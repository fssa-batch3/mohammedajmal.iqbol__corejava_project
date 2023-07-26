package day11.Practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.Solved.ConnectionUtil;

class Task {

    private int id;
    private String name;
    private String status;

    public Task(int id, String name, String status) {
        this.id = id;
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

public class TaskDAO {
    public void createTask(Task task) throws DAOException , SQLException {

        Connection connection = ConnectionUtil.getConnection();
        String query = "INSERT INTO task (userID , name , status) VALUES (?,?,?);";
        if( !task.getName().isEmpty() || !task.getStatus().isEmpty()) {
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

    public static void main(String[] args) throws DAOException, SQLException {
        Task t = new Task(1,"Wake Up Early","Not Completed");
        Task t5 = new Task(3,"Early","Not Completed");

        Task t3 = new Task(2,"bath","Completed");
        TaskDAO t1 = new TaskDAO();
        t1.createTask(t5);
//        t1.createTask(t3);
    }


}
