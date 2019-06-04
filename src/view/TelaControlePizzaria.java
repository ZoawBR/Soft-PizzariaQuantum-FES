package view;

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
		imagemControleSoftwareLabel.setBounds(35, 11, 109, 102);
		add(imagemControleSoftwareLabel);
		
		estoqueButton = new JButton("Estoque");
		estoqueButton.setBounds(25, 134, 138, 23);
		add(estoqueButton);
		
		cadastroPizzaButton = new JButton("Cadastrar Pizza");
		cadastroPizzaButton.setBounds(25, 168, 138, 23);
		add(cadastroPizzaButton);
		
		pedidosButton = new JButton("Pedidos");
		pedidosButton.setBounds(25, 202, 138, 23);
		add(pedidosButton);
		
		sairButton = new JButton("Sair");
		sairButton.setBounds(25, 236, 138, 23);
		add(sairButton);
		
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
