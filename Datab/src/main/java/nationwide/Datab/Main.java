package nationwide.Datab;

import java.sql.*;

public class Main
{
    public static void main( String[] args ) throws SQLException
    {
        // try connection
        MysqlConnection mysqlConnection = new MysqlConnection();
        mysqlConnection.tryConnection();
        System.out.println("-------------------------------------------------");

        
        // try a statement execution
        Connection connection = mysqlConnection.getConnection();
        Statement stmt=connection.createStatement();
        ResultSet rs=stmt.executeQuery("select * from school");
//        rs.getInt("Result");
//        rs.getString("Name");
//        rs.getString("Marks");
        System.out.println("regno " + "name " + "marks");
        while(rs.next()) {
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
        }

        // close connection
        mysqlConnection.closeConnection();
    }
}