package day12.Solved;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day11.Solved.ConnectionUtil;

/**
 * @author BharathwajSoundarara
 *
 */
//Explain in class what is the difference between Statement and PreparedStatement
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO user (username,email,password,phone,first_name,last_name) VALUES (?, ?,?,?,?,? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "ajmal");
		pst.setString(2, "ajmal@ctr.freshworks.com");
		pst.setString(3, "ajmal007");
		pst.setString(4, "9500320194");
		pst.setString(5, "Mohammed");
		pst.setString(6, "Ajmal");

		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pst.close();

	}

}