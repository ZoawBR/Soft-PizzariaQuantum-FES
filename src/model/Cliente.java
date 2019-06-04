package model;

public class Cliente extends Pessoa {
	
	private String login, senha;
	private String cidade, rua, cep;
	private int numCasa;
	
	public Cliente(String nome, String cpf, String login, String senha, String cidade, String rua, String cep, int numCasa) {
		super(nome, cpf);
		this.login = login;
		this.senha = senha;
		this.cidade = cidade;
		this.rua = rua;
		this.cep = cep;
		this.numCasa = numCasa;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getCidade() {
		return cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

}
