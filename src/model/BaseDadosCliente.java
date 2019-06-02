package model;

import java.util.ArrayList;

public class BaseDadosCliente {
	
	private static ArrayList<Cliente> baseClientes = new ArrayList<Cliente>();
	
	public static boolean addCliente(Cliente cliente) {
		if (baseClientes.add(cliente)) {
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean deletCliente(Cliente cliente) {
		if (existCLiente(cliente)) {
			for (Cliente cli : baseClientes) {
				if (cli.getCpf().equals(cliente.getCpf())) {
					baseClientes.remove(cli);
					return true;
				}
			}
		}
		return false;
	}
	
	public static Cliente searchCliente(Cliente cliente) {
		for (Cliente cli : baseClientes) {
			if (cli.getCpf().equals(cliente.getCpf())) {
				return cli;
			}
		}
		return null;
	}
	
	public static boolean existCLiente(Cliente cliente) {
		for (Cliente cli : baseClientes) {
			if (cli.getCpf().equals(cliente.getCpf())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean verificarSenhaLoginCliente(String login, String senha) {
		for (Cliente cli: baseClientes) {
			if (cli.getLogin().equals(login) && cli.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
}
