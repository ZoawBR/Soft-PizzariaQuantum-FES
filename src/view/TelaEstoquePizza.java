package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaEstoquePizza extends JFrame {
	
	private JTable jTable;
	private JScrollPane jScrollPane;
	
	private JLabel mensagemLabel;
	private JLabel icone1Label;
	private JLabel icone2Label;
	
	public TelaEstoquePizza() {
		super("Estoque");
		setBounds(100, 100, 456, 423);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jScrollPane = new JScrollPane();
		jScrollPane.setBounds(10, 86, 410, 299);
		add(jScrollPane);
		
		jTable = new JTable();
		jTable.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"Sabor", "Código", "Preço"
				}
				
		));
		jScrollPane.setViewportView(jTable);
		
		mensagemLabel = new JLabel("Estoque de Pizzas");
		mensagemLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mensagemLabel.setBounds(136, 28, 178, 25);
		add(mensagemLabel);
		
		icone1Label = new JLabel();
		icone1Label.setIcon(new ImageIcon(TelaEstoquePizza.class.getResource("/imagem/iconeEstoque1.png")));
		icone1Label.setBounds(34, 11, 64, 53);
		add(icone1Label);
		
		icone2Label = new JLabel();
		icone2Label.setIcon(new ImageIcon(TelaEstoquePizza.class.getResource("/imagem/iconeEstoque2.png")));
		icone2Label.setBounds(336, 11, 72, 64);
		add(icone2Label);
		
		setVisible(false);
	}

	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}

	public JTable getjTable() {
		return jTable;
	}
	
}
