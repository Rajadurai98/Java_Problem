import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Sample_Insert {
	public static void main(String[] args) {
		try {
		
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rajadurai_new_db", "root","root");
			// which is responsible for executing queries on
            // table
            Statement stmt = con.createStatement();
            int result =stmt.executeUpdate("insert into new_table(id,contact_number,Address) values(14,72009058,'St Brindavan')");
         // if result is greater than 0, it means values
            // has been added
            if(result>0) {
            	System.out.println("Successfully inserted");
            }
            else {
            	System.out.println("unSucessfully insertion");
            }

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
