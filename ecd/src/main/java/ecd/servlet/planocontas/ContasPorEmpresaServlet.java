package ecd.servlet.planocontas;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ecd.control.MergeContas;
import ecd.model.ContasEmpresa;

@WebServlet("/contasPorEmpresa")
public class ContasPorEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = -5773169418881677789L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	Gson gson = new Gson();

	final int empresa = Integer.parseInt(request.getParameter("empresa"));
	final int ano = Integer.parseInt("0" + request.getParameter("ano"));

	ContasEmpresa contas = new ContasEmpresa(empresa, ano, new MergeContas().getContas(empresa, ano));

	String json = gson.toJson(contas);

	response.setContentType("application/json");
	response.getWriter().print(json);
    }
}