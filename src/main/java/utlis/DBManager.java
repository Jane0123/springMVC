package utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    //	url
    private static final String URL =
            "jdbc:mysql://127.0.0.1:3306/mysql?serverTimezone=GMT&useSSL=false &allowPublicKeyRetrieval=true";
    //	driver
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //	username
    private static final String USERNAME = "root";
    //	password
    private static final String PASSWORD = "root";

    static {
//		加载驱动驱动只加载一次
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static Connection getConn() {
        try {
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(conn);
            return conn;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return null;
    }




    public static void main(String[] args)  {
        DBManager.getConn();



    }



}






