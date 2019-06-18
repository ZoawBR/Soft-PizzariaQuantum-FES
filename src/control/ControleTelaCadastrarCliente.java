package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import model.BaseDadosCliente;
import model.Cliente;
import view.TelaCadastrarCliente;
import view.TelaMensagem;
import view.TelaRelacaoClientes;
import view.TelaSite;

public class ControleTelaCadastrarCliente implements ActionListener{
	
	private TelaCadastrarCliente telaCadastrarCliente;
	private TelaRelacaoClientes telaRelacaoClientes;
	private TelaSite telaSite;
	public ControleTelaCadastrarCliente(TelaCadastrarCliente telaCadastrarCliente, TelaRelacaoClientes telaRelacaoClientes, TelaSite telaSite) {
		this.telaCadastrarCliente = telaCadastrarCliente;
		this.telaRelacaoClientes = telaRelacaoClientes;
		this.telaSite = telaSite;
		
		telaCadastrarCliente.getDadosPessoaisRadioButton().addActionListener(this);
		telaCadastrarCliente.getDadosLocalRadioButton().addActionListener(this);
		telaCadastrarCliente.getCadastrarButton().addActionListener(this);
		telaCadastrarCliente.getHomeButton().addActionListener(this);
	}

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
		
		if (telaCadastrarCliente.getDadosLocalRadioButton().isSelected()) {
			telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(false);
			telaCadastrarCliente.getDadosLocalPanel().setVisible(true);
		}
		else {
			telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(true);
			telaCadastrarCliente.getDadosLocalPanel().setVisible(false);
		}
		
		if (e.getSource() == telaCadastrarCliente.getCadastrarButton()) {

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
				
				DefaultTableModel model = ((DefaultTableModel) telaRelacaoClientes.getjTable().getModel());
				model.setNumRows(0);
				Object [] fila = new Object[4];
	
				for (Cliente cliente1 : BaseDadosCliente.getBaseClientes()) {
					fila[0] = cliente1.getNome();
					fila[1] = cliente1.getCpf();
					fila[2] = cliente1.getRua();
					fila[3] = cliente1.getCep();
					model.addRow(fila);
				}
				
			}			
			else {
				TelaMensagem.exibirMensagem("Opps... Parece que você já está cadastrado no Aplicativo");
			}
		}
		
		if (e.getSource() == telaCadastrarCliente.getHomeButton()) {
			telaCadastrarCliente.setVisible(false);
			telaSite.setVisible(true);
		}
		
		
		
	}
	
}
