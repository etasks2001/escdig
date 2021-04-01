package ecd.model;

import java.util.ArrayList;
import java.util.List;

public class DREEmpresa {
    private int ano;
    private int codigoempresa;
    private List<DRELinha> dre;

    public DREEmpresa(int ano, int codigoempresa, List<DRELinha> dre) {
	this.ano = ano;
	this.codigoempresa = codigoempresa;
	this.dre = new ArrayList<DRELinha>(dre);
    }

    public int getAno() {
	return ano;
    }

    public int getCodigoempresa() {
	return codigoempresa;
    }

    public List<DRELinha> getDre() {
	return new ArrayList<DRELinha>(dre);
    }

}
