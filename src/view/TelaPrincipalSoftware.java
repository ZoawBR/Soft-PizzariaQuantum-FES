package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipalSoftware extends JFrame {
	
	private JButton funcionarioButton;
	private JButton clienteButton;
	
	public TelaPrincipalSoftware() {
		super("Tela Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setSize(100, 100);
		
		funcionarioButton = new JButton("Funcionário");
		funcionarioButton.setBackground(Color.white);
		clienteButton = new JButton("Cliente");
		clienteButton.setBackground(Color.white);
		
		add(funcionarioButton);
		add(clienteButton);
		this.setBackground(Color.WHITE);
		pack();
		setVisible(true);
	}

	public JButton getFuncionarioButton() {
		return funcionarioButton;
	}

	public JButton getClienteButton() {
		return clienteButton;
	}
	
}
