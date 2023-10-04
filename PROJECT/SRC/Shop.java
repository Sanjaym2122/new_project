import java.sql.*;
import java.util.*;

public class Shop {
	public static void main (String args[])throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/grocery_store";
		String username="root";
		String password="Sanjay_xw5";
		String Query="insert into grocery(customer_id,product_department,product_cataGory,transaction,purchase_date) values (1238,'fruits','mango',50,'2023-07-08')";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		//pst.setInt(1, 12349);
		//pst.setString(2, "vegetables");
		//pst.setString(3, "onion");
		//pst.setInt(4, 45);
		//pst.setString(5," 2023-05-07");
		pst.executeUpdate();
		con.close();
	}
	

}
