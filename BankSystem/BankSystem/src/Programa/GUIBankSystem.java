package Programa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class GUIBankSystem {

	private JFrame frmCuentaBancaria;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBankSystem window = new GUIBankSystem();
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
	public GUIBankSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCuentaBancaria = new JFrame();
		frmCuentaBancaria.setTitle("Cuenta Bancaria");
		frmCuentaBancaria.setBounds(100, 100, 450, 320);
		frmCuentaBancaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCuentaBancaria.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 281);
		frmCuentaBancaria.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("BIENVENIDO");
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		welcomeLabel.setBounds(184, 11, 66, 23);
		panel.add(welcomeLabel);
		
		JLabel firstNameLabel = new JLabel("Nombre");
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		firstNameLabel.setBounds(57, 69, 46, 25);
		panel.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Apellido");
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lastNameLabel.setBounds(57, 103, 46, 23);
		panel.add(lastNameLabel);
		
		JLabel docNumberLabel = new JLabel("DNI");
		docNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		docNumberLabel.setBounds(230, 72, 46, 14);
		panel.add(docNumberLabel);
		
		textField = new JTextField();
		textField.setBounds(104, 71, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 104, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 69, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel accessCodeLabel = new JLabel("Clave");
		accessCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		accessCodeLabel.setBounds(230, 106, 46, 14);
		panel.add(accessCodeLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 103, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton sigInButton = new JButton("INGRESAR");
		sigInButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sigInButton.setBounds(172, 221, 89, 23);
		panel.add(sigInButton);
		
		JLabel lblNewLabel = new JLabel("Monto Inicial");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(130, 151, 66, 14);
		panel.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(196, 148, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
	}
}
