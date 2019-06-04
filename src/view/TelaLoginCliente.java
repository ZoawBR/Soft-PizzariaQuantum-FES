package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLoginCliente extends TelaCliente {
	
	private JLabel loginLabel;
	private JLabel senhaLabel;
	
	private JTextField loginField;
	private JPasswordField senhaField;
	
	private JButton esqueciSenhaButton;
	private JButton logarButton;
	
	private JLabel logoImagemLabel;
	
	public TelaLoginCliente() {
		
		
		setBackground(Color.WHITE);
		
		loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginLabel.setBounds(47, 171, 74, 23);
		add(loginLabel);
		
		loginField = new JTextField(10);
		loginField.setBounds(120, 171, 136, 25);
		add(loginField);
		
		senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		senhaLabel.setBounds(47, 225, 74, 23);
		add(senhaLabel);
		
		senhaField = new JPasswordField(10);
		senhaField.setBounds(120, 225, 136, 25);
		add(senhaField);
		
		esqueciSenhaButton = new JButton("Esqueci a Senha  :(");
		esqueciSenhaButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		esqueciSenhaButton.setBounds(10, 296, 150, 23);
		esqueciSenhaButton.setBackground(Color.white);
		add(esqueciSenhaButton);
		
		logarButton = new JButton("Logar já  :)");
		logarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		logarButton.setBackground(Color.white);
		logarButton.setBounds(188, 296, 100, 23);
		add(logarButton);
		
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/logologin.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 586);
		add(logoImagemLabel);
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getEsqueciSenhaButton() {
		return esqueciSenhaButton;
	}

	public JButton getLogarButton() {
		return logarButton;
	}
	
}
