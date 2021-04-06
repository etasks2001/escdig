package com.xsaturncont.facade.ecd;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import com.xsaturncont.facade.Source;
import com.xsaturncont.facade.ecd.layout6.FacadeLayout6;

public class Main {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException, ParseException, IOException, NoSuchAlgorithmException {

		Connection connection = new Source().getConnection();
		FacadeLayout6 facadeLayout6;

		facadeLayout6 = new FacadeLayout6(connection, "1", "2019");
		facadeLayout6.build();

		facadeLayout6 = new FacadeLayout6(connection, "2", "2019");
		facadeLayout6.build();

		facadeLayout6 = new FacadeLayout6(connection, "3", "2019");
		facadeLayout6.build();

		facadeLayout6 = new FacadeLayout6(connection, "4", "2019");
		facadeLayout6.build();

		connection.close();
	}
}