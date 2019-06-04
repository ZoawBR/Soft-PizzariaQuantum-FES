package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastrarPizza extends JFrame {
	
	private JLabel icone1Label;
	
	private JLabel saborLabel;
	private JLabel codigoLabel;
	private JLabel precoLabel;
	private JLabel mensagemLabel;
	
	private JTextField saborField;
	private JTextField codigoField;
	private JTextField precoField;
	
	private JButton cadastrarButton;
	
	public TelaCadastrarPizza() {
		super("Cadastrar Pizza");
		setBounds(100, 100, 294, 305);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		saborLabel = new JLabel("Sabor");
		saborLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		saborLabel.setBounds(20, 117, 46, 14);
		add(saborLabel);
		
		saborField = new JTextField(10);
		saborField.setBounds(96, 114, 86, 20);
		add(saborField);
		
		codigoLabel = new JLabel("Código");
		codigoLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		codigoLabel.setBounds(20, 154, 46, 14);
		add(codigoLabel);
		
		codigoField = new JTextField(10);
		codigoField.setBounds(96, 151, 86, 20);
		add(codigoField);
		
		precoLabel = new JLabel("Preço");
		precoLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		precoLabel.setBounds(20, 190, 46, 14);
		add(precoLabel);
		
		precoField = new JTextField(10);
		precoField.setBounds(96, 187, 86, 20);
		add(precoField);
		
		icone1Label = new JLabel();
		icone1Label.setIcon(new ImageIcon(TelaCadastrarPizza.class.getResource("/imagem/telacadastropizza.png")));
		icone1Label.setBounds(0, 0, 294, 300);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(91, 239, 91, 23);
		cadastrarButton.setBackground(Color.white);
		add(cadastrarButton);
		
		mensagemLabel = new JLabel("Cadastrar Pizza");
		mensagemLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		mensagemLabel.setBounds(88, 38, 117, 14);
		add(mensagemLabel);
		add(icone1Label);
		setVisible(false);
	}

	public JTextField getSaborField() {
		return saborField;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	
}
