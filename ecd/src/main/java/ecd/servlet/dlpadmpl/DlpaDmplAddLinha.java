package ecd.servlet.dlpadmpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecd.source.SourceEcd;

@WebServlet("/dlpaDmplAddLinha")
public class DlpaDmplAddLinha extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DlpaDmplAddLinha() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// InputStream fileContent = filePart.getInputStream();

	String sk = request.getParameter("sk");

	int ano = Integer.parseInt(request.getParameter("ano"));
	int codigoempresa = Integer.parseInt(request.getParameter("codigoempresa"));
	int nu_ordem = Integer.parseInt("0" + request.getParameter("nu_ordem"));

	String ind_tip = request.getParameter("ind_tip");
	String cod_agl = request.getParameter("cod_agl");
	String descr_cod_agl = request.getParameter("descr_cod_agl");

	double vl_cta_ini = Double.parseDouble(request.getParameter("vl_cta_ini").replace(",", "."));
	String ind_dc_cta_ini = request.getParameter("ind_dc_cta_ini");
	double vl_cta_fin = Double.parseDouble(request.getParameter("vl_cta_fin").replace(",", "."));
	String ind_dc_cta_fin = request.getParameter("ind_dc_cta_fin");

	System.out.println("ano             :" + ano);
	System.out.println("codigoempresa   :" + codigoempresa);
	System.out.println("nu_ordem        :" + nu_ordem);
	System.out.println("cod_agl         :" + cod_agl);
	System.out.println("ind_tip         :" + ind_tip);

	System.out.println("descr_cod_agl   :" + descr_cod_agl);
	System.out.println("vl_cta_ini      :" + vl_cta_ini);
	System.out.println("ind_dc_cta_ini  :" + ind_dc_cta_ini);
	System.out.println("vl_cta_fin      :" + vl_cta_fin);
	System.out.println("ind_dc_cta_fin  :" + ind_dc_cta_fin);

	PreparedStatement ps = null;
	Connection connection = null;
	try {
	    connection = new SourceEcd().getConnection();
	    if (sk.length() == 0) {
		int next_nu_ordem = getNext_Nu_ordem(connection, codigoempresa, ano);

		ps = connection.prepareStatement(
			"insert into J210 (ano,codigoempresa,nu_ordem,cod_agl,descr_cod_agl,vl_cta_ini,ind_dc_cta_ini,vl_cta_fin,ind_dc_cta_fin,ind_tip) values (?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, ano);
		ps.setInt(2, codigoempresa);
		ps.setInt(3, next_nu_ordem);
		ps.setString(4, cod_agl);
		ps.setString(5, descr_cod_agl);
		ps.setDouble(6, vl_cta_ini);
		ps.setString(7, ind_dc_cta_ini);
		ps.setDouble(8, vl_cta_fin);
		ps.setString(9, ind_dc_cta_fin);
		ps.setString(10, ind_tip);
	    } else {
		ps = connection.prepareStatement("update J210 set nu_ordem=?,cod_agl=?,descr_cod_agl=?,vl_cta_ini=?,ind_dc_cta_ini=?,vl_cta_fin=?,ind_dc_cta_fin=?,ind_tip=? where sk=?");
		ps.setInt(1, nu_ordem);
		ps.setString(2, cod_agl);
		ps.setString(3, descr_cod_agl);
		ps.setDouble(4, vl_cta_ini);
		ps.setString(5, ind_dc_cta_ini);
		ps.setDouble(6, vl_cta_fin);
		ps.setString(7, ind_dc_cta_fin);
		ps.setString(8, ind_tip);
		ps.setString(9, sk);

	    }
	    ps.executeUpdate();
	    ps.close();
	    connection.close();

	    response.setCharacterEncoding("UTF-8");
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

    private int getNext_Nu_ordem(Connection c, int codigoempresa, int ano) throws SQLException {
	PreparedStatement st = c.prepareStatement("select top 1 nu_ordem from J210  where codigoempresa=? and ano=? order by nu_ordem desc");
	st.setInt(1, codigoempresa);
	st.setInt(2, ano);

	ResultSet rs = st.executeQuery();
	int next_Nu_ordem = 0;
	while (rs.next()) {
	    next_Nu_ordem = rs.getInt("nu_ordem");
	}
	rs.close();
	st.close();

	next_Nu_ordem++;
	// System.out.println("next nu_ordem: " + next_Nu_ordem);
	return next_Nu_ordem;
    }

}
