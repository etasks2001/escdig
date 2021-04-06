package com.xsaturncont.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SourceEcd {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");

		String url = "jdbc:jtds:sqlserver://localhost:1433/ecd";
		String user = "sa";

		String password = "123";
		return DriverManager.getConnection(url, user, password);
	}
}