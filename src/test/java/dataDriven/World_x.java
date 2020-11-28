package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class World_x {
	@Test
	public void enterData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/world_x";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		stmt.executeUpdate("Start Transaction");
			stmt.executeUpdate("drop table if exists students");
			stmt.executeUpdate("create table students(id int not null auto_increment,"
					+ "`first_name` varchar(20) not null,"
					+ "`last_name` varchar(20) not null,"
					+ "isMale bool not null,"
					+ "birthdate date not null,"
					+ "address char (25),"
					+ "city_id int,"
					+ "phone varchar(12) not null,"
			
					+ "primary key (id),"
					+ "foreign key (city_id) references city(ID));");
			stmt.executeUpdate("set @cityID=(select id from city where  `name`='Delhi'");
			stmt.executeUpdate("insert into students(first_name, last_name,isMale,birthdate,address, city_id,phone)"
					+ "values('Jeff','Spicoli',true,'1984-8-11','5150 Green Valley',@cityID, '658-777-8541')");
			
			stmt.executeUpdate("commit");

			ResultSet rs= stmt.executeQuery("select * from students");

			
			rs.last();
		 
		 int rows=rs.getRow();
		 System.out.println("Number of rows "+rows);
		 
		 ResultSetMetaData rsmd = rs.getMetaData();
		 int cols = rsmd.getColumnCount();
		 System.out.println("Number of columns "+cols);
		  int i=0;
		  rs.beforeFirst();
		 String data[][] = new String[rows][cols];
		 while(rs.next()) {
			 for(int j=0;j<cols;j++) {
				data[i][j]= rs.getString(j+1);
				System.out.println(""+data[i][j]);
			 }
			 i++;
		 }
	}

}
