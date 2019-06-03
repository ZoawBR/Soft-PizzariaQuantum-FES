package app;

import control.Controller;
import view.TelaCadastrarCliente;
import view.TelaCliente;
import view.TelaLoginCliente;
import view.TelaPrincipalSoftware;
import view.TelaSite;

public class App {
	
	public static void main(String[] args) {
		TelaCadastrarCliente telaCadastrarCliente = new TelaCadastrarCliente();
		TelaSite telaSite = new TelaSite();
		TelaCliente telaCliente = new TelaCliente();
		TelaLoginCliente telaLoginCliente = new TelaLoginCliente();
		TelaPrincipalSoftware telaPrincipalSoftware = new TelaPrincipalSoftware();
		
		Controller controller = new Controller(telaCadastrarCliente, telaSite, telaCliente, telaLoginCliente,
											   telaPrincipalSoftware);
		
	}	
}
