package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class TelaSite extends TelaCliente {
	
	private JButton cadastrarButton;
	private JButton loginButton;
	private JButton homeButton;
	private JButton menuButton;
	private JButton contaButton;
	
	private JLabel logoImagemLabel;
	
	public TelaSite() {
		setTitle("QuantumPiza");
		
		setBackground(Color.WHITE);
		
		cadastrarButton = new JButton("Cadastra-se");
		cadastrarButton.setBounds(29, 468, 111, 23);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(180, 468, 111, 23);
		
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/logo.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 285);
		
		add(cadastrarButton);
		add(loginButton);
		add(logoImagemLabel);
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
