package view;

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
		setLayout(new FlowLayout());
		setSize(100, 100);
		
		funcionarioButton = new JButton("Funcionário");
		clienteButton = new JButton("Cliente");
		
		add(funcionarioButton);
		add(clienteButton);
		
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
