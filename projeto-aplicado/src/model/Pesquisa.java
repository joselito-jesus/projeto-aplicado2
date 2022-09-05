package model;

import java.sql.Date;

public class Pesquisa {

	private int id;
	private String instituto;
	private Date dataPesquisa;
	private String uf;
	private String tipoPesquisa;
	private String formato;
	private String tipo;
	private int mediaidade;
	
	
	public Pesquisa(String instituto, String uf, int mediaidade) {
		this.instituto = instituto;
		this.uf = uf;
		this.mediaidade = mediaidade;
	}


	public Pesquisa() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getInstituto() {
		return instituto;
	}


	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}


	public Date getDataPesquisa() {
		return dataPesquisa;
	}


	public void setDataPesquisa(Date dataPesquisa) {
		this.dataPesquisa = dataPesquisa;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getTipoPesquisa() {
		return tipoPesquisa;
	}


	public void setTipoPesquisa(String tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getMediaidade() {
		return mediaidade;
	}


	public void setMediaidade(int mediaidade) {
		this.mediaidade = mediaidade;
	}
	public String toString() {
		return "Instituto: " + instituto + " - UF: " + uf + " - Idade média: " + mediaidade + " - Tipo de pesquisa: " + tipoPesquisa;
	}
	
}