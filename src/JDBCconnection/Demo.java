package JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "261908");	
		
		String query="Select first_name,salary from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			String string2 = executeQuery.getString("Salary");
			String string = executeQuery.getString("first_name");
			System.out.println(string);
		               System.out.println(string2);
		}
		connection.close();
		

		
	}

}
