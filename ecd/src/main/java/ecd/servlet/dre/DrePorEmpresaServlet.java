package ecd.servlet.dre;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ecd.dados.ecd.DREEmpresaLinha;
import ecd.model.DREEmpresa;

@WebServlet("/drePorEmpresa")
public class DrePorEmpresaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DrePorEmpresaServlet() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Gson gson = new Gson();

	final int empresa = Integer.parseInt(request.getParameter("empresa"));
	final int ano = Integer.parseInt("0" + request.getParameter("ano"));

	DREEmpresa contas = new DREEmpresa(ano, empresa, new DREEmpresaLinha().get(empresa, ano));

	String json = gson.toJson(contas);

	response.setContentType("application/json");
	response.getWriter().print(json);
    }
}
