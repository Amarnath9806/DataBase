import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertdata {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			PreparedStatement preparedStatement= connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter dept");
			String dept = sc.next();
			System.out.println("enter contact");
			int contact = sc.nextInt();
			System.out.println("enter add");
			String add = sc.next();
			System.out.println("enter salary");
			int salary = sc.nextInt();
			
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, dept);
		preparedStatement.setInt(4,contact);
		preparedStatement.setString(5, add);
		preparedStatement.setInt(6, salary);
	int i=	preparedStatement.executeUpdate();
	if (i==1) {
		System.out.println("done");
	}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
