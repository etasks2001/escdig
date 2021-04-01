package ecd.servlet.dlpadmpl;

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

@WebServlet("/dlpaDmplApagarLinha")
public class DlpaDmplApagarLinha extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DlpaDmplApagarLinha() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection connection = null;
	PreparedStatement ps = null;
	try {

	    int sk = Integer.parseInt(request.getParameter("sk"));

	    connection = new SourceEcd().getConnection();

	    ps = connection.prepareStatement("delete from J210 where sk = ?");
	    ps.setInt(1, sk);
	    ps.executeUpdate();

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
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().print(e.getMessage());
	}
    }
}
