package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDadosCliente;
import model.BaseDadosFuncionario;
import model.Cliente;
import model.Funcionario;
import view.TelaCadastrarCliente;
import view.TelaCliente;
import view.TelaControlePizzaria;
import view.TelaLoginCliente;
import view.TelaLoginFuncionario;
import view.TelaMensagem;
import view.TelaPrincipalSoftware;
import view.TelaSite;

public class Controller implements ActionListener {
	
	private TelaCadastrarCliente telaCadastrarCliente;
	private TelaSite telaSite;
	private TelaCliente telaCliente;
	private TelaLoginCliente telaLoginCliente;
	private TelaPrincipalSoftware telaPrincipalSoftware;
	private TelaLoginFuncionario telaLoginFuncionario;
	private TelaControlePizzaria telaControlePizzaria;
		
	public Controller(TelaCadastrarCliente telaCadastrarCliente, TelaSite telaSite, TelaCliente telaCliente,
					  TelaLoginCliente telaLoginCliente, TelaPrincipalSoftware telaPrincipalSoftware,
					  TelaLoginFuncionario telaLoginFuncionario, TelaControlePizzaria telaControlePizzaria) {
		
		this.telaCadastrarCliente = telaCadastrarCliente;
		this.telaSite = telaSite;
		this.telaCliente = telaCliente;
		this.telaLoginCliente = telaLoginCliente;
		this.telaPrincipalSoftware = telaPrincipalSoftware;
		this.telaLoginFuncionario = telaLoginFuncionario;
		this.telaControlePizzaria = telaControlePizzaria;
		
		control();
	}
	
	public void control() {
		
		// Tela Cadastrar Cliente:
		telaCadastrarCliente.getDadosPessoaisRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaCadastrarCliente.getDadosPessoaisRadioButton().isSelected()) {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(true);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(false);
				}
				else {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(false);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(true);
				}
			}
		});
		
		telaCadastrarCliente.getDadosLocalRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaCadastrarCliente.getDadosLocalRadioButton().isSelected()) {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(false);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(true);
				}
				else {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(true);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(false);
				}
			}
		});
		
		telaCadastrarCliente.getCadastrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String nome = telaCadastrarCliente.getNomeField().getText();
				String cpf = telaCadastrarCliente.getCpfField().getText();
				String login = telaCadastrarCliente.getLoginField().getText();
				String senha = telaCadastrarCliente.getSenhaField().getText();
				String cidade = telaCadastrarCliente.getCidadeField().getText();
				String rua = telaCadastrarCliente.getRuaField().getText();
				String cep = telaCadastrarCliente.getCepField().getText();
				String numCasa = telaCadastrarCliente.getNumeroField().getText();
				
				if (nome.length() == 0 || cpf.length() == 0 || login.length() == 0 || senha.length() == 0 ||
					cidade.length() == 0 || rua.length() == 0 || cep.length() == 0 || numCasa.length() == 0) 
				{
					TelaMensagem.exibirMensagem("Voc� deve preencher todos os campos");
					return;
				}
				
				Cliente cliente = new Cliente(nome, cpf, login, senha, cidade, rua, cep, Integer.parseInt(numCasa));
				
				if (BaseDadosCliente.addCliente(cliente)) {
					TelaMensagem.exibirMensagem("Voc� foi cadastrado com sucesso! :)");
				}			
				else {
					TelaMensagem.exibirMensagem("Opps... Parece que voc� j� est� cadastrado no Aplicativo");
				}

			}
		});
		
		telaCadastrarCliente.getHomeButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaCadastrarCliente.setVisible(false);
				telaSite.setVisible(true);
			}
		});
		
		
		// Tela Site
		telaSite.getCadastrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				telaCadastrarCliente.setVisible(true);
				telaSite.setVisible(false);
			}
		});
		
		telaSite.getLoginButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaLoginCliente.setVisible(true);
				telaSite.setVisible(false);
			}
		});
		
		
		// Tela Login Cliente
		telaLoginCliente.getHomeButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaSite.setVisible(true);
				telaLoginCliente.setVisible(false);
			}
		});
		
		telaLoginCliente.getLogarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String login = telaLoginCliente.getLoginField().getText();
				String senha = telaLoginCliente.getSenhaField().getText();
				
				Cliente cliente = BaseDadosCliente.autenticarCliente(login, senha);
				
				if (cliente != null) {
					TelaMensagem.exibirMensagem("Voc� logou com Sucesso");
				}
				else {
					TelaMensagem.exibirMensagem("Login ou Senha incorretos");
				}
				
			}
		});
		
		
		// Tela Principal Software
		telaPrincipalSoftware.getClienteButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				telaSite.setVisible(true);
			}
		});
		
		telaPrincipalSoftware.getFuncionarioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaLoginFuncionario.setVisible(true);
			}
		});
		
		// ************ Come�a Aqui **************************
		// Tela Login Funcion�rio
		telaLoginFuncionario.getLogarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String login = telaLoginFuncionario.getLoginField().getText();
				String senha = telaLoginFuncionario.getSenhaField().getText();
				
				if (login.equals("admin") && senha.equals("adim")) {
					
				}
				
				if (BaseDadosFuncionario.verificarSenhaLoginFuncionario(login, senha)) {
					TelaMensagem.exibirMensagem("Logado com Sucesso");
					telaControlePizzaria.setVisible(true);
					telaLoginFuncionario.setVisible(false);
				}
				else {
					TelaMensagem.exibirMensagem("Login ou Senha incorretos");
				}
				
				
			}
		});
		// ************ Termina Aqui ********************
		
		
		// Tela Controle Pizzaria
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
