package model;

public class Funcionario extends Pessoa {
	private String loginadm, senhaadm;  // e quem tem esse login pode ter uma conta de cliente tbm 
	
	public Funcionario(String nome, String cpf, String loginadm, String senhaadm) {
		super(nome, cpf);
		this.loginadm = loginadm;
		this.senhaadm = senhaadm;
	}

	public String getLoginadm() {
		return loginadm;
	}

	public String getSenhaadm() {
		return senhaadm;
	}
	
}
