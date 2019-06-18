package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDadosCliente;
import model.Cliente;
import view.TelaClienteLogado;
import view.TelaLoginCliente;
import view.TelaMensagem;
import view.TelaSite;

public class ControleTelaLoginCliente implements ActionListener{

	private TelaLoginCliente telaLoginCliente;
	private TelaSite telaSite;
	private TelaClienteLogado telaClienteLogado;
	
	public ControleTelaLoginCliente(TelaLoginCliente telaLoginCliente, TelaSite telaSite, TelaClienteLogado telaClienteLogado) {
		this.telaLoginCliente = telaLoginCliente;
		this.telaSite = telaSite;
		this.telaClienteLogado = telaClienteLogado;
		
		telaLoginCliente.getHomeButton().addActionListener(this);
		telaLoginCliente.getContaButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaLoginCliente.getHomeButton()) {
			telaSite.setVisible(true);
			telaLoginCliente.setVisible(false);
		}
		
		if (e.getSource() == telaLoginCliente.getLogarButton()) {
			String login = telaLoginCliente.getLoginField().getText();
			String senha = telaLoginCliente.getSenhaField().getText();
			
			Cliente cliente = BaseDadosCliente.autenticarCliente(login, senha);
			
			if (cliente != null) {
				telaClienteLogado.setCliente(BaseDadosCliente.searchCliente(cliente));
				telaLoginCliente.setVisible(false);
				telaClienteLogado.setVisible(true);
			}
			else {
				TelaMensagem.exibirMensagem("Login ou Senha incorretos");
			}
		}
		
		if (e.getSource() == telaLoginCliente.getContaButton()) {
			if (telaClienteLogado.getCliente() == null) {
				JOptionPane.showMessageDialog(null, "Você precisa está logado");
			}
		}
		
		
	}
}
