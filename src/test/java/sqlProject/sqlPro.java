package sqlProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
import com.mysql.cj.jdbc.*;


public class sqlPro {
	//Number 1
	@Test
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery("select * from city order by city desc limit 10");
		
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
	
	
	//Number 10
	@Test
	
	public void connect2() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		 stmt.executeUpdate("rollback");
		 stmt.executeUpdate("delete from store where store_id like 11");
		ResultSet rs=stmt.executeQuery("select * from store");
		
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
	
	//Number 7
	@Test
	
	public void connect3() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		stmt.executeQuery("set @filmidAlien= 15");
				ResultSet rs=stmt.executeQuery("select inventory_id from inventory where film_id like @filmidAlien && store_id like 2");
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
//Number 8
	
	@Test
	
	public void connect4() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		stmt.executeUpdate("Start Transaction");
			stmt.executeUpdate("insert into store(manager_staff_id,address_id) values(18,18)");
			stmt.executeUpdate("commit");

			ResultSet rs= stmt.executeQuery("select * from store");

			
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
	
	//Number 9
	@Test
	public void connect5() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		stmt.executeUpdate("update store set last_update=Now() where store_id like 11");
		

			ResultSet rs= stmt.executeQuery("select * from store");

			
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
	
	
	@Test
	public void connect6() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		String password="root";
		String url ="jdbc:mysql://localhost:3306/sakila";
		Connection con=DriverManager.getConnection(url, username,password);
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		stmt.executeUpdate("update store set last_update=Now() where store_id like 11");
		

			ResultSet rs= stmt.executeQuery("select * from store");

			
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
