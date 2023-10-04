import java.sql.*;
public class Update {
	public static void main(String args[]) throws Exception
	{
		
		String url="jdbc:mysql://127.0.0.1:3306/grocery_store";
		String username ="root";
		String password="Sanjay_xw5";
		String query="update grocery set transaction ='86' where customer_id = '1234'";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement psst=con.prepareStatement(query);
		int row = psst.executeUpdate();
		
		System.out.println(row);
		con.close();
	}

}
