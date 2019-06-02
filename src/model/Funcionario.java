package model;

public class Funcionario extends Pessoa{
	private String loginadm, senhaadm; // botei adm pra vc ver que quem usar esse login e senha ira para a tela sem ser de compra 
								// e quem tem esse login pode ter uma conta de cliente tbm 
	
	public Funcionario(String nome, String cpf, int idade, String cidade, String rua, int num_casa, String cep, String login, String senha){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setCidade(cidade);
		this.setRua(rua);
		this.setNum_casa(num_casa);
		this.setCep(cep);
		this.loginadm = login;
		this.senhaadm = senha;	
	}

	public String getLoginadm() {
		return loginadm;
	}

	public void setLoginadm(String loginadm) {
		this.loginadm = loginadm;
	}

	public String getSenhaadm() {
		return senhaadm;
	}

	public void setSenhaadm(String senhaadm) {
		this.senhaadm = senhaadm;
	}
	
}
