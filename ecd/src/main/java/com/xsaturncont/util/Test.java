package com.xsaturncont.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//		Loop.withIndex(0, 10000, new Loop.Each() {
//
//			@Override
//			public void run(int i) {
//				System.out.println(i);
//			}
//		});

		Class.forName("net.sourceforge.jtds.jdbc.Driver");

		String url = "jdbc:jtds:sqlserver://192.168.1.2:1433/contabil";
		String user = "sa";

		String password = "Mau1234";
		Connection connection = DriverManager.getConnection(url, user, password);

		System.out.println(connection.isClosed());

		connection.close();
		System.out.println(connection.isClosed());

	}
}