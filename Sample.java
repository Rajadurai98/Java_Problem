import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample {
	public static void main(String[] args) {
		try {
			//Class.forName("com.msql.jdbc.driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rajadurai_new_db", "root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from new_table");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2)+ "\t"+ rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
