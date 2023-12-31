package day11.Practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.Solved.ConnectionUtil;


class DAOException extends Exception {
    public DAOException(String message) {
        super(message);
    }
}

public class TaskDAO {
    public void createTask(CreateTask task) throws DAOException , SQLException {

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
        CreateTask t = new CreateTask(1,"Wake Up Early","Not Completed");
        CreateTask t5 = new CreateTask(3,"Early","Not Completed");

        CreateTask t3 = new CreateTask(2,"bath","Completed");
        TaskDAO t1 = new TaskDAO();
        t1.createTask(t5);
//        t1.createTask(t3);
    }


}
