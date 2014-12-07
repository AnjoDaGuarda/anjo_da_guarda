package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import metodo_de_envio.Metodo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class teste {

	private JFrame frame;
	private JTextField sensorA0;
	private JTextField comodoA0;
	private JTextField sensorA1;
	private JTextField comodoA1;
	private JTextField sensorA2;
	private JTextField comodoA2;
	private JTextField sensorA3;
	private JTextField comodoA3;
	private JTextField sensorA4;
	private JTextField comodoA4;
	private JTextField sensorA5;
	private JTextField comodoA5;
	private JTextField sensor2;
	private JTextField comodo2;
	private JTextField sensor3;
	private JTextField comodo3;
	private JTextField sensor4;
	private JTextField comodo4;
	private JTextField sensor5;
	private JTextField comodo5;
	private JTextField sensor6;
	private JTextField comodo6;
	private JTextField sensor7;
	private JTextField comodo7;
	private JTextField sensor8;
	private JTextField comodo8;
	private JTextField sensor9;
	private JTextField comodo9;
	private JTextField sensor10;
	private JTextField comodo10;
	private JTextField sensor11;
	private JTextField comodo11;
	private JTextField sensor12;
	private JTextField comodo12;
	private JTextField sensor13;
	private JTextField comodo13;
	private JButton salvarSensores;
	private JButton cancelarSensores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste window = new teste();
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
	public teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelSensor = new JPanel();
		panelSensor.setLayout(null);
		panelSensor.setBounds(0, 0, 800, 578);
		frame.getContentPane().add(panelSensor);
		
		JLabel lblMapeamentoDosSensores = new JLabel("MAPEAMENTO DOS SENSORES");
		lblMapeamentoDosSensores.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblMapeamentoDosSensores.setBounds(282, 0, 248, 42);
		panelSensor.add(lblMapeamentoDosSensores);
		
		JLabel lblPortas = new JLabel("Portas");
		lblPortas.setBounds(128, 43, 61, 16);
		panelSensor.add(lblPortas);
		
		JLabel lblSensor = new JLabel("Sensor");
		lblSensor.setBounds(293, 43, 61, 16);
		panelSensor.add(lblSensor);
		
		JLabel lblCmodo = new JLabel("Cômodo");
		lblCmodo.setBounds(546, 43, 61, 16);
		panelSensor.add(lblCmodo);
		
		sensorA0 = new JTextField();
		sensorA0.setBounds(275, 69, 134, 28);
		panelSensor.add(sensorA0);
		sensorA0.setColumns(10);
		
		comodoA0 = new JTextField();
		comodoA0.setBounds(496, 69, 134, 28);
		panelSensor.add(comodoA0);
		comodoA0.setColumns(10);
		
		JLabel lblA_0 = new JLabel("A0");
		lblA_0.setBounds(128, 75, 61, 16);
		panelSensor.add(lblA_0);
		
		sensorA1 = new JTextField();
		sensorA1.setColumns(10);
		sensorA1.setBounds(275, 92, 134, 28);
		panelSensor.add(sensorA1);
		
		comodoA1 = new JTextField();
		comodoA1.setColumns(10);
		comodoA1.setBounds(496, 92, 134, 28);
		panelSensor.add(comodoA1);
		
		JLabel lblA_1 = new JLabel("A1");
		lblA_1.setBounds(128, 98, 61, 16);
		panelSensor.add(lblA_1);
		
		sensorA2 = new JTextField();
		sensorA2.setColumns(10);
		sensorA2.setBounds(275, 116, 134, 28);
		panelSensor.add(sensorA2);
		
		comodoA2 = new JTextField();
		comodoA2.setColumns(10);
		comodoA2.setBounds(496, 116, 134, 28);
		panelSensor.add(comodoA2);
		
		JLabel lblA_2 = new JLabel("A2");
		lblA_2.setBounds(128, 122, 61, 16);
		panelSensor.add(lblA_2);
		
		sensorA3 = new JTextField();
		sensorA3.setColumns(10);
		sensorA3.setBounds(275, 139, 134, 28);
		panelSensor.add(sensorA3);
		
		comodoA3 = new JTextField();
		comodoA3.setColumns(10);
		comodoA3.setBounds(496, 139, 134, 28);
		panelSensor.add(comodoA3);
		
		JLabel lblA_3 = new JLabel("A3");
		lblA_3.setBounds(128, 145, 61, 16);
		panelSensor.add(lblA_3);
		
		sensorA4 = new JTextField();
		sensorA4.setColumns(10);
		sensorA4.setBounds(275, 162, 134, 28);
		panelSensor.add(sensorA4);
		
		comodoA4 = new JTextField();
		comodoA4.setColumns(10);
		comodoA4.setBounds(496, 162, 134, 28);
		panelSensor.add(comodoA4);
		
		JLabel lblA_4 = new JLabel("A4");
		lblA_4.setBounds(128, 168, 61, 16);
		panelSensor.add(lblA_4);
		
		sensorA5 = new JTextField();
		sensorA5.setColumns(10);
		sensorA5.setBounds(275, 185, 134, 28);
		panelSensor.add(sensorA5);
		
		comodoA5 = new JTextField();
		comodoA5.setColumns(10);
		comodoA5.setBounds(496, 185, 134, 28);
		panelSensor.add(comodoA5);
		
		JLabel lblA_5 = new JLabel("A5");
		lblA_5.setBounds(128, 191, 61, 16);
		panelSensor.add(lblA_5);
		
		sensor2 = new JTextField();
		sensor2.setColumns(10);
		sensor2.setBounds(275, 209, 134, 28);
		panelSensor.add(sensor2);
		
		comodo2 = new JTextField();
		comodo2.setColumns(10);
		comodo2.setBounds(496, 209, 134, 28);
		panelSensor.add(comodo2);
		
		JLabel label_2 = new JLabel("2");
		label_2.setBounds(128, 215, 61, 16);
		panelSensor.add(label_2);
		
		sensor3 = new JTextField();
		sensor3.setColumns(10);
		sensor3.setBounds(275, 232, 134, 28);
		panelSensor.add(sensor3);
		
		comodo3 = new JTextField();
		comodo3.setColumns(10);
		comodo3.setBounds(496, 232, 134, 28);
		panelSensor.add(comodo3);
		
		JLabel label_3 = new JLabel("3");
		label_3.setBounds(128, 238, 61, 16);
		panelSensor.add(label_3);
		
		sensor4 = new JTextField();
		sensor4.setColumns(10);
		sensor4.setBounds(275, 258, 134, 28);
		panelSensor.add(sensor4);
		
		comodo4 = new JTextField();
		comodo4.setColumns(10);
		comodo4.setBounds(496, 258, 134, 28);
		panelSensor.add(comodo4);
		
		JLabel label_4 = new JLabel("4");
		label_4.setBounds(128, 264, 61, 16);
		panelSensor.add(label_4);
		
		sensor5 = new JTextField();
		sensor5.setColumns(10);
		sensor5.setBounds(275, 281, 134, 28);
		panelSensor.add(sensor5);
		
		comodo5 = new JTextField();
		comodo5.setColumns(10);
		comodo5.setBounds(496, 281, 134, 28);
		panelSensor.add(comodo5);
		
		JLabel label_5 = new JLabel("5");
		label_5.setBounds(128, 287, 61, 16);
		panelSensor.add(label_5);
		
		sensor6 = new JTextField();
		sensor6.setColumns(10);
		sensor6.setBounds(275, 305, 134, 28);
		panelSensor.add(sensor6);
		
		comodo6 = new JTextField();
		comodo6.setColumns(10);
		comodo6.setBounds(496, 305, 134, 28);
		panelSensor.add(comodo6);
		
		JLabel label_6 = new JLabel("6");
		label_6.setBounds(128, 311, 61, 16);
		panelSensor.add(label_6);
		
		sensor7 = new JTextField();
		sensor7.setColumns(10);
		sensor7.setBounds(275, 328, 134, 28);
		panelSensor.add(sensor7);
		
		comodo7 = new JTextField();
		comodo7.setColumns(10);
		comodo7.setBounds(496, 328, 134, 28);
		panelSensor.add(comodo7);
		
		JLabel label_17 = new JLabel("7");
		label_17.setBounds(128, 334, 61, 16);
		panelSensor.add(label_17);
		
		sensor8 = new JTextField();
		sensor8.setColumns(10);
		sensor8.setBounds(275, 355, 134, 28);
		panelSensor.add(sensor8);
		
		comodo8 = new JTextField();
		comodo8.setColumns(10);
		comodo8.setBounds(496, 355, 134, 28);
		panelSensor.add(comodo8);
		
		JLabel label_8 = new JLabel("8");
		label_8.setBounds(128, 361, 61, 16);
		panelSensor.add(label_8);
		
		sensor9 = new JTextField();
		sensor9.setColumns(10);
		sensor9.setBounds(275, 378, 134, 28);
		panelSensor.add(sensor9);
		
		comodo9 = new JTextField();
		comodo9.setColumns(10);
		comodo9.setBounds(496, 378, 134, 28);
		panelSensor.add(comodo9);
		
		JLabel label_9 = new JLabel("9");
		label_9.setBounds(128, 384, 61, 16);
		panelSensor.add(label_9);
		
		sensor10 = new JTextField();
		sensor10.setColumns(10);
		sensor10.setBounds(275, 402, 134, 28);
		panelSensor.add(sensor10);
		
		comodo10 = new JTextField();
		comodo10.setColumns(10);
		comodo10.setBounds(496, 402, 134, 28);
		panelSensor.add(comodo10);
		
		JLabel label_10 = new JLabel("10");
		label_10.setBounds(128, 408, 61, 16);
		panelSensor.add(label_10);
		
		sensor11 = new JTextField();
		sensor11.setColumns(10);
		sensor11.setBounds(275, 425, 134, 28);
		panelSensor.add(sensor11);
		
		comodo11 = new JTextField();
		comodo11.setColumns(10);
		comodo11.setBounds(496, 425, 134, 28);
		panelSensor.add(comodo11);
		
		JLabel label_11 = new JLabel("11");
		label_11.setBounds(128, 431, 61, 16);
		panelSensor.add(label_11);
		
		sensor12 = new JTextField();
		sensor12.setColumns(10);
		sensor12.setBounds(275, 451, 134, 28);
		panelSensor.add(sensor12);
		
		comodo12 = new JTextField();
		comodo12.setColumns(10);
		comodo12.setBounds(496, 451, 134, 28);
		panelSensor.add(comodo12);
		
		JLabel label_12 = new JLabel("12");
		label_12.setBounds(128, 457, 61, 16);
		panelSensor.add(label_12);
		
		sensor13 = new JTextField();
		sensor13.setColumns(10);
		sensor13.setBounds(275, 474, 134, 28);
		panelSensor.add(sensor13);
		
		comodo13 = new JTextField();
		comodo13.setColumns(10);
		comodo13.setBounds(496, 474, 134, 28);
		panelSensor.add(comodo13);
		
		JLabel label_13 = new JLabel("13");
		label_13.setBounds(128, 480, 61, 16);
		panelSensor.add(label_13);
		
		salvarSensores = new JButton("Salvar");
		salvarSensores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String porta = "";
				String sensorComodo = "";
				Map<String,String> mapView = new HashMap<String,String>();
				if(sensorA0!=null){
					porta = "A0";
					sensorComodo = sensorA0+" - "+comodoA0;
					mapView.put(porta, sensorComodo);
				}
				if(sensorA1!=null){
					porta = "A1";
					sensorComodo = sensorA1+" - "+comodoA1;
					mapView.put(porta, sensorComodo);
				}
				if(sensorA2!=null){
					porta = "A2";
					sensorComodo = sensorA2+" - "+comodoA2;
					mapView.put(porta, sensorComodo);
				}
				if(sensorA3!=null){
					porta = "A3";
					sensorComodo = sensorA3+" - "+comodoA3;
					mapView.put(porta, sensorComodo);
				}
				if(sensorA4!=null){
					porta = "A4";
					sensorComodo = sensorA4+" - "+comodoA4;
					mapView.put(porta, sensorComodo);
				}
				if(sensorA0!=null){
					porta = "A5";
					sensorComodo = sensorA5+" - "+comodoA5;
					mapView.put(porta, sensorComodo);
				}
				if(sensor2!=null){
					porta = "2";
					sensorComodo = sensor2+" - "+comodo2;
					mapView.put(porta, sensorComodo);
				}
				if(sensor3!=null){
					porta = "3";
					sensorComodo = sensor3+" - "+comodo3;
					mapView.put(porta, sensorComodo);
				}
				if(sensor4!=null){
					porta = "4";
					sensorComodo = sensor4+" - "+comodo4;
					mapView.put(porta, sensorComodo);
				}
				if(sensor5!=null){
					porta = "5";
					sensorComodo = sensor5+" - "+comodo5;
					mapView.put(porta, sensorComodo);
				}
				if(sensor6!=null){
					porta = "6";
					sensorComodo = sensor6+" - "+comodo6;
					mapView.put(porta, sensorComodo);
				}
				if(sensor7!=null){
					porta = "7";
					sensorComodo = sensor7+" - "+comodo7;
					mapView.put(porta, sensorComodo);
				}
				if(sensor8!=null){
					porta = "8";
					sensorComodo = sensor8+" - "+comodo8;
					mapView.put(porta, sensorComodo);
				}
				if(sensor9!=null){
					porta = "9";
					sensorComodo = sensor9+" - "+comodo9;
					mapView.put(porta, sensorComodo);
				}
				if(sensor10!=null){
					porta = "10";
					sensorComodo = sensor10+" - "+comodo10;
					mapView.put(porta, sensorComodo);
				}
				if(sensor11!=null){
					porta = "11";
					sensorComodo = sensor11+" - "+comodo11;
					mapView.put(porta, sensorComodo);
				}
				if(sensor12!=null){
					porta = "12";
					sensorComodo = sensor12+" - "+comodo12;
					mapView.put(porta, sensorComodo);
				}
				if(sensor13!=null){
					porta = "13";
					sensorComodo = sensor13+" - "+comodo13;
					mapView.put(porta, sensorComodo);
				}
				
				Metodo.mapCausaConsequencia = mapView;
				//panelSensor.setVisible(false);
				//panelPrincipal.setVisible(true);
			}
		});
		salvarSensores.setBounds(658, 523, 117, 29);
		panelSensor.add(salvarSensores);
		
		cancelarSensores = new JButton("Cancelar");
		cancelarSensores.setBounds(18, 523, 117, 29);
		panelSensor.add(cancelarSensores);
	}
}
