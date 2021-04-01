package ecd.source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SourceContabil {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("net.sourceforge.jtds.jdbc.Driver");

	String url = "jdbc:jtds:sqlserver://192.168.1.2:1433/contabil";
	String user = "sa";

	String password = "Mau1234";
	return DriverManager.getConnection(url, user, password);
    }
}