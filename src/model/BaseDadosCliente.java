package model;

import java.util.ArrayList;

import view.TelaMensagem;

public class BaseDadosCliente {
	
	private static ArrayList<Cliente> baseClientes = new ArrayList<Cliente>();
	
	public static boolean addCliente(Cliente cliente) {

		if (existCLiente(cliente)) {
			return false;
		}
		else {
			return baseClientes.add(cliente);
		}
	}
	
	public static ArrayList<Cliente> getBaseClientes() {
		return baseClientes;
	}

	public static void setBaseClientes(ArrayList<Cliente> baseClientes) {
		BaseDadosCliente.baseClientes = baseClientes;
	}

	public static boolean deletCliente(Cliente cliente) {
		
		Cliente clienteAuxiliar = searchCliente(cliente);
		if (clienteAuxiliar != null) {
			return baseClientes.remove(clienteAuxiliar);
		}
		return false;
	}
	
	public static Cliente searchCliente(Cliente cliente) {
		for (Cliente cli : baseClientes) {
			if (cli.getCpf().equals(cliente.getCpf()) && cli.getLogin().equals(cliente.getLogin())) {
				return cli;
			}
		}
		return null;
	}
	
	public static boolean existCLiente(Cliente cliente) {
		
		Cliente clienteAuxiliar = searchCliente(cliente);
		if (clienteAuxiliar != null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static Cliente autenticarCliente(String login, String senha) {
		for (Cliente cli: baseClientes) {
			if (cli.getLogin().equals(login) && cli.getSenha().equals(senha)) {
				return cli;
			}
		}
		return null;
	}
	
	
	public static boolean temLogin(String login) {
		
		for (Cliente clienteAtual : baseClientes) {
			if (clienteAtual.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}
}
