import java.sql.*;

public class Validate {
	public static boolean checkUser(String email) {
		boolean st = false;
		try {

			// loading drivers for Mysql JAR file
			Class.forName("com.mysql.jdbc.Driver");
			// creating connection with the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println(" Connection connection ---> "+ connection);
			PreparedStatement ps = connection.prepareStatement("select * from student1 where email=? ");
			System.out.println(" PreparedStatement ps ----> "+ps);
			ps.setString(1, email);	
			ResultSet rs = ps.executeQuery();
			System.out.println("  ResultSet rs   ----> "+rs);
			st = rs.next();
			System.out.println("  st = rs.next() ----> "+st);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
}