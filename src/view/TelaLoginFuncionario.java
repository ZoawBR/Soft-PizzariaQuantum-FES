package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLoginFuncionario extends JFrame {

	private JLabel loginLabel;
	private JLabel senhaLabel;
	private JLabel mensagemLoginLabel;
	
	private JTextField loginField;
	private JPasswordField senhaField;
	
	private JButton logarButton;
	
	private JLabel iconeCadastrarFuncLabel;
	
	public TelaLoginFuncionario() {
		super("Login");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setBounds(100, 100, 315, 257);
	
		
		loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		loginLabel.setBounds(58, 91, 46, 20);
		loginLabel.setBackground(Color.white);
		add(loginLabel);
		
		loginField = new JTextField(10);
		loginField.setBounds(142, 88, 86, 20);
		loginField.setBackground(Color.white);
		add(loginField);
		
		senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		senhaLabel.setBounds(58, 126, 46, 14);
		senhaLabel.setBackground(Color.white);
		add(senhaLabel);
		
		senhaField = new JPasswordField(10);
		senhaField.setBounds(142, 120, 86, 20);
		senhaField.setBackground(Color.white);
		add(senhaField);
		
		mensagemLoginLabel = new JLabel("Login Funcionário");
		mensagemLoginLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		mensagemLoginLabel.setBounds(132, 38, 124, 39);
		mensagemLoginLabel.setBackground(Color.white);
		add(mensagemLoginLabel);
		
		
		logarButton = new JButton("Logar");
		logarButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logarButton.setBackground(Color.white);
		logarButton.setBounds(99, 173, 91, 23);
		add(logarButton);
		
		iconeCadastrarFuncLabel = new JLabel();
		iconeCadastrarFuncLabel.setIcon(new ImageIcon(TelaLoginFuncionario.class.getResource("/imagem/iconeLoginFuncionario.png")));
		iconeCadastrarFuncLabel.setBounds(0,0, 315, 257);
		iconeCadastrarFuncLabel.setBackground(Color.white);
		add(iconeCadastrarFuncLabel);
		
		setVisible(false);
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getLogarButton() {
		return logarButton;
	}

	public JLabel getIconeCadastrarFuncLabel() {
		return iconeCadastrarFuncLabel;
	}
	
}
