package ecd.servlet.planocontas;

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

@WebServlet("/AddContaEcd")
public class AddContaEcd extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddContaEcd() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String sk = request.getParameter("sk");
	String ano = request.getParameter("ano");
	String codigoempresa = request.getParameter("codigoempresa");

	String cod_cta = request.getParameter("cod_cta");
	String cod_cta_sup = request.getParameter("cod_cta_sup");
	String cod_nat = request.getParameter("cod_nat");
	String nivel = request.getParameter("nivel");
	String cod_cta_ref = request.getParameter("cod_cta_ref");
	String cod_agl = request.getParameter("cod_agl");

//	System.out.println("sk: " + sk);
//	System.out.println("ano: " + ano);
//	System.out.println("codigoempresa: " + codigoempresa);
//
//	System.out.println("cod_cta: " + cod_cta);
//	System.out.println("cod_cta_sup: " + cod_cta_sup);
//	System.out.println("cod_nat: " + cod_nat);
//	System.out.println("nivel: " + nivel);
//	System.out.println("cod_cta_ref: " + cod_cta_ref);
//	System.out.println("cod_agl: " + cod_agl);
//	System.out.println("------------------------------------------------------------------------------");
	Connection connection = null;
	PreparedStatement st = null;
	try {
	    connection = new SourceEcd().getConnection();

	    if (sk.length() == 0) {
		st = connection.prepareStatement("insert into I050 (ano,codigoempresa,cod_cta,cod_cta_sup,cod_nat,nivel,cod_cta_ref,cod_agl) values (?,?,?,?,?,?,?,?)");
		st.setString(1, ano);
		st.setString(2, codigoempresa);
		st.setString(3, cod_cta);
		st.setString(4, cod_cta_sup);
		st.setString(5, cod_nat);
		st.setString(6, nivel);
		st.setString(7, cod_cta_ref);
		st.setString(8, cod_agl);
	    } else {
		st = connection.prepareStatement("update I050 set cod_cta_sup=?,cod_nat=?,nivel=?,cod_cta_ref=?,cod_agl=? where sk=?");
		st.setString(1, cod_cta_sup);
		st.setString(2, cod_nat);
		st.setString(3, nivel);
		st.setString(4, cod_cta_ref);
		st.setString(5, cod_agl);
		st.setString(6, sk);
	    }
	    st.executeUpdate();
	    st.close();
	    connection.close();
	    response.getWriter().print("ok");
	} catch (ClassNotFoundException | SQLException e) {
	    try {
		st.close();
		connection.close();
	    } catch (SQLException e1) {
		response.getWriter().print(e.getMessage());
	    }
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().print(e.getMessage());
	}
    }
}
