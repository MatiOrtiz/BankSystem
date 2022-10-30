package Programa;
import java.awt.EventQueue;
import Exceptions.*;
import Programa.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyVetoException;

import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JInternalFrame;

public class BankSystemGUI {

	private JFrame frmCuentaBancaria;
	private JTextField apellido;
	private JTextField nombre;
	private JTextField dni;
	private JPasswordField clave;
	private JTextField monto;
	private JTextField tFdNombreBenef;
	private JTextField tFApellidoBenef;
	private JTextField tFDNIBenef;
	private JTextField tFMontoBenef;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankSystemGUI window = new BankSystemGUI();
					window.frmCuentaBancaria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BankSystemGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCuentaBancaria = new JFrame();
		frmCuentaBancaria.setTitle("Cuenta Bancaria");
		frmCuentaBancaria.setBounds(100, 100, 595, 356);
		frmCuentaBancaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCuentaBancaria.getContentPane().setLayout(null);
		
		JPanel panelHome = new JPanel();
		panelHome.setBounds(0, 0, 579, 317);
		frmCuentaBancaria.getContentPane().add(panelHome);
		panelHome.setLayout(null);
		
		JPanel panelTransferencia = new JPanel();
		panelTransferencia.setBounds(0, 0, 579, 317);
		panelHome.add(panelTransferencia);
		panelTransferencia.setLayout(null);
		
		JLabel lblNombreBenef = new JLabel("Nombre:");
		lblNombreBenef.setBounds(127, 84, 64, 14);
		panelTransferencia.add(lblNombreBenef);
		
		JLabel lblApellidoBenef = new JLabel("Apellido:");
		lblApellidoBenef.setBounds(127, 115, 64, 14);
		panelTransferencia.add(lblApellidoBenef);
		
		JLabel lblDNIBenef = new JLabel("DNI:");
		lblDNIBenef.setBounds(291, 84, 46, 14);
		panelTransferencia.add(lblDNIBenef);
		
		tFdNombreBenef = new JTextField();
		tFdNombreBenef.setBounds(180, 80, 86, 20);
		panelTransferencia.add(tFdNombreBenef);
		tFdNombreBenef.setColumns(10);
		
		tFApellidoBenef = new JTextField();
		tFApellidoBenef.setBounds(180, 112, 86, 20);
		panelTransferencia.add(tFApellidoBenef);
		tFApellidoBenef.setColumns(10);
		
		tFDNIBenef = new JTextField();
		tFDNIBenef.setBounds(322, 81, 86, 20);
		panelTransferencia.add(tFDNIBenef);
		tFDNIBenef.setColumns(10);
		
		tFMontoBenef = new JTextField();
		tFMontoBenef.setBounds(322, 112, 86, 20);
		panelTransferencia.add(tFMontoBenef);
		tFMontoBenef.setColumns(10);
		
		JLabel lblMontoTrans = new JLabel("Monto:");
		lblMontoTrans.setBounds(279, 115, 46, 14);
		panelTransferencia.add(lblMontoTrans);
		
		JButton btnOkTrans = new JButton("OK");
		btnOkTrans.setBounds(151, 175, 89, 23);
		panelTransferencia.add(btnOkTrans);
		
		JButton btnCancel = new JButton("CANCELAR");
		btnCancel.setBounds(306, 175, 89, 23);
		panelTransferencia.add(btnCancel);
		panelTransferencia.setVisible(false);
		
		JPanel panelOptions = new JPanel();
		panelOptions.setBounds(75, 102, 412, 154);
		panelHome.add(panelOptions);
		panelOptions.setLayout(null);
		
		JButton transferirBtn = new JButton("Transferir");
		transferirBtn.setBounds(10, 39, 86, 23);
		panelOptions.add(transferirBtn);
		
		JButton btnNewButton_1 = new JButton("Depositar");
		btnNewButton_1.setBounds(106, 39, 89, 23);
		panelOptions.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ultimas n trans.");
		btnNewButton_2.setBounds(213, 39, 89, 23);
		panelOptions.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(312, 39, 89, 23);
		panelOptions.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(10, 92, 89, 23);
		panelOptions.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(106, 92, 89, 23);
		panelOptions.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(213, 92, 89, 23);
		panelOptions.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(312, 92, 89, 23);
		panelOptions.add(btnNewButton_7);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNameHome = new JLabel("New label");
		lblNameHome.setBounds(111, 11, 98, 26);
		panelHome.add(lblNameHome);
		
		JLabel lblAmountHome = new JLabel("New label");
		lblAmountHome.setBounds(354, 21, 123, 14);
		panelHome.add(lblAmountHome);
		
		JPanel panel = 	new JPanel();
		panel.setBounds(0, 0, 579, 317);
		frmCuentaBancaria.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("BIENVENIDO");
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		welcomeLabel.setBounds(265, 33, 66, 23);
		panel.add(welcomeLabel);
		
		JLabel firstNameLabel = new JLabel("Nombre");
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		firstNameLabel.setBounds(138, 91, 46, 25);
		panel.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Apellido");
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lastNameLabel.setBounds(138, 125, 46, 23);
		panel.add(lastNameLabel);
		
		JLabel docNumberLabel = new JLabel("DNI");
		docNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		docNumberLabel.setBounds(311, 94, 46, 14);
		panel.add(docNumberLabel);
		
		nombre = new JTextField();
		nombre.setBounds(185, 93, 86, 20);
		panel.add(nombre);
		nombre.setColumns(10);
		
		apellido = new JTextField();
		apellido.setBounds(185, 126, 86, 20);
		panel.add(apellido);
		apellido.setColumns(10);
		
		dni = new JTextField();
		dni.setBounds(358, 91, 86, 20);
		panel.add(dni);
		dni.setColumns(10);
		
		JLabel accessCodeLabel = new JLabel("Clave");
		accessCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		accessCodeLabel.setBounds(311, 128, 46, 14);
		panel.add(accessCodeLabel);
		
		clave = new JPasswordField();
		clave.setBounds(358, 125, 86, 20);
		panel.add(clave);
		clave.setColumns(10);
		
		JButton sigInButton = new JButton("INGRESAR");
		sigInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = nombre.getText();
					String lastName = apellido.getText();
					Integer doc = Integer.parseInt(dni.getText());
					Float amount = Float.parseFloat(monto.getText());
					char[] code = clave.getPassword();
					String accessCode = "";
					for(int i = 0; i < code.length; i++) {
						accessCode = accessCode + code[i];
					}
					CuentaBancaria c = new CuentaBancaria(name, lastName, doc, accessCode, amount);	
					lblNameHome.setText(c.getFirstName()+" "+c.getLastName());
					lblAmountHome.setText("Saldo: $"+c.getAmount());
					
					//Transferir----------------------------------------------------------------------------------------------------
					
					transferirBtn.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
						try {
								if(transferirBtn == e.getSource()) {
									
									transferirBtn.setVisible(false);
									btnNewButton_1.setVisible(false);
									btnNewButton_2.setVisible(false);
									btnNewButton_3.setVisible(false);
									btnNewButton_4.setVisible(false);
									btnNewButton_5.setVisible(false);
									btnNewButton_6.setVisible(false);
									btnNewButton_7.setVisible(false);
									panelTransferencia.setVisible(true);
									panelHome.setEnabled(false);
									
									btnCancel.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											panelTransferencia.setVisible(false);
											transferirBtn.setVisible(true);
											btnNewButton_1.setVisible(true);
											btnNewButton_2.setVisible(true);
											btnNewButton_3.setVisible(true);
											btnNewButton_4.setVisible(true);
											btnNewButton_5.setVisible(true);
											btnNewButton_6.setVisible(true);
											btnNewButton_7.setVisible(true);
										}
									});
									
									btnOkTrans.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											try {
												String name = tFdNombreBenef.getText();
												String lastName = tFApellidoBenef.getText();
												Integer doc = Integer.parseInt(tFDNIBenef.getText());
												Float amount = (Float) Float.parseFloat(tFMontoBenef.getText());
												c.transferences(name, lastName, doc, "Débito", amount);
												JOptionPane.showMessageDialog(panelTransferencia, "Transferencia exitosa");
												tFdNombreBenef.setText("");
												tFApellidoBenef.setText("");
												tFDNIBenef.setText("");
												tFMontoBenef.setText("");
												panelTransferencia.setVisible(false);
												transferirBtn.setVisible(true);
												btnNewButton_1.setVisible(true);
												btnNewButton_2.setVisible(true);
												btnNewButton_3.setVisible(true);
												btnNewButton_4.setVisible(true);
												btnNewButton_5.setVisible(true);
												btnNewButton_6.setVisible(true);
												btnNewButton_7.setVisible(true);
												lblAmountHome.setText("Saldo Actual: $"+c.getAmount());
											}catch(InsuficientAmountException error) {
												JOptionPane.showMessageDialog(panelTransferencia, "No es posible transferir. Saldo insuficiente");
												panelTransferencia.setVisible(false);
												transferirBtn.setVisible(true);
												btnNewButton_1.setVisible(true);
												btnNewButton_2.setVisible(true);
												btnNewButton_3.setVisible(true);
												btnNewButton_4.setVisible(true);
												btnNewButton_5.setVisible(true);
												btnNewButton_6.setVisible(true);
												btnNewButton_7.setVisible(true);
												
												tFdNombreBenef.setText("");
												tFApellidoBenef.setText("");
												tFDNIBenef.setText("");
												tFMontoBenef.setText("");
											}
											catch(NumberFormatException error) {
												JOptionPane.showMessageDialog(panelTransferencia, "Error. Ingrese los datos correctamente");
											}
										}
									});
								}
							}catch(NullPointerException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "Error. Complete los campos");
							}
						}
						
					});
					
					//Depositar------------------------------------------------------------------------------------------------------------
					
					
					panel.setEnabled(false);
					panel.setVisible(false);
					panelHome.setVisible(true);
					panelOptions.setVisible(true);
					
					
				}catch(InvalidAccessCodeException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Clave ingresada incorrecta");
				}
			
				catch(StringIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Complete los campos obligatorios");
				}
				catch(NumberFormatException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Ingrese los datos correctamente");

				}
			}
		});
		sigInButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sigInButton.setBounds(253, 243, 89, 23);
		panel.add(sigInButton);
		
		JLabel lblNewLabel = new JLabel("Monto Inicial");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(211, 173, 66, 14);
		panel.add(lblNewLabel);
		
		monto = new JTextField();
		monto.setBounds(277, 170, 86, 20);
		panel.add(monto);
		monto.setColumns(10);
		panelHome.setVisible(false);
		
		//Constructor
		
	}
}