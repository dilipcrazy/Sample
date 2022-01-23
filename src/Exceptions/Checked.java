package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Checked {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, SQLException {
		// Interrupted Exception
		Thread.sleep(2000);
        // FileNotFound Exception
		File f=new File("Path");
		FileInputStream file=new FileInputStream(f);
		// IO Exception (Apache Poi )
	//	Workbook wb=new XSSFWorkbook(file);
		
		// ClassNotFoundException
		Class.forName("oracle.jdbc.driver");
		// SQl Exception
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","261908");
	}
	

}
