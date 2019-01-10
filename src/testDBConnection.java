import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testDBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 127.0.0.1
		String connectionString = "jdbc:mysql://localhost:3306/employees";
	
		try {
			Connection conn = DriverManager.getConnection(connectionString, "root", "mckay1wms");
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			System.out.println("Error with database connection.");
			e.printStackTrace();
		}
	}

}
