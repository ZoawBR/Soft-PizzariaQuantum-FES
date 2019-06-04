package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaControlePizzaria extends JFrame {
	
	private JButton estoqueButton;
	private JButton cadastroPizzaButton;
	private JButton pedidosButton;
	private JButton sairButton;
	
	private JLabel imagemControleSoftwareLabel;
	
	public TelaControlePizzaria() {
		super("Controle");
		setLocationRelativeTo(null);
		setBounds(100, 100, 193, 305);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		imagemControleSoftwareLabel = new JLabel();
		imagemControleSoftwareLabel.setIcon(new ImageIcon(TelaControlePizzaria.class.getResource("/imagem/iconeTelaFuncionario.png")));
		imagemControleSoftwareLabel.setBounds(0, 0, 193, 305);
		
		estoqueButton = new JButton("Estoque");
		estoqueButton.setBounds(25, 134, 138, 23);
		estoqueButton.setBackground(Color.white);
		add(estoqueButton);
		
		cadastroPizzaButton = new JButton("Cadastrar Pizza");
		cadastroPizzaButton.setBounds(25, 168, 138, 23);
		cadastroPizzaButton.setBackground(Color.white);
		add(cadastroPizzaButton);
		
		pedidosButton = new JButton("Pedidos");
		pedidosButton.setBounds(25, 202, 138, 23);
		pedidosButton.setBackground(Color.white);
		add(pedidosButton);
		
		sairButton = new JButton("Sair");
		sairButton.setBounds(25, 236, 138, 23);
		sairButton.setBackground(Color.white);
		add(sairButton);
		
		add(imagemControleSoftwareLabel);
		setVisible(false);
		
	}

	public JButton getEstoqueButton() {
		return estoqueButton;
	}

	public JButton getCadastroPizzaButton() {
		return cadastroPizzaButton;
	}

	public JButton getPedidosButton() {
		return pedidosButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
}
