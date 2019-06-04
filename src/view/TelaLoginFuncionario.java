package view;

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
		loginLabel.setBounds(58, 91, 46, 14);
		add(loginLabel);
		
		loginField = new JTextField(10);
		loginField.setBounds(142, 88, 86, 20);
		add(loginField);
		
		senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		senhaLabel.setBounds(58, 126, 46, 14);
		add(senhaLabel);
		
		senhaField = new JPasswordField(10);
		senhaField.setBounds(142, 120, 86, 20);
		add(senhaField);
		
		mensagemLoginLabel = new JLabel("Login Funcionário");
		mensagemLoginLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		mensagemLoginLabel.setBounds(132, 38, 124, 39);
		add(mensagemLoginLabel);
		
		iconeCadastrarFuncLabel = new JLabel();
		iconeCadastrarFuncLabel.setIcon(new ImageIcon(TelaLoginFuncionario.class.getResource("/imagem/iconeLoginFuncionario.png")));
		iconeCadastrarFuncLabel.setBounds(10, 11, 69, 69);
		add(iconeCadastrarFuncLabel);
		
		logarButton = new JButton("Logar");
		logarButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		logarButton.setBounds(99, 173, 91, 23);
		add(logarButton);
		
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
