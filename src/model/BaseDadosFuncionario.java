package model;

import java.util.ArrayList;

public class BaseDadosFuncionario {
	
	public static ArrayList<Funcionario> baseFuncionario = new ArrayList<Funcionario>();
	
	public static boolean addFuncionario(Funcionario funcionario) {
		
		if (existFuncionario(funcionario)) {
			return false;
		}
		return baseFuncionario.add(funcionario);
	}
	
	public static boolean deletFuncionario(Funcionario funcionario) {
		
		Funcionario funcionarioAuxiliar = searchFuncioanrio(funcionario);
		if (funcionarioAuxiliar != null) {
			return baseFuncionario.remove(funcionarioAuxiliar);
		}
		return false;
	}
	
	public static Funcionario searchFuncioanrio(Funcionario funcionario) {
		for (Funcionario func : baseFuncionario) {
			if (func.getCpf().equals(funcionario.getCpf())) {
				return func;
			}
		}
		return null;
	}
	
	public static boolean existFuncionario(Funcionario funcionario) {
		
		Funcionario funcionarioAuxiliar = searchFuncioanrio(funcionario);
		if (funcionarioAuxiliar != null) {
			return true;
		}
		return false;
	}

	public static boolean verificarSenhaLoginFuncionario(String login, String senha) {
		for (Funcionario func: baseFuncionario) {
			if (func.getLoginadm().equals(login) && func.getSenhaadm().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
}
