package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaSite extends TelaCliente {
	
	private JButton cadastrarButton;
	private JButton loginButton;
	private JButton homeButton;
	private JButton menuButton;
	private JButton contaButton;
	
	public TelaSite() {
		setTitle("QuantumPiza");
		
		cadastrarButton = new JButton("Cadastra-se");
		cadastrarButton.setBounds(29, 468, 111, 23);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(180, 468, 111, 23);
		
		add(cadastrarButton);
		add(loginButton);
		
		setVisible(true);
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public JButton getMenuButton() {
		return menuButton;
	}

	public JButton getContaButton() {
		return contaButton;
	}
	
}
