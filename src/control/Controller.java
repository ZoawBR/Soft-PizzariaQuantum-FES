package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDadosCliente;
import model.Cliente;
import view.TelaCadastrarCliente;
import view.TelaCliente;
import view.TelaLoginCliente;
import view.TelaMensagem;
import view.TelaSite;

public class Controller implements ActionListener {
	
	private TelaCadastrarCliente telaCadastrarCliente;
	private TelaSite telaSite;
	private TelaCliente telaCliente;
	private TelaLoginCliente telaLoginCliente;
		
	public Controller(TelaCadastrarCliente telaCadastrarCliente, TelaSite telaSite, TelaCliente telaCliente,
					  TelaLoginCliente telaLoginCliente) {
		this.telaCadastrarCliente = telaCadastrarCliente;
		this.telaSite = telaSite;
		this.telaCliente = telaCliente;
		this.telaLoginCliente = telaLoginCliente;
		
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
					TelaMensagem.exibirMensagem("Você deve preencher todos os campos");
					return;
				}
				
				Cliente cliente = new Cliente(nome, cpf, login, senha, cidade, rua, cep, Integer.parseInt(numCasa));
				
				if (BaseDadosCliente.addCliente(cliente)) {
					TelaMensagem.exibirMensagem("Você foi cadastrado com sucesso! :)");
				}			
				else {
					TelaMensagem.exibirMensagem("Opps... Parece que você já está cadastrado no Aplicativo");
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
					TelaMensagem.exibirMensagem("Você logou com Sucesso");
				}
				else {
					TelaMensagem.exibirMensagem("Login ou Senha incorretos");
				}
				
			}
		});
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
