package ecd.model;

import java.util.Comparator;

public class ContaEmpresa implements Comparator<ContaEmpresa> {
    private String conta;
    private String tipoconta;
    private String descricao;
    private ContaEcd contaEcd;

    public ContaEmpresa(String conta, String tipoconta, String descricao) {
	super();
	this.conta = conta;
	this.tipoconta = tipoconta;
	this.descricao = descricao;
    }

    public String getConta() {
	return conta;
    }

    public String getTipoconta() {
	return tipoconta;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setContaEcd(ContaEcd contaEcd) {
	this.contaEcd = contaEcd;
    }

    public ContaEcd getContaEcd() {
	return contaEcd;
    }

    @Override
    public int compare(ContaEmpresa a, ContaEmpresa b) {
	return a.getConta().compareTo(b.getConta());
    }
}
