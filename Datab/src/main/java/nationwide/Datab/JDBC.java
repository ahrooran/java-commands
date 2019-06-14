//package nationwide.Datab;
//import java.sql.*;
//
//public class JDBC {
//
//	public static void main(String[] args) {
//		Connection conn = null;
//		Statement stmt = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/mule/","root/","Macbook6");
//			stmt = conn.createStatement();
//			stmt.executeUpdate("insert into school values(2,'Peter',45)");
//			//rs.close();
//			stmt.close();
//			conn.close();
//		}catch(Exception se) {
//			System.out.println(se.toString());
//		}
//
//	}
//
//}
