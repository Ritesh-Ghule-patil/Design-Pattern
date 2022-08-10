import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/aurionpro";
		String userName = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		if(con.isClosed()) {
			System.out.println("connection is closed");
		}else {
			System.out.println("connectio Established");
		}
		
	}

}
