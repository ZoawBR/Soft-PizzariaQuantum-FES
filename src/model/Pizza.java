package model;

public class Pizza {
	private int codigo, preco;
	private String nome, tamanho;
	
	public Pizza(String nome, int codigo, int preco, String tam) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
