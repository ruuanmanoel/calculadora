package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	private JTextField txtVisor;
	private JButton btnZero;
	private JButton btnUm;
	private JButton btnDois;
	private JButton btnTres;
	private JButton btnQuatro;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnSete;
	private JButton btnOito;
	private JButton btnNove;
	private JButton btnSoma;
	private JButton btnSubtracao;
	private JButton btnDivisao;
	private JButton btnMultiplicacao;
	private JButton btnIgual;
	private JButton btnImpar;
	private JPanel painelCentral;
	private BorderLayout layout;
	
	public Interface() {
		layout = new BorderLayout(2,2);
		this.setLayout(layout);
		this.txtVisor = new JTextField();
		this.txtVisor.setText("0.0");
		this.txtVisor.setFont(new java.awt.Font("Tahoma", 1,24));
		this.txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		this.txtVisor.setEnabled(false);
		this.add(txtVisor, BorderLayout.NORTH);

		//botões
		this.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnZero = new JButton("0");
		this.btnZero.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnUm = new JButton("1");
		this.btnUm.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnDois = new JButton("2");
		this.btnDois.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnTres = new JButton("3");
		this.btnTres.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnQuatro = new JButton("4");
		this.btnQuatro.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnCinco = new JButton("5");
		this.btnSeis = new JButton("6");
		this.btnSete = new JButton("7");
		this.btnOito = new JButton("8");
		this.btnNove = new JButton("9");
		this.btnSoma = new JButton("+");
		this.btnSubtracao = new JButton("-");
		this.btnDivisao = new JButton("/");
		this.btnMultiplicacao = new JButton("*");
		this.btnImpar = new JButton("C");
		this.btnIgual = new JButton("=");
		
		this.btnCinco.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnSeis.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnSete.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnOito.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnNove.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnSoma.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnSubtracao.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnDivisao.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnMultiplicacao.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnImpar.setFont(new java.awt.Font("Tahoma",0,24));
		this.btnIgual.setFont(new java.awt.Font("Tahoma",0,24));
		
		this.painelCentral = new JPanel(new GridLayout(4,4,5,5));
		this.painelCentral.add(btnSete);
		this.painelCentral.add(btnOito);
		this.painelCentral.add(btnNove);
		this.painelCentral.add(btnDivisao);
		
		this.painelCentral.add(btnQuatro);
		this.painelCentral.add(btnCinco);
		this.painelCentral.add(btnSeis);
		this.painelCentral.add(btnMultiplicacao);
		
		this.painelCentral.add(btnUm);
		this.painelCentral.add(btnDois);
		this.painelCentral.add(btnTres);
		this.painelCentral.add(btnSubtracao);

		this.painelCentral.add(btnZero);
		this.painelCentral.add(btnImpar);
		this.painelCentral.add(btnIgual);
		this.painelCentral.add(btnSoma);
		
		this.btnCinco.addActionListener( new java.awt.event.ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("5");
			}
			
		});
		
		
		
		this.add(painelCentral, BorderLayout.CENTER);
		

		
		this.setTitle("Calculadora");
		this.setSize(320,350);
		this.setLocationRelativeTo(null);	
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
