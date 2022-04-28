package javaapplication1;

import java.sql.*;

public class dataConn {

    public static Connection getCon() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kala", "root", "");
            return con;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
