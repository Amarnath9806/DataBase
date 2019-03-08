import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			PreparedStatement preparedStatement= connection.prepareStatement("update employee set dept = ? where id= ?");
			
			System.out.println("enter the dept");
			String dept = sc.next();
			System.out.println("enter the id");
			int id = sc.nextInt();
			
			
	preparedStatement.setString(1, dept);
	preparedStatement.setInt(2, id);
	preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
