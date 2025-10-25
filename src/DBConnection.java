import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.*;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("db.properties");
            props.load(fis);

            String url = props.getProperty("jdbc:mysql://localhost:3306/school_db");
            String user = props.getProperty("root");
            String password = props.getProperty("root");

            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
