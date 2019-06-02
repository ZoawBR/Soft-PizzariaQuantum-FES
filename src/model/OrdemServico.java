package model;

public class OrdemServico {
	private String nomeCliente, pedido, cpf;
	private int preco;
	
	public OrdemServico(String nomeCliente, String cpf,String pedido,int preco){
		this.nomeCliente = nomeCliente;
		this.pedido = pedido;
		this.preco = preco; // n�s s� entrega pizza kkkkk ent o pre�o � apenas para a pizza, asism fica mais simples kkk
		this.cpf = cpf; // nao deixei s� o nome pq seria dificil cadastrar numa base de dados grande
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
}
