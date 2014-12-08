//package main;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//
//import java.awt.Font;
//
//import javax.swing.JTextField;
//import javax.swing.JButton;
//
//import metodo_de_envio.Metodo;
//import metodo_de_envio.TransferenciaEmail;
//import metodo_de_envio.TransferenciaSMS;
//
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import javax.swing.JTextPane;
//import java.awt.TextArea;
//import javax.swing.JTextArea;
//
//public class teste {
//
//	private JFrame frame;
//	private JTextField novoEmailField;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					teste window = new teste();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public teste() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setResizable(false);
//		frame.setBounds(100, 100, 800, 600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JPanel panelConsole = new JPanel();
//		panelConsole.setBounds(0, 0, 800, 578);
//		frame.getContentPane().add(panelConsole);
//		panelConsole.setLayout(null);
//		
//		JLabel lblAnjoDaGuarda = new JLabel("ANJO DA GUARDA");
//		lblAnjoDaGuarda.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
//		lblAnjoDaGuarda.setBounds(333, 16, 146, 36);
//		panelConsole.add(lblAnjoDaGuarda);
//		
//		JTextArea textArea = new JTextArea();
//		textArea.setRows(50);
//		textArea.setBounds(729, 85, -660, 454);
//		panelConsole.add(textArea);
//		
//		
//	}
//}
