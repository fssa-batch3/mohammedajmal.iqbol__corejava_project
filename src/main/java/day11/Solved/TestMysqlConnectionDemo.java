package day11.Solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Mohammed Ajmal
 *
 */
public class TestMysqlConnectionDemo {
	/**
	 * @param args
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.
														getConnection("jdbc:mysql://localhost:3306/project", 
																					"root", 
																	"root");
		System.out.println(conn);

	}
}