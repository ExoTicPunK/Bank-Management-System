package bank.management.system;
import java.sql.*;
// import java.sql.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;

public class Connect {
    Connection connection;
    Statement statement;
    public Connect(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Aniket@2003");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
