package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDadosPizza;
import model.Pizza;
import view.TelaAtualizarConta;
import view.TelaClienteLogado;
import view.TelaPedirPizza;
import view.TelaSite;

public class ControleTelaClienteLogado implements ActionListener{

	private TelaClienteLogado telaClienteLogado;
	private TelaPedirPizza telaPedirPizza; 
	private TelaSite telaSite;
	private TelaAtualizarConta telaAtualizarConta;
	
	public ControleTelaClienteLogado(TelaClienteLogado telaClienteLogado,TelaPedirPizza telaPedirPizza, TelaSite telaSite, TelaAtualizarConta telaAtualizarConta) {
		this.telaClienteLogado = telaClienteLogado;
		this.telaPedirPizza = telaPedirPizza;
		this.telaAtualizarConta = telaAtualizarConta;
		
		telaClienteLogado.getPedirPizzaButton().addActionListener(this);
		telaClienteLogado.getDeslogarButton().addActionListener(this);
		telaClienteLogado.getHomeButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaClienteLogado.getPedirPizzaButton()) {
			telaClienteLogado.setVisible(false);
			telaPedirPizza.setVisible(true);
			telaPedirPizza.getCombobox().removeAllItems();
//			telaPedirPizza.getBebidaCombobox().removeAllItems();
			
			for (Pizza pizza : BaseDadosPizza.getBasePizza()) {
				telaPedirPizza.getCombobox().addItem(pizza.getSabor());
			}	
//			for (Bebida bebida : BaseDadosBebidas.getBaseBebidas()) {
//				telaPedirPizza.getBebidaCombobox().addItem(bebida.getNome());
//			}
			
			telaPedirPizza.getCombobox().setSelectedItem(null);
			//telaPedirPizza.getBebidaCombobox().setSelectedItem(null);
		}
		
		if (e.getSource() == telaClienteLogado.getDeslogarButton()) {
			telaClienteLogado.setCliente(null);
			telaClienteLogado.setVisible(false);
			telaSite.setVisible(true);
		}
		
		if(e.getSource() == telaClienteLogado.getHomeButton()) {
			telaClienteLogado.setCliente(null);
			telaClienteLogado.setVisible(false);
			telaSite.setVisible(true);
		}
		
		if (e.getSource() == telaClienteLogado.getContaButton()) {
			telaClienteLogado.setVisible(false);
			telaAtualizarConta.setVisible(true);
			telaAtualizarConta.getNomefiled().setText(telaClienteLogado.getCliente().getNome());
			telaAtualizarConta.getCidadefield().setText(telaClienteLogado.getCliente().getCidade());
			telaAtualizarConta.getRuafield().setText(telaClienteLogado.getCliente().getRua());
			telaAtualizarConta.getCepfield().setText(telaClienteLogado.getCliente().getCep());
		}
	}
}
