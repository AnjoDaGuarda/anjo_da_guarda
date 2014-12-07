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
//		JPanel panelEmail = new JPanel();
//		panelEmail.setBounds(0, 0, 800, 578);
//		frame.getContentPane().add(panelEmail);
//		panelEmail.setLayout(null);
//		panelEmail.setVisible(false);
//		
//		JLabel lblConfiguraesEmail = new JLabel("CONFIGURAÇÕES EMAIL");
//		lblConfiguraesEmail.setFont(new Font("Lucida Grande", Font.BOLD, 18));
//		lblConfiguraesEmail.setBounds(270, 18, 217, 51);
//		panelEmail.add(lblConfiguraesEmail);
//		
//		JLabel listaEmails = new JLabel("<html>\nEmails para enviar notificações:<br><br>\n\n");
//		for(String celular : TransferenciaSMS.celulares){
//			listaEmails.setText(listaEmails.getText()+celular+"<br>\n");
//		}
//		listaEmails.setVerticalAlignment(SwingConstants.TOP);
//		listaEmails.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
//		listaEmails.setBounds(32, 70, 355, 464);
//		panelEmail.add(listaEmails);
//		
//		novoEmailField = new JTextField();
//		novoEmailField.setBounds(399, 109, 144, 28);
//		panelEmail.add(novoEmailField);
//		novoEmailField.setColumns(10);
//		
//		JLabel lblNovoEmail = new JLabel("Novo email:");
//		lblNovoEmail.setBounds(399, 81, 88, 16);
//		panelEmail.add(lblNovoEmail);
//		
//		JButton btnAdicionarEmail = new JButton("Adicionar");
//		btnAdicionarEmail.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				TransferenciaEmail.emails.add(novoEmailField.getText());
//				listaEmails.setText(listaEmails.getText()+novoEmailField.getText()+"<br>\n");
//				novoEmailField.setText("");
//			}
//		});
//		btnAdicionarEmail.setBounds(555, 110, 117, 29);
//		panelEmail.add(btnAdicionarEmail);
//		
//		JButton btnRemoverEmail = new JButton("Remover todos");
//		btnRemoverEmail.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				TransferenciaEmail.emails = new ArrayList<String>();
//				listaEmails.setText("<html>\nEmails para enviar notificações:<br><br>\n\n");
//			}
//		});
//		btnRemoverEmail.setBounds(555, 151, 144, 29);
//		panelEmail.add(btnRemoverEmail);
//		
//		JButton btnVoltarEmail = new JButton("Voltar");
//		btnVoltarEmail.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				panelEmail.setVisible(false);
//				panelPrincipal.setVisible(true);
//			}
//		});
//		btnVoltarEmail.setBounds(19, 532, 117, 29);
//		panelEmail.add(btnVoltarEmail);
//	}
//}
