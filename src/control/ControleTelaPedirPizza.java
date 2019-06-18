package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.BaseDadosPizza;
import model.Pizza;
import view.TelaClienteLogado;
import view.TelaHistoricoPedidos;
import view.TelaPedirPizza;
import view.TelaRelatorioDia;

public class ControleTelaPedirPizza implements ActionListener{
	
	private TelaPedirPizza telaPedirPizza;
	private TelaRelatorioDia telaRelatorioDia;
	private TelaClienteLogado telaClienteLogado;
	private TelaHistoricoPedidos telaHistoricoPedidos;
	
	public ControleTelaPedirPizza(TelaPedirPizza telaPedirPizza, TelaRelatorioDia telaRelatorioDia, TelaClienteLogado telaClienteLogado, TelaHistoricoPedidos telaHistoricoPedidos) {
		this.telaPedirPizza = telaPedirPizza;
		this.telaRelatorioDia = telaRelatorioDia;
		this.telaClienteLogado = telaClienteLogado;
		this.telaHistoricoPedidos = telaHistoricoPedidos;
		
		telaPedirPizza.getComprarButton().addActionListener(this);
		telaPedirPizza.getHomeButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaPedirPizza.getComprarButton()) {
			int mult = 1;
			int qntPizzas = 0; int qntBebidas; int precoTotal = 0;

			if (telaPedirPizza.getPequenaPizza().isSelected()) {
				mult = 1;
			}
			else if (telaPedirPizza.getMediaPizza().isSelected()) {
				mult = 2;
			}
			else if (telaPedirPizza.getGrandePizza().isSelected()) {
				mult = 3;
			}
			
			String tamanho;
			if (mult == 1) {
				tamanho = "Pequena";
			}
			else if (mult == 2) {
				tamanho = "Média";
			}
			else {
				tamanho = "Grande";
			}
			
			
			Pizza pizza = BaseDadosPizza.searchPizza((String) telaPedirPizza.getCombobox().getSelectedItem());
			int preco = pizza.getPreco() * mult;
			
			//Bebida bebida = BaseDadosBebidas.searchBebida((String) telaPedirPizza.getBebidaCombobox().getSelectedItem());
			
			qntPizzas++;
			//qntBebidas++;
			precoTotal += preco;
			//precoTotal += bebida.getPreco();
			
			telaRelatorioDia.getPizzasVendidasLabel().setText("Pizzas Vendidas: " + qntPizzas);
			telaRelatorioDia.getPrecoTotalVendasLabel().setText("Lucro Dia: " + precoTotal + " $");
			DefaultTableModel model = ((DefaultTableModel) telaHistoricoPedidos.getjTable().getModel());
			
			Object [] fila = new Object[5];
			fila[0] = telaClienteLogado.getCliente().getNome();
			fila[1] = telaClienteLogado.getCliente().getCpf();
			fila[2] = pizza.getSabor();
			fila[3] = tamanho;
			fila[4] = preco;
			
			model.addRow(fila);
			
			JOptionPane.showMessageDialog(null, "Valor a ser pago: " + preco);
			telaPedirPizza.setVisible(false);
			telaClienteLogado.setVisible(true);
		}
		
		if (e.getSource() == telaPedirPizza.getHomeButton()) {
			telaPedirPizza.setVisible(false);
			telaClienteLogado.setVisible(true);
		}
	}
}
