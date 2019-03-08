import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseex {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
	
	Statement statement=connection.createStatement();
	
	ResultSet resultSet= statement.executeQuery("select * from employee");
	
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+"     "+resultSet.getString(2)+"      "+resultSet.getInt(6)+"      "+resultSet.getInt(4));
	
	}
	connection.close();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
		
	}

}
