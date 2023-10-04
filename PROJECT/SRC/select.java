import java.sql.*;
public class select {
	public static void main (String args[])throws Exception{
		
		String url= "jdbc:mysql://127.0.0.1:3306/grocery_store";
		String name="root";
		String  password="Sanjay_xw5";
		String Query ="select * from grocery";
		Connection con=DriverManager.getConnection(url,name,password);
		Statement pst =con.createStatement();
		ResultSet rst=pst.executeQuery(Query);
		 while (rst.next()) {
		    	System.out.println("user id:"+rst.getInt(1));
		    	System.out.println("name:"+rst.getString(2));
		    	System.out.println("venue:"+rst.getString(3));
		    	System.out.println("age:"+rst.getInt(4));
		    	System.out.println("date:"+rst.getDate(5));
		    }
	}

}
