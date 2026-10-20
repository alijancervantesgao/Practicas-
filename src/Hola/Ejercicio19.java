package Hola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio19 {

	public JFrame frame;
	private JPanel contentPane;
	private JPanel panelTitulo;
	private JPanel panelDatos;
	private JPanel panelEstado;
	private JPanel panelBotonera;
	private JPanel panelVerificacion;

	private JPanel panelEtiqueta1;
	private JPanel panelCuadro1;
	private JPanel panelEtiqueta2;
	private JPanel panelCuadro2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio19 window = new Ejercicio19();
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
	public Ejercicio19() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout());
		frame.setContentPane(contentPane);

		
		panelTitulo =new JPanel();
		panelTitulo.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		panelTitulo.setLayout(new FlowLayout());
		
		JLabel etiqueta1 = new JLabel("Ejercicio de distribucion de paneles y Layout");
		etiqueta1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel etiqueta2 = new JLabel("Por Fulanito Pérez");
		etiqueta2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		panelTitulo.add(etiqueta1);
		panelTitulo.add(etiqueta2);
		contentPane.add(panelTitulo,BorderLayout.NORTH);
		
		panelDatos =new JPanel();
		panelDatos.setLayout(new GridLayout(2,2));
		
		panelEtiqueta1 = new JPanel();
		panelCuadro1 = new JPanel();
		panelEtiqueta2 = new JPanel();
		panelCuadro2 = new JPanel();
		
		 panelEtiqueta1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		 panelDatos.add(panelEtiqueta1);
	     panelCuadro1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	     panelDatos.add(panelCuadro1);
	     panelEtiqueta2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	     panelDatos.add(panelEtiqueta2);
	     panelCuadro2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	     panelDatos.add(panelCuadro2);
	     contentPane.add(panelDatos, BorderLayout.CENTER);
	     
		panelEstado = new JPanel();
		panelEstado.setLayout(null);
		panelEstado.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		JLabel lbl3 = new JLabel("jLabel3");
		lbl3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelEstado.add(lbl3);
        JLabel lbl4 = new JLabel("jLabel4");
        lbl4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelEstado.add(lbl4);
        JLabel lbl5 = new JLabel("jLabel5");
        lbl5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelEstado.add(lbl5);
	     
        contentPane.add(panelEstado, BorderLayout.SOUTH);
		
        panelBotonera = new JPanel();
        panelBotonera.setLayout(null);

        JButton btn1 = new JButton("jButton1");
        JButton btn2 = new JButton("jButton2");
        JButton btn3 = new JButton("jButton3");
        JButton btn4 = new JButton("jButton4");
        
        btn1.setBounds(20, 30, 100, 30);
        btn2.setBounds(20, 90, 100, 30);
        btn3.setBounds(20, 150, 100, 30);
        btn4.setBounds(20, 210, 100, 30);

        panelBotonera.add(btn1);
        panelBotonera.add(btn2);
        panelBotonera.add(btn3);
        panelBotonera.add(btn4);
        contentPane.add(panelBotonera, BorderLayout.WEST);
        
        panelVerificacion = new JPanel();
        panelVerificacion.setLayout(null);

        JCheckBox chk1 = new JCheckBox("jCheckBox1");
        JCheckBox chk2 = new JCheckBox("jCheckBox2");
        JCheckBox chk3 = new JCheckBox("jCheckBox3");
        JCheckBox chk4 = new JCheckBox("jCheckBox4");

        chk1.setBounds(10, 20, 120, 25);
        chk2.setBounds(10, 60, 120, 25);
        chk3.setBounds(10, 100, 120, 25);
        chk4.setBounds(10, 140, 120, 25);

        panelVerificacion.add(chk1);
        panelVerificacion.add(chk2);
        panelVerificacion.add(chk3);
        panelVerificacion.add(chk4);

        contentPane.add(panelVerificacion, BorderLayout.EAST);
        
        panelEstado.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                reubicarEtiquetasEstado();
            }
        });
    }
	private void reubicarEtiquetasEstado() {
        int anchoPanel = panelEstado.getWidth();
        int altoPanel  = panelEstado.getHeight();

        Component[] etiquetas = panelEstado.getComponents();
        int x = anchoPanel - 10;
        for (int i = etiquetas.length - 1; i >= 0; i--) {
            Component c = etiquetas[i];
            int ancho = c.getPreferredSize().width;
            x -= ancho;
            c.setBounds(x, (altoPanel - 25) / 2, ancho, 25);
            x -= 10;
        }
        panelEstado.repaint();
    }

        
	}
