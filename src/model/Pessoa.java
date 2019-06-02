package model;

public class Pessoa {
	
	private String nome, cpf, cidade, rua, cep;
	private int idade, num_casa;
	
	// isso é para caso queria cadastrar com . e - ou só os numeros, só vai entrar se for um desses dois casos 
	public boolean validarCPF(String cpf) {
		if (cpf.length() == 11 || cpf.length() == 14) {
			return true;
		}
		return false;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNum_casa() {
		return num_casa;
	}
	public void setNum_casa(int num_casa) {
		this.num_casa = num_casa;
	}
}
