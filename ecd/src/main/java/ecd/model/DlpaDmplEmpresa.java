package ecd.model;

import java.util.ArrayList;
import java.util.List;

public class DlpaDmplEmpresa {
    private int ano;
    private int codigoempresa;
    private List<DlpaDmplLinha> dlpaDmpl;

    public DlpaDmplEmpresa(int ano, int codigoempresa, List<DlpaDmplLinha> dlpaDmpl) {
	this.ano = ano;
	this.codigoempresa = codigoempresa;
	this.dlpaDmpl = new ArrayList<DlpaDmplLinha>(dlpaDmpl);
    }

    public int getAno() {
	return ano;
    }

    public int getCodigoempresa() {
	return codigoempresa;
    }

    public List<DlpaDmplLinha> getDlpaDmpl() {
	return new ArrayList<DlpaDmplLinha>(dlpaDmpl);
    }

}
