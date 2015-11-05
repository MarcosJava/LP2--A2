package br.com.mrcsfelipe.sbv.model;

public class Modelo {
	
	private Long id;
	private String nome;
	
	public Modelo() {
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

	@Override
	public String toString() {
		return "Modelo [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
