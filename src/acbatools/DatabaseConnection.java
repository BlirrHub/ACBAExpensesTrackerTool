package acbatools;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    public static Connection GetDatabaseConnection(){
        String url = "jdbc:sqlite:ExpensesDB.db";
        
        try{
            //Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
