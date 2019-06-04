package view;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import model.Cliente;

public class TelaPedirPizza extends TelaCliente{
	
	private	JButton comprarButton;
	private JLabel logoImagemLabel;
	private Cliente cliente;
	private JRadioButton pequenaPizza, mediaPizza, grandePizza;
	private ButtonGroup grupoPizza;
	private JComboBox combobox;
	
	public TelaPedirPizza() {
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/logocadastrar.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 584);
		
		grupoPizza = new ButtonGroup();
		
		combobox = new JComboBox();
		combobox.setBounds(50, 250, 210, 20);
		combobox.setSelectedItem(null);
		combobox.setBackground(Color.white);
		
		pequenaPizza = new JRadioButton("Pequeno");
		pequenaPizza.setBackground(Color.white);
		
		mediaPizza = new JRadioButton("Medio");
		mediaPizza.setBackground(Color.white);
		
		grandePizza = new JRadioButton("Grande");
		grandePizza.setBackground(Color.white);
		
		comprarButton = new JButton("Comprar");
		comprarButton.setBackground(Color.white);
		comprarButton.setBounds(100, 300, 100, 30);
		
		grupoPizza.add(pequenaPizza);
		grupoPizza.add(mediaPizza);
		grupoPizza.add(grandePizza);
		
		pequenaPizza.setBounds(35, 200, 80, 13);
		mediaPizza.setBounds(120, 200, 80, 13);
		grandePizza.setBounds(200, 200, 80, 13);
		
		
		add(pequenaPizza);
		add(mediaPizza);
		add(grandePizza);
		add(combobox);
		add(comprarButton);
		add(logoImagemLabel);
		
		
		setVisible(false);
	}

	public JRadioButton getPequenaPizza() {
		return pequenaPizza;
	}

	public void setPequenaPizza(JRadioButton pequenaPizza) {
		this.pequenaPizza = pequenaPizza;
	}

	public JRadioButton getMediaPizza() {
		return mediaPizza;
	}

	public void setMediaPizza(JRadioButton mediaPizza) {
		this.mediaPizza = mediaPizza;
	}

	public JRadioButton getGrandePizza() {
		return grandePizza;
	}

	public void setGrandePizza(JRadioButton grandePizza) {
		this.grandePizza = grandePizza;
	}

	public JButton getComprarButton() {
		return comprarButton;
	}

	public void setComprarButton(JButton comprarButton) {
		this.comprarButton = comprarButton;
	}

	public JComboBox getCombobox() {
		return combobox;
	}

	public void setCombobox(JComboBox combobox) {
		this.combobox = combobox;
	}
}
