package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAtualizarConta extends TelaCliente {

	//String nome, String cpf, String login, String senha, String cidade, String rua, String cep, int numCasa
	
	JLabel nomelabel,cidadelabel, rualabel,ceplabel, numcasalabel;
	JTextField nomefiled , cidadefield, ruafield, cepfield, numcasafield;
	JButton atualizarButton;
	private JLabel logoImagemLabel;
		
	public TelaAtualizarConta() {
		logoImagemLabel = new JLabel();
		logoImagemLabel.setIcon(new ImageIcon(TelaSite.class.getResource("/imagem/atualzar.PNG")));
		logoImagemLabel.setBounds(0, 0, 313, 584);
		
		nomelabel = new JLabel("Nome:");
		nomelabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		nomelabel.setBounds(40, 210, 50, 40);
		add(nomelabel);
		
		nomefiled = new JTextField(10);
		nomefiled.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		nomefiled.setBounds(100, 220, 150, 20);
		add(nomefiled);
		
		cidadelabel = new JLabel("Cidade: ");
		cidadelabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		cidadelabel.setBounds(40, 230, 65, 40);
		add(cidadelabel);

		cidadefield = new JTextField(10);
		cidadefield.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		cidadefield.setBounds(100, 240, 150, 20);
		add(cidadefield);
		
		rualabel = new JLabel("Rua: ");
		rualabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		rualabel.setBounds(40, 250, 45, 40);
		add(rualabel);
		
		ruafield = new JTextField(10);
		ruafield.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		ruafield.setBounds(100, 260, 150, 20);
		add(ruafield);
		
		ceplabel = new JLabel("CEP: ");
		ceplabel.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		ceplabel.setBounds(40, 270, 45, 40);
		add(ceplabel);
		
		cepfield = new JTextField(10);
		cepfield.setFont(new Font("Kristen ITC", Font.PLAIN, 14));
		cepfield.setBounds(100, 280, 150, 20);
		add(cepfield);
	
		
		atualizarButton = new JButton("Atualziar");
		atualizarButton.setFont(new Font("Kristen ITC", Font.PLAIN, 11));
		atualizarButton.setForeground(Color.BLACK);
		atualizarButton.setBackground(Color.white);
		atualizarButton.setBounds(100, 450, 100, 30);
		
		add(atualizarButton);
		add(logoImagemLabel);
		setVisible(false);
	}

	public JTextField getNomefiled() {
		return nomefiled;
	}

	public void setNomefiled(JTextField nomefiled) {
		this.nomefiled = nomefiled;
	}

	public JTextField getCidadefield() {
		return cidadefield;
	}

	public void setCidadefield(JTextField cidadefield) {
		this.cidadefield = cidadefield;
	}

	public JTextField getRuafield() {
		return ruafield;
	}

	public void setRuafield(JTextField ruafield) {
		this.ruafield = ruafield;
	}

	public JTextField getCepfield() {
		return cepfield;
	}

	public void setCepfield(JTextField cepfield) {
		this.cepfield = cepfield;
	}

	public JTextField getNumcasafield() {
		return numcasafield;
	}

	public void setNumcasafield(JTextField numcasafield) {
		this.numcasafield = numcasafield;
	}

	public JButton getAtualizarButton() {
		return atualizarButton;
	}

	public void setAtualizarButton(JButton atualizarButton) {
		this.atualizarButton = atualizarButton;
	}
}
