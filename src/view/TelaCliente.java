package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaCliente extends JFrame {
	
	private JButton homeButton;
	private JButton menuButton;
	private JButton contaButton;
	
	private JPanel barraInferiorPanel;
	
	public TelaCliente() {
		setBounds(100, 100, 321, 584);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setBackground(Color.WHITE);
		
		barraInferiorPanel = new JPanel();
		barraInferiorPanel.setLayout(null);
		barraInferiorPanel.setBackground(Color.WHITE);
		barraInferiorPanel.setBounds(0, 502, 313, 35);
		add(barraInferiorPanel);
		
		homeButton = new JButton("Home");
		homeButton.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		homeButton.setForeground(Color.BLACK);
		homeButton.setBackground(Color.WHITE);
		homeButton.setBounds(10, 11, 70, 23);
		barraInferiorPanel.add(homeButton);
		
		menuButton = new JButton("Menu");
		menuButton.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		menuButton.setForeground(Color.BLACK);
		menuButton.setBackground(Color.WHITE);
		menuButton.setBounds(115, 11, 70, 23);
		barraInferiorPanel.add(menuButton);
		
		contaButton = new JButton("Conta");
		contaButton.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		contaButton.setForeground(Color.BLACK);
		contaButton.setBackground(Color.WHITE);
		contaButton.setBounds(219, 11, 70, 23);
		barraInferiorPanel.add(contaButton);
		
		
		
		setVisible(false);
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

	public JPanel getBarraInferiorPanel() {
		return barraInferiorPanel;
	}
	
}
