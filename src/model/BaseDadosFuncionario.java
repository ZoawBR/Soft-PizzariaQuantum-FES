package model;

import java.util.ArrayList;

public class BaseDadosFuncionario {
	
	private static ArrayList<Funcionario> baseFuncionario = new ArrayList<Funcionario>();
	
	public static boolean addFuncionario(Funcionario funcionario) {
		if (baseFuncionario.add(funcionario)) {
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean deletFuncionario(Funcionario funcionario) {
		if (existFuncionario(funcionario)) {
			for (Funcionario func : baseFuncionario) {
				if (func.getCpf().equals(funcionario.getCpf())) {
					baseFuncionario.remove(func);
					return true;
				}
			}
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
		for (Funcionario func : baseFuncionario) {
			if (func.getCpf().equals(funcionario.getCpf())) {
				return true;
			}
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
