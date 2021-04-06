package com.xsaturncont.model;

public class Block implements Comparable<Block> {
	private String registro;
	private int nivel;
	private String ocorrencia;
	private String bloco;

	public Block(String bloco, String registro, int nivel, String ocorrencia) {
		this.bloco = bloco;
		this.registro = registro;
		this.nivel = nivel;
		this.ocorrencia = ocorrencia;
	}

	public String getRegistro() {
		return registro;
	}

	public int getNivel() {
		return nivel;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public String getBloco() {
		return bloco;
	}

	@Override
	public int compareTo(Block o) {
		if (o == null) {
			return -1;
		}

		return this.registro.compareTo(o.getRegistro());
	}

	@Override
	public String toString() {
		return registro + " : " + nivel + " : " + ocorrencia + " : " + bloco;
	}
}
