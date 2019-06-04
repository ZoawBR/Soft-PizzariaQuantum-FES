package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.BaseDadosCliente;
import model.BaseDadosFuncionario;
import model.BaseDadosPizza;
import model.Cliente;
import model.Pizza;
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
import view.TelaMensagem;
import view.TelaPedirPizza;
import view.TelaPrincipalSoftware;
import view.TelaSite;

public class Controller implements ActionListener {
	
	private TelaCadastrarCliente telaCadastrarCliente;
	private TelaSite telaSite;
	private TelaCliente telaCliente;
	private TelaLoginCliente telaLoginCliente;
	private TelaPrincipalSoftware telaPrincipalSoftware;
	private TelaClienteLogado telaClienteLogado;
	private TelaPedirPizza telaPedirPizza;
	private TelaLoginFuncionario telaLoginFuncionario;
	private TelaControlePizzaria telaControlePizzaria;
	private TelaAtualizarConta telaAtualizarConta;
	private TelaCadastrarPizza telaCadastrarPizza;
	private TelaEstoquePizza telaEstoquePizza;
	private TelaHistoricoPedidos telaHistoricoPedidos;
		
	public Controller(TelaCadastrarCliente telaCadastrarCliente, TelaSite telaSite, TelaCliente telaCliente,
					  TelaLoginCliente telaLoginCliente, TelaPrincipalSoftware telaPrincipalSoftware, TelaClienteLogado telaClienteLogado,
					  TelaPedirPizza telaPedirPizza, TelaLoginFuncionario telaLoginFuncionario, TelaControlePizzaria telaControlePizzaria,
					  TelaAtualizarConta telaAtualizarConta, TelaEstoquePizza telaEstoquePizza, TelaCadastrarPizza telaCadastrarPizza,
					  TelaHistoricoPedidos telaHistoricoPedidos) {
		
		this.telaCadastrarCliente = telaCadastrarCliente;
		this.telaSite = telaSite;
		this.telaCliente = telaCliente;
		this.telaLoginCliente = telaLoginCliente;
		this.telaPrincipalSoftware = telaPrincipalSoftware;
		this.telaClienteLogado = telaClienteLogado;
		this.telaPedirPizza = telaPedirPizza;
		this.telaLoginFuncionario = telaLoginFuncionario;
		this.telaControlePizzaria = telaControlePizzaria;
		this.telaAtualizarConta = telaAtualizarConta;
		this.telaCadastrarPizza = telaCadastrarPizza;
		this.telaEstoquePizza = telaEstoquePizza;
		this.telaHistoricoPedidos = telaHistoricoPedidos;
		
		control();
	}
	
	public void control() {
		
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
					telaCadastrarCliente.getNomeField().setText("");
					telaCadastrarCliente.getCpfField().setText("");
					telaCadastrarCliente.getLoginField().setText("");
					telaCadastrarCliente.getSenhaField().setText("");
					telaCadastrarCliente.getCidadeField().setText("");
					telaCadastrarCliente.getRuaField().setText("");
					telaCadastrarCliente.getCepField().setText("");
					telaCadastrarCliente.getNumeroField().setText("");
					// arrumar
					telaCadastrarCliente.getEmailField().setText("");
					telaCadastrarCliente.getEstadoField().setText("");
					telaCadastrarCliente.getFoneField().setText("");
			
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
					telaClienteLogado.setCliente(BaseDadosCliente.searchCliente(cliente));
					telaLoginCliente.setVisible(false);
					telaClienteLogado.setVisible(true);
				}
				else {
					TelaMensagem.exibirMensagem("Login ou Senha incorretos");
				}
				
			}
		});
		
		telaLoginCliente.getContaButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaClienteLogado.getCliente() == null) {
				JOptionPane.showMessageDialog(null, "Voc� precisa est� logado");
				}
			}
		});
		
		// Tela Cliente Logado
		telaClienteLogado.getPedirPizzaButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(telaClienteLogado.getCliente().getNome());
				telaClienteLogado.setVisible(false);
				telaPedirPizza.setVisible(true);
				telaPedirPizza.getCombobox().removeAllItems();
				
				for (Pizza pizza : BaseDadosPizza.getBasePizza()) {
					telaPedirPizza.getCombobox().addItem(pizza.getSabor());
				}	
				telaPedirPizza.getCombobox().setSelectedItem(null);
			}
		});
		
		telaClienteLogado.getDeslogarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaClienteLogado.setCliente(null);
				telaClienteLogado.setVisible(false);
				telaSite.setVisible(true);
			}
		
		});
		
		telaClienteLogado.getHomeButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaClienteLogado.setCliente(null);
				telaClienteLogado.setVisible(false);
				telaSite.setVisible(true);				
			}
		});
		
		telaClienteLogado.getContaButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaClienteLogado.setVisible(false);
				telaAtualizarConta.setVisible(true);
				telaAtualizarConta.getNomefiled().setText(telaClienteLogado.getCliente().getNome());
				telaAtualizarConta.getCidadefield().setText(telaClienteLogado.getCliente().getCidade());
				telaAtualizarConta.getRuafield().setText(telaClienteLogado.getCliente().getRua());
				telaAtualizarConta.getCepfield().setText(telaClienteLogado.getCliente().getCep());
			}
		});
		
		//tela pedir pizza
				telaPedirPizza.getComprarButton().addActionListener(new ActionListener() {
					int mult;
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if (telaPedirPizza.getPequenaPizza().isSelected()) {
							mult = 1;
						}
						else if (telaPedirPizza.getMediaPizza().isSelected()) {
							mult = 2;
						}
						else if (telaPedirPizza.getGrandePizza().isSelected()) {
							mult = 3;
						}
						
						String tamanho;
						if (mult == 1) {
							tamanho = "Pequena";
						}
						else if (mult == 2) {
							tamanho = "M�dia";
						}
						else {
							tamanho = "Grande";
						}
						
						
						Pizza pizza = BaseDadosPizza.searchPizza((String) telaPedirPizza.getCombobox().getSelectedItem());
						int preco = pizza.getPreco() * mult;

						Object [] fila = new Object[5];
						fila[0] = telaClienteLogado.getCliente().getNome();
						fila[1] = telaClienteLogado.getCliente().getCpf();
						fila[2] = pizza.getSabor();
						fila[3] = tamanho;
						fila[4] = preco;
						
						((DefaultTableModel) telaHistoricoPedidos.getjTable().getModel()).addRow(fila);
						
						JOptionPane.showMessageDialog(null, "Valor a ser pago: " + preco);
						////////////////////////////////////////////////////////////////////////////////////////////////////////
						telaPedirPizza.setVisible(false);
						telaClienteLogado.setVisible(true);
					}
				});
		
		telaPedirPizza.getHomeButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaPedirPizza.setVisible(false);
				telaClienteLogado.setVisible(true);
			}
		});
		
		telaControlePizzaria.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaControlePizzaria.setVisible(false);
				telaLoginFuncionario.setVisible(false);
				
			}
		});
		
		telaControlePizzaria.getEstoqueButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaEstoquePizza.setVisible(true);
			}
		});
		
		telaAtualizarConta.getAtualizarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Cliente cliente : BaseDadosCliente.getBaseClientes()) {
					if (telaClienteLogado.getCliente().getCpf().equals(cliente.getCpf())) {
						cliente.setNome(telaAtualizarConta.getNomefiled().getText());
						cliente.setCidade(telaAtualizarConta.getCidadefield().getText());
						cliente.setRua(telaAtualizarConta.getNomefiled().getText());
						cliente.setCep(telaAtualizarConta.getCepfield().getText());
						JOptionPane.showMessageDialog(null, "Contato Atualizado!!");
						telaAtualizarConta.setVisible(false);
						telaClienteLogado.setVisible(true);
						break;
					}
				}
				JOptionPane.showMessageDialog(null, "Contato N�o Existe");
			}
		});
		
		// Tela Controle Pizzaria
				telaControlePizzaria.getCadastroPizzaButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						telaCadastrarPizza.setVisible(true);
					}
				});
				
				telaControlePizzaria.getEstoqueButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						telaEstoquePizza.setVisible(true);
					}
				});
				
				telaControlePizzaria.getPedidosButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						telaHistoricoPedidos.setVisible(true);
					}
				});
				
				
				// Tela Cadastrar Pizza
				telaCadastrarPizza.getCadastrarButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Pizza pizza = new Pizza(telaCadastrarPizza.getSaborField().getText(), 
												Integer.parseInt(telaCadastrarPizza.getCodigoField().getText()), 
												Integer.parseInt(telaCadastrarPizza.getPrecoField().getText()));
						
						//int numeroColunas = telaEstoquePizza.getjTable().getModel().getColumnCount();
						
						Object [] fila = new Object[3];
						fila[0] = pizza.getSabor();
						fila[1] = pizza.getCodigo();
						fila[2] = pizza.getPreco();
						
						((DefaultTableModel) telaEstoquePizza.getjTable().getModel()).addRow(fila);
						BaseDadosPizza.basePizza.add(pizza);
					}
				});
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
