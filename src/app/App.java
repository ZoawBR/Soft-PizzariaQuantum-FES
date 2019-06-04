package app;

import control.Controller;
import model.BaseDadosFuncionario;
import model.Funcionario;
import view.TelaCadastrarCliente;
import view.TelaCliente;
import view.TelaControlePizzaria;
import view.TelaLoginCliente;
import view.TelaLoginFuncionario;
import view.TelaPrincipalSoftware;
import view.TelaSite;

public class App {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("dudu", "123", "dudu", "dudu");
		BaseDadosFuncionario.baseFuncionario.add(funcionario);
		
		TelaCadastrarCliente telaCadastrarCliente = new TelaCadastrarCliente();
		TelaSite telaSite = new TelaSite();
		TelaCliente telaCliente = new TelaCliente();
		TelaLoginCliente telaLoginCliente = new TelaLoginCliente();
		TelaPrincipalSoftware telaPrincipalSoftware = new TelaPrincipalSoftware();
		TelaLoginFuncionario telaLoginFuncionario = new TelaLoginFuncionario();
		TelaControlePizzaria telaControlePizzaria = new TelaControlePizzaria();
		
		
		Controller controller = new Controller(telaCadastrarCliente, telaSite, telaCliente, telaLoginCliente,
											   telaPrincipalSoftware, telaLoginFuncionario, telaControlePizzaria);
		
	}	
}
