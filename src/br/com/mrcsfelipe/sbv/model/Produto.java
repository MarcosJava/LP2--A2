package br.com.mrcsfelipe.sbv.model;

import java.util.Date;

public class Produto {

	private Long id;
	private String nome;
	private String marca;
	private Modelo modelo;
	private Date dataFabricacao;
	private Double valor;
	private Integer quantidadeEstoque;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", marca=" + marca
				+ ", modelo=" + modelo + ", dataFabricacao=" + dataFabricacao
				+ ", valor=" + valor + ", quantidadeEstoque="
				+ quantidadeEstoque + "]";
	}
	
	
	
	
	
	
}
