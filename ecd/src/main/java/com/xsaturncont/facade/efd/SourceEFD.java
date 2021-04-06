package com.xsaturncont.facade.efd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SourceEFD {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		String url = "jdbc:odbc:MaisonLafite";
		String user = "admin";

		// String password = "fs142540s";
		String password = "fs142540a";
		return DriverManager.getConnection(url, user, password);
	}

}
