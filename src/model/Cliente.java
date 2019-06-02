package model;

public class Cliente extends Pessoa{
	
	private String login, senha;
	
	public Cliente(String nome, String cpf, int idade, String cidade, String rua, int num_casa, String cep, String login, String senha){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setCidade(cidade);
		this.setRua(rua);
		this.setNum_casa(num_casa);
		this.setCep(cep);
		this.login = login;
		this.senha = senha;	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
