package model;

public class Pizza {
	private int codigo, preco;
	private String sabor, tamanho;
	
	public Pizza(String sabor, int codigo, int preco) {
		this.sabor = sabor;
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


}
