package sonarqubejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SJDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver");

		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/training","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from staff;");
		while(rs.next()) {
			System.out.print(rs.getString("id")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.println(rs.getString("address")+" ");

			
		}
		
	}
}

