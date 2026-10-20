package Hola;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio17 {

	public JFrame frame;
	private JMenu menuCalcular;
	private JMenuItem menuSumar;
	private JMenuItem menuRestar;
	private JMenuItem menuBorrar;
	private JLabel lblnumero1;
	private JLabel lblNmero2;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JLabel etiResultados;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio17 window = new Ejercicio17();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
	public Ejercicio17() {
		initialize();
	}
	
	

	void Sumar() {
		String cad1, cad2;
		int a, b, r;

		cad1 = txtNumero1.getText();
		cad2 = txtNumero2.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		r = a + b;
		etiResultados.setText(""+r);

	}
	
	void Restar() {
		String cad1, cad2;
		int a, b, r;

		cad1 = txtNumero1.getText();
		cad2 = txtNumero2.getText();
		a = Integer.parseInt(cad1);
		b = Integer.parseInt(cad2);
		r = a - b;
		etiResultados.setText(""+r);

	}
	void Borrar() {
		txtNumero1.setText("");
		txtNumero2.setText("");

	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblnumero1 = new JLabel("Número 1:");
		lblnumero1.setBounds(10, 28, 143, 22);
		frame.getContentPane().add(lblnumero1);

		lblNmero2 = new JLabel("Número 2:");
		lblNmero2.setBounds(10, 60, 143, 22);
		frame.getContentPane().add(lblNmero2);

		txtNumero1 = new JTextField();
		txtNumero1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtNumero1.setText("0");
		txtNumero1.setBounds(163, 30, 96, 18);
		frame.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);

		txtNumero2 = new JTextField();
		txtNumero2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtNumero2.setText("0");
		txtNumero2.setBounds(163, 62, 96, 18);
		frame.getContentPane().add(txtNumero2);
		txtNumero2.setColumns(10);

		etiResultados = new JLabel("");
		etiResultados.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultados.setBounds(69, 92, 160, 33);
		etiResultados.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		frame.getContentPane().add(etiResultados);

		btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		btnSumar.setBounds(69, 135, 160, 22);
		frame.getContentPane().add(btnSumar);

		btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		btnRestar.setBounds(69, 167, 160, 22);
		frame.getContentPane().add(btnRestar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		btnBorrar.setBounds(69, 199, 160, 22);
		frame.getContentPane().add(btnBorrar);

		JMenuBar menuBarra = new JMenuBar();
		frame.setJMenuBar(menuBarra);

		menuCalcular = new JMenu("Calcular");
		menuBarra.add(menuCalcular);

		menuSumar = new JMenuItem("Sumar");
		menuSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumar();
			}
		});
		menuCalcular.add(menuSumar);

		menuRestar = new JMenuItem("Restar");
		menuRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restar();
			}
		});
		menuCalcular.add(menuRestar);

		menuBorrar = new JMenuItem("Borrar");
		menuBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Borrar();
			}
		});
		menuCalcular.add(menuBorrar);
	}
}
