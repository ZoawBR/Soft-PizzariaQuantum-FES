package model;

import java.util.ArrayList;

public class BaseDadosOrdemServico {
	private static ArrayList<OrdemServico> baseOS = new ArrayList<OrdemServico>();
	// na base de ordem de servico n�o pode haver fun��es pra excluir e tals.
	// e tem que ter uma forma de mostrar a ordme de servi�o para o funcionario.
	public static boolean addOS(OrdemServico os) {
		if (baseOS.add(os)) {
			return true;
		}else {
			return false;
		}
	}
	
	//como ira exibir os servi�os? Jareatext?
}
