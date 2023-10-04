import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class delete {
	public static void main (String args[])throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/grocery_store";
		String username="root";
		String password="Sanjay_xw5";
		String Query="delete from grocery where customer_id=1235";
		Connection con =DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int row=pst.executeUpdate();
		System.out.println(row);
		con.close();
	}

}
