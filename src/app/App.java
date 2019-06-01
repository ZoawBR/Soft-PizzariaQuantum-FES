package app;

import control.ControllerTelaCadastrarCliente;
import view.TelaCadastrarCliente;
import view.TelaCliente;
import view.TelaSite;

public class App {
	
	public static void main(String[] args) {
		
		TelaCadastrarCliente telaCadastrarCliente = new TelaCadastrarCliente();
		ControllerTelaCadastrarCliente controllerTelaCadastrarCliente = new ControllerTelaCadastrarCliente(telaCadastrarCliente);
		
	}
	
}
