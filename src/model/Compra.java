package model;

public class Compra extends OrdemServico {

	public Compra(String nomeCliente, String cpf, String pedido, int preco) {
		super(nomeCliente, cpf, pedido, preco); 
		// no app pra fazer teste vc precisa usar a classe comprar porem tenho duvidas sobre se tem q 
		// cadastrar assim que vai pra classe ordem
		//de servico ou se vc faz BaseDadosOrdemServico.addOS(compra1); no app.
	}

}
