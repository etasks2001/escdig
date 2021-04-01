package ecd.model;

import java.util.ArrayList;
import java.util.List;

public class BalancoEmpresa {
    private int ano;
    private int codigoempresa;
    private List<BalancoLinha> balanco;

    public BalancoEmpresa(int ano, int codigoempresa, List<BalancoLinha> balanco) {
	this.ano = ano;
	this.codigoempresa = codigoempresa;
	this.balanco = new ArrayList<BalancoLinha>(balanco);
    }

    public int getAno() {
	return ano;
    }

    public int getCodigoempresa() {
	return codigoempresa;
    }

    public List<BalancoLinha> getBalanco() {
	return new ArrayList<BalancoLinha>(balanco);
    }

}
