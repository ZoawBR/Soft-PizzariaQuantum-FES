package model;

public abstract class Pessoa {
	
	private String nome, cpf;
	
	public boolean validarCPF(String cpf) {
		if (cpf.length() == 11 || cpf.length() == 14) {
			return true;
		}
		return false;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
