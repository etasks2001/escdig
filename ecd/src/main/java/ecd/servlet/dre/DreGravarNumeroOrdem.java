package ecd.servlet.dre;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecd.source.SourceEcd;

@WebServlet("/dreGravarNumeroOrdem")
public class DreGravarNumeroOrdem extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DreGravarNumeroOrdem() {
	super();
    }

    private static final int SK = 0;
    private static final int NU_ORDEM = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection connection = null;
	PreparedStatement ps = null;
	try {
	    connection = new SourceEcd().getConnection();

	    ps = connection.prepareStatement("update J150 set nu_ordem=? where sk=?");

	    String ordem = request.getParameter("ordem");
	    System.out.println(ordem);

	    String[] rows = ordem.split(";");

	    for (String row : rows) {
		String[] field = row.split(":");

		String sk = field[SK];
		String nu_ordem = field[NU_ORDEM];

		System.out.println(sk + ":" + nu_ordem);

		ps.setInt(1, Integer.parseInt(nu_ordem));
		ps.setInt(2, Integer.parseInt(sk));

		ps.addBatch();
	    }

	    ps.executeBatch();

	    ps.close();
	    connection.close();

	    response.getWriter().print("ok");
	} catch (ClassNotFoundException | SQLException e) {
	    try {
		ps.close();
		connection.close();
	    } catch (SQLException e1) {
		response.getWriter().print(e.getMessage());
	    }

	    response.getWriter().print(e.getMessage());
	}

    }

}
