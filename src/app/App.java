package app;

import control.Controller;
import model.BaseDadosCliente;
import model.BaseDadosFuncionario;
import model.BaseDadosPizza;
import model.Cliente;
import model.Funcionario;
import model.Pizza;
import view.TelaAtualizarConta;
import view.TelaCadastrarBebida;
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
import view.TelaRelacaoClientes;
import view.TelaRelatorioDia;
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
		TelaRelatorioDia telaRelatorioDia = new TelaRelatorioDia();
		TelaRelacaoClientes telaRelacaoClientes = new TelaRelacaoClientes();
		TelaCadastrarBebida telaCadastrarBebida = new TelaCadastrarBebida();
		
		
//		telaPrincipalSoftware.setVisible(false);
//		telaPedirPizza.setVisible(true);
		
		Funcionario funcionario = new Funcionario("dudu", "123", "dudu", "dudu");
		BaseDadosFuncionario.baseFuncionario.add(funcionario);
		
		Cliente cliente = new Cliente("Inacio", "00012345600", "inacio", "123", "serra talhada", "av manuel", "00012311", 000020);
		BaseDadosCliente.addCliente(cliente);
		
		Cliente cliente1 = new Cliente("Jonas", "12345678900", "jonas", "123", "serra talhada", "av manuel", "00012311", 0001200);
		BaseDadosCliente.addCliente(cliente1);
		
	
		
		Controller controller = new Controller(telaCadastrarCliente, telaSite, telaCliente, telaLoginCliente,
											   telaPrincipalSoftware, telaClienteLogado, telaPedirPizza, telaLoginFuncionario, telaControlePizzaria,
											   telaAtualizarConta,telaEstoquePizza,telaCadastrarPizza,telaHistoricoPedidos,
											   telaRelatorioDia, telaRelacaoClientes, telaCadastrarBebida);
		
	}	
}
