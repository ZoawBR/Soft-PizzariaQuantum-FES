package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadastrarCliente;

public class ControllerTelaCadastrarCliente implements ActionListener {
	
	private TelaCadastrarCliente telaCadastrarCliente;
	
	public ControllerTelaCadastrarCliente(TelaCadastrarCliente telaCadastrarCliente) {
		this.telaCadastrarCliente = telaCadastrarCliente;
		
		control();
	}

	public void control() {
		
		telaCadastrarCliente.getDadosPessoaisRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaCadastrarCliente.getDadosPessoaisRadioButton().isSelected()) {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(true);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(false);
				}
				else {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(false);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(true);
				}
			}
		});
		
		telaCadastrarCliente.getDadosLocalRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaCadastrarCliente.getDadosLocalRadioButton().isSelected()) {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(false);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(true);
				}
				else {
					telaCadastrarCliente.getDadosPesssoaisPanel().setVisible(true);
					telaCadastrarCliente.getDadosLocalPanel().setVisible(false);
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
}
