package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastrarCliente extends TelaCliente {

	private JPanel dadosPesssoaisPanel;
	private JPanel dadosLocalPanel;
	
	private JRadioButton dadosPessoaisRadioButton;
	private JRadioButton dadosLocalRadioButton;
	
	private ButtonGroup buttonGroup;
	
	private JButton cadastrarButton;
	
	private JLabel logoImagemLabel;
	private JLabel tipoDados;
	private JLabel nomeLabel;
	private JLabel cpfLabel;
	private JLabel loginLabel;
	private JLabel senhaLabel;
	private JLabel emailLabel;
	private JLabel foneLabel;
	private JLabel cadatraseButton;
	private JLabel estadoLabel;
	private JLabel cidadeLabel;
	private JLabel ruaLabel;
	private JLabel numeroLabel;
	private JLabel cepLabel;
	
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField loginField;
	private JPasswordField senhaField;
	private JTextField emailField;
	private JTextField foneField;
	private JTextField estadoField;
	private JTextField cidadeField;
	private JTextField ruaField;
	private JTextField numeroField;
	private JTextField cepField;
	
	
	public TelaCadastrarCliente() {
		setTitle("QuantumPiza");
		
		setBounds(100, 100, 321, 584);
		setLayout(null);
		setLocationRelativeTo(null);
		setBackground(Color.white);
//		cadatraseButton = new JLabel("Cadastre-se já  :)");
//		cadatraseButton.setForeground(Color.DARK_GRAY);
//		cadatraseButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
//		cadatraseButton.setBounds(10, 11, 162, 28);
//		add(cadatraseButton);
		
		tipoDados = new JLabel("Dados:");
		tipoDados.setForeground(new Color(0, 0, 0));
		tipoDados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tipoDados.setBounds(31, 107, 46, 14);
		add(tipoDados);
		
		dadosPessoaisRadioButton = new JRadioButton("Pessoais", true);
		dadosPessoaisRadioButton.setBounds(83, 98, 89, 35);
		dadosPessoaisRadioButton.setBackground(Color.WHITE);
		add(dadosPessoaisRadioButton);
		
		dadosLocalRadioButton = new JRadioButton("Físicos");
		dadosLocalRadioButton.setBounds(176, 104, 73, 23);
		dadosLocalRadioButton.setBackground(Color.WHITE);
		add(dadosLocalRadioButton);
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(dadosPessoaisRadioButton);
		buttonGroup.add(dadosLocalRadioButton);
		
		dadosPesssoaisPanel = new JPanel();
		dadosPesssoaisPanel.setBounds(57, 139, 191, 338);
		dadosPesssoaisPanel.setLayout(null);
		add(dadosPesssoaisPanel);

		nomeLabel = new JLabel("Nome:");
		nomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nomeLabel.setBounds(70, 11, 46, 14);
		dadosPesssoaisPanel.add(nomeLabel);
		
		nomeField = new JTextField(10);
		nomeField.setBounds(50, 36, 86, 20);
		nomeField.setColumns(10);
		dadosPesssoaisPanel.add(nomeField);
		
		cpfLabel = new JLabel("CPF:");
		cpfLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cpfLabel.setBounds(70, 67, 46, 14);
		dadosPesssoaisPanel.add(cpfLabel);
		
		cpfField = new JTextField(10);
		cpfField.setBounds(50, 92, 86, 20);
		cpfField.setColumns(10);
		dadosPesssoaisPanel.add(cpfField);

		emailLabel = new JLabel("E-mail:");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailLabel.setBounds(70, 123, 46, 14);
		dadosPesssoaisPanel.add(emailLabel);
		
		emailField = new JTextField(10);
		emailField.setBounds(50, 148, 86, 20);
		emailField.setColumns(10);
		dadosPesssoaisPanel.add(emailField);
		
		foneLabel = new JLabel("Fone:");
		foneLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		foneLabel.setBounds(70, 179, 46, 14);
		dadosPesssoaisPanel.add(foneLabel);
		
		foneField = new JTextField(10);
		foneField.setBounds(50, 204, 86, 20);
		foneField.setColumns(10);
		dadosPesssoaisPanel.add(foneField);
		
		loginLabel = new JLabel("Login:");
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		loginLabel.setBounds(70, 235, 46, 14);
		dadosPesssoaisPanel.add(loginLabel);
		
		loginField = new JTextField(10);
		loginField.setBounds(50, 256, 86, 20);
		loginField.setColumns(10);
		dadosPesssoaisPanel.add(loginField);
		
		senhaLabel = new JLabel("Senha:");
		senhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		senhaLabel.setBounds(70, 287, 46, 14);
		dadosPesssoaisPanel.add(senhaLabel);
		
		senhaField = new JPasswordField(10);
		senhaField.setBounds(50, 306, 86, 20);
		senhaField.setColumns(10);
		dadosPesssoaisPanel.add(senhaField);
		
		dadosLocalPanel = new JPanel();
		dadosLocalPanel.setBounds(57, 139, 191, 338);
		dadosLocalPanel.setLayout(null);
		add(dadosLocalPanel);
		
		estadoLabel = new JLabel("Estado");
		estadoLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		estadoLabel.setBounds(70, 11, 46, 14);
		dadosLocalPanel.add(estadoLabel);
		
		estadoField = new JTextField(10);
		estadoField.setBounds(50, 36, 86, 20);
		dadosLocalPanel.add(estadoField);
		
		cidadeLabel = new JLabel("Cidade");
		cidadeLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cidadeLabel.setBounds(70, 67, 46, 14);
		dadosLocalPanel.add(cidadeLabel);
		
		cidadeField = new JTextField(10);
		cidadeField.setBounds(50, 92, 86, 20);
		dadosLocalPanel.add(cidadeField);
		
		ruaLabel = new JLabel("Rua");
		ruaLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ruaLabel.setBounds(70, 123, 46, 14);
		dadosLocalPanel.add(ruaLabel);
		
		ruaField = new JTextField(10);
		ruaField.setBounds(50, 148, 86, 20);
		dadosLocalPanel.add(ruaField);
		
		numeroLabel = new JLabel("Número");
		numeroLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		numeroLabel.setBounds(70, 179, 46, 14);
		dadosLocalPanel.add(numeroLabel);
		
		numeroField = new JTextField(10);
		numeroField.setBounds(50, 204, 86, 20);
		dadosLocalPanel.add(numeroField);
		
		cepLabel = new JLabel("CEP");
		cepLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cepLabel.setBounds(70, 235, 46, 14);
		dadosLocalPanel.add(cepLabel);
		
		cepField = new JTextField(10);
		cepField.setBounds(50, 256, 86, 20);
		dadosLocalPanel.add(cepField);
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadastrarButton.setBounds(34, 315, 116, 23);
		cadastrarButton.setBackground(Color.white);
		dadosLocalPanel.add(cadastrarButton);
		
		dadosLocalPanel.setVisible(false);
		dadosPesssoaisPanel.setVisible(true);
		
		dadosPesssoaisPanel.setBackground(Color.WHITE);
		dadosLocalPanel.setBackground(Color.WHITE);
		
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/logocadastrar.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 586);
		add(logoImagemLabel);
		
		
		setVisible(false);
		
	}

	public JTextField getEstadoField() {
		return estadoField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public void setCpfField(JTextField cpfField) {
		this.cpfField = cpfField;
	}

	public void setLoginField(JTextField loginField) {
		this.loginField = loginField;
	}

	public void setSenhaField(JPasswordField senhaField) {
		this.senhaField = senhaField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}

	public void setFoneField(JTextField foneField) {
		this.foneField = foneField;
	}

	public void setCidadeField(JTextField cidadeField) {
		this.cidadeField = cidadeField;
	}

	public void setRuaField(JTextField ruaField) {
		this.ruaField = ruaField;
	}

	public void setEstadoField(JTextField estadoField) {
		this.estadoField = estadoField;
	}

	public void setNumeroField(JTextField numeroField) {
		this.numeroField = numeroField;
	}

	public void setCepField(JTextField cepField) {
		this.cepField = cepField;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JLabel getTipoDados() {
		return tipoDados;
	}

	public JTextField getCidadeField() {
		return cidadeField;
	}

	public JTextField getRuaField() {
		return ruaField;
	}

	public JTextField getNumeroField() {
		return numeroField;
	}

	public JRadioButton getDadosPessoaisRadioButton() {
		return dadosPessoaisRadioButton;
	}

	public JTextField getCepField() {
		return cepField;
	}

	public JRadioButton getDadosLocalRadioButton() {
		return dadosLocalRadioButton;
	}

	public JLabel getCadatraseButton() {
		return cadatraseButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getFoneField() {
		return foneField;
	}

	public JPanel getDadosPesssoaisPanel() {
		return dadosPesssoaisPanel;
	}

	public JPanel getDadosLocalPanel() {
		return dadosLocalPanel;
	}
	
	
}
