package model;

import java.util.ArrayList;

public class BaseDadosOrdemServico {
	private static ArrayList<OrdemServico> baseOS = new ArrayList<OrdemServico>();
	// na base de ordem de servico não pode haver funções pra excluir e tals.
	// e tem que ter uma forma de mostrar a ordme de serviço para o funcionario.
	public static boolean addOS(OrdemServico os) {
		if (baseOS.add(os)) {
			return true;
		}else {
			return false;
		}
	}
	
	//como ira exibir os serviços? Jareatext?
}
