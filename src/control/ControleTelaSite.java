package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadastrarCliente;
import view.TelaLoginCliente;
import view.TelaSite;

public class ControleTelaSite implements ActionListener{

	private TelaSite telaSite;
	private TelaCadastrarCliente telaCadastrarCliente;
	private TelaLoginCliente telaLoginCliente;
	
	public ControleTelaSite(TelaSite telaSite, TelaCadastrarCliente telaCadastrarCliente, TelaLoginCliente telaLoginCliente) {
		this.telaSite = telaSite;
		this.telaCadastrarCliente = telaCadastrarCliente;
		this.telaLoginCliente = telaLoginCliente;
		
		telaSite.getCadastrarButton().addActionListener(this);
		telaSite.getLoginButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaSite.getCadastrarButton()) {
			telaCadastrarCliente.setVisible(true);
			telaSite.setVisible(false);
		}
		
		if (e.getSource() == telaSite.getLoginButton()) {
			telaLoginCliente.setVisible(true);
			telaSite.setVisible(false);
		}
		
	}
}
