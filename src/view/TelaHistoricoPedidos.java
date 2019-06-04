package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaHistoricoPedidos extends JFrame {
	
	private JScrollPane jScrollPane;
	private JTable jTable;
	
	private JLabel mensagemLabel;
	private JLabel icone1Label;
	private JLabel icone2Label;
	
	public TelaHistoricoPedidos() {
		super("Histórico");
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 420);
		
		jScrollPane = new JScrollPane();
		jScrollPane.setBounds(10, 86, 410, 299);
		add(jScrollPane);
		
		jTable = new JTable();
		jTable.setModel(new DefaultTableModel(
		
				new Object[][] {
				},
				new String[] {
						"Nome", "CPF", "Sabor", "Tamanho", "Preço"
				}
		));
		jScrollPane.setViewportView(jTable);
		
		mensagemLabel = new JLabel("Histórico de Pedidos");
		mensagemLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mensagemLabel.setBounds(120, 27, 206, 25);
		add(mensagemLabel);
		
		icone1Label = new JLabel();
		icone1Label.setIcon(new ImageIcon(TelaHistoricoPedidos.class.getResource("/imagem/historico.png")));
		icone1Label.setBounds(0, 0, 440, 420);
		add(icone1Label);
	
		
		setVisible(false);
	}

	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}

	public JTable getjTable() {
		return jTable;
	}
	
}
