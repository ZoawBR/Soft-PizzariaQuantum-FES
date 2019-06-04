package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import model.Cliente;

public class TelaClienteLogado extends TelaCliente {
	
	private	JButton pedirPizzaButton, deslogarButton;
	private JLabel logoImagemLabel;
	private Cliente cliente;

	public TelaClienteLogado() {
		
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/logo.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 584);
		
		
		pedirPizzaButton = new JButton("Pedir Pizza");
		pedirPizzaButton.setBackground(Color.white);
		pedirPizzaButton.setBounds(29, 468, 111, 23);
		
		deslogarButton = new JButton("Deslogar");
		deslogarButton.setBackground(Color.white);
		deslogarButton.setBounds(180, 468, 111, 23);
		
		
		add(pedirPizzaButton);
		add(deslogarButton);
		add(logoImagemLabel);
		
		
		setVisible(false);
	}


	public JButton getPedirPizzaButton() {
		return pedirPizzaButton;
	}


	public void setPedirPizzaButton(JButton pedirPizzaButton) {
		this.pedirPizzaButton = pedirPizzaButton;
	}


	public JButton getDeslogarButton() {
		return deslogarButton;
	}


	public void setDeslogarButton(JButton deslogarButton) {
		this.deslogarButton = deslogarButton;
	}
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public JLabel getLogoImagemLabel() {
		return logoImagemLabel;
	}


	public void setLogoImagemLabel(JLabel logoImagemLabel) {
		this.logoImagemLabel = logoImagemLabel;
	}
	

}
