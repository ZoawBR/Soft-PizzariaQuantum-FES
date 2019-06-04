package app;

import control.Controller;
import model.BaseDadosCliente;
import model.BaseDadosFuncionario;
import model.Cliente;
import model.Funcionario;
import view.TelaAtualizarConta;
import view.TelaCadastrarCliente;
import view.TelaCadastrarPizza;
import view.TelaCliente;
import view.TelaClienteLogado;
import view.TelaControlePizzaria;
import view.TelaEstoquePizza;
import view.TelaHistoricoPedidos;
import view.TelaLoginCliente;
import view.TelaLoginFuncionario;
import view.TelaPedirPizza;
import view.TelaPrincipalSoftware;
import view.TelaSite;

public class App {
	
	public static void main(String[] args) {
		TelaCadastrarCliente telaCadastrarCliente = new TelaCadastrarCliente();
		TelaSite telaSite = new TelaSite();
		TelaCliente telaCliente = new TelaCliente();
		TelaLoginCliente telaLoginCliente = new TelaLoginCliente();
		TelaPrincipalSoftware telaPrincipalSoftware = new TelaPrincipalSoftware();
		TelaClienteLogado telaClienteLogado = new TelaClienteLogado();
		TelaPedirPizza telaPedirPizza = new TelaPedirPizza();
		TelaLoginFuncionario telaLoginFuncionario = new TelaLoginFuncionario();
		TelaControlePizzaria telaControlePizzaria = new TelaControlePizzaria();
		TelaAtualizarConta telaAtualizarConta = new TelaAtualizarConta();
		TelaCadastrarPizza telaCadastrarPizza = new TelaCadastrarPizza();
		TelaEstoquePizza telaEstoquePizza = new TelaEstoquePizza();
		TelaHistoricoPedidos telaHistoricoPedidos = new TelaHistoricoPedidos();
		
//		telaPrincipalSoftware.setVisible(false);
//		telaPedirPizza.setVisible(true);
		
		Funcionario funcionario = new Funcionario("dudu", "123", "dudu", "dudu");
		BaseDadosFuncionario.baseFuncionario.add(funcionario);
		
		Cliente cliente = new Cliente("Inacio", "00012345600", "inacio", "123", "serra talhada", "av manuel", "00012311", 000000);
		BaseDadosCliente.addCliente(cliente);
		
		Controller controller = new Controller(telaCadastrarCliente, telaSite, telaCliente, telaLoginCliente,
											   telaPrincipalSoftware, telaClienteLogado, telaPedirPizza, telaLoginFuncionario, telaControlePizzaria,
											   telaAtualizarConta,telaEstoquePizza,telaCadastrarPizza,telaHistoricoPedidos);
		
	}	
}
