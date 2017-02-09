package Test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by NESOY on 2017-02-09.
 */

public class MySQLConnectionTest {
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/csemall";
    private static final String username = "root";
    private static final String password = "1234";

    @Test
    public void test_SQL_Connection() throws Exception{
        Class.forName(Driver);

        try(Connection con = DriverManager.getConnection(URL,username,password)) {
            System.out.println(con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
