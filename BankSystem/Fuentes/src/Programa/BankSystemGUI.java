package Programa;
import java.awt.EventQueue;
import Exceptions.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;

public class BankSystemGUI {

	private JFrame frmCuentaBancaria;
	private JTextField tFApellido;
	private JTextField tFNombre;
	private JTextField tFDni;
	private JPasswordField jPFclave;
	private JTextField tFMonto;
	private JTextField tFdNombreBenef;
	private JTextField tFApellidoBenef;
	private JTextField tFDNIBenef;
	private JTextField tFMontoBenef;
	private JTextField tFNombreDep;
	private JTextField tFApellidoDep;
	private JTextField tFDNIDep;
	private JTextField tDMontoDep;
	private JTextField ultTfNtrans;
	private JTextField tFNTransMAyor;
	private JTextField tFTransMismoValor;
	private JTextField tFDiaEnFecha;
	private JTextField tFTransMayorAN;
	private JTextField tFDiaParaSaldo;
	private JTextField tFMesParaSaldo;
	private JTextField tFAnioParaSaldo;
	private JTextField tFMesEnFecha;
	private JTextField tFAnioEnFecha;
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
		frmCuentaBancaria.setResizable(false);
		frmCuentaBancaria.setTitle("Cuenta Bancaria");
		frmCuentaBancaria.setBounds(100, 100, 595, 366);
		frmCuentaBancaria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCuentaBancaria.getContentPane().setLayout(null);
		
		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(0, 0, 579, 317);
		frmCuentaBancaria.getContentPane().add(panelInicio);
		panelInicio.setLayout(null);
						
						//Panel Transacciones en la fecha------------------------------------------------------------------------------------------------------------
						JPanel panelTransEnFecha = new JPanel();
						panelTransEnFecha.setBounds(0, 34, 579, 293);
						panelInicio.add(panelTransEnFecha);
						panelTransEnFecha.setLayout(null);
						
						JButton btnVolverDeTransEnFecha = new JButton("Volver");
						btnVolverDeTransEnFecha.setBounds(10, 249, 89, 23);
						panelTransEnFecha.add(btnVolverDeTransEnFecha);
						
						JTextArea textAreaTransEnFecha = new JTextArea();
						textAreaTransEnFecha.setEditable(false);
						
						JScrollPane panelScrollEnFecha= new JScrollPane(textAreaTransEnFecha,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						panelScrollEnFecha.setBounds(21, 70, 527, 171);
						panelTransEnFecha.add(panelScrollEnFecha);
						
						JLabel lblnTransEnFecha = new JLabel("Dia: ");
						lblnTransEnFecha.setBounds(32, 45, 27, 14);
						panelTransEnFecha.add(lblnTransEnFecha);
						
						tFDiaEnFecha = new JTextField();
						tFDiaEnFecha.setBounds(61, 42, 86, 20);
						panelTransEnFecha.add(tFDiaEnFecha);
						tFDiaEnFecha.setColumns(10);
						
						JButton btnBuscarTransEnFecha = new JButton("Buscar");
						btnBuscarTransEnFecha.setBounds(451, 41, 89, 23);
						panelTransEnFecha.add(btnBuscarTransEnFecha);
						
						JLabel lblTituloTransEnFecha = new JLabel("Transacciones en determinada fecha");
						lblTituloTransEnFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblTituloTransEnFecha.setBounds(140, 11, 286, 23);
						panelTransEnFecha.add(lblTituloTransEnFecha);
						
						JLabel lblmesTransEnFecha = new JLabel("Mes:");
						lblmesTransEnFecha.setBounds(171, 45, 46, 14);
						panelTransEnFecha.add(lblmesTransEnFecha);
						
						tFMesEnFecha = new JTextField();
						tFMesEnFecha.setColumns(10);
						tFMesEnFecha.setBounds(201, 42, 86, 20);
						panelTransEnFecha.add(tFMesEnFecha);
						
						JLabel lblAnioTransEnFecha = new JLabel("Año:");
						lblAnioTransEnFecha.setBounds(310, 45, 46, 14);
						panelTransEnFecha.add(lblAnioTransEnFecha);
						
						tFAnioEnFecha = new JTextField();
						tFAnioEnFecha.setColumns(10);
						tFAnioEnFecha.setBounds(339, 42, 86, 20);
						panelTransEnFecha.add(tFAnioEnFecha);
						
						//Panel de transacciones con valor igual a N------------------------------------------------------------------------------------------------------------
						JPanel panelTransMismoValor = new JPanel();
						panelTransMismoValor.setBounds(0, 34, 579, 293);
						panelInicio.add(panelTransMismoValor);
						panelTransMismoValor.setLayout(null);
						
						JButton btnVolverDeTransMismoValor = new JButton("Volver");
						btnVolverDeTransMismoValor.setBounds(10, 260, 89, 23);
						panelTransMismoValor.add(btnVolverDeTransMismoValor);
						
						JTextArea textAreaTransMismoValor = new JTextArea();
						
						JScrollPane panelScrollMismoValor= new JScrollPane(textAreaTransMismoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						panelScrollMismoValor.setBounds(23, 89, 527, 171);
						panelTransMismoValor.add(panelScrollMismoValor);
						
						JLabel lblnTransMismoValor = new JLabel("Ingrese el valor de las transacciones:");
						lblnTransMismoValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblnTransMismoValor.setBounds(53, 48, 207, 14);
						panelTransMismoValor.add(lblnTransMismoValor);
						
						tFTransMismoValor = new JTextField();
						tFTransMismoValor.setBounds(268, 46, 123, 20);
						panelTransMismoValor.add(tFTransMismoValor);
						tFTransMismoValor.setColumns(10);
						
						JButton btnBuscarTransMismoValor = new JButton("Buscar");
						btnBuscarTransMismoValor.setBounds(412, 45, 89, 23);
						panelTransMismoValor.add(btnBuscarTransMismoValor);
						
						JLabel lblTituloTransMismoValor = new JLabel("Transacciones de valor igual a N");
						lblTituloTransMismoValor.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblTituloTransMismoValor.setBounds(156, 11, 253, 23);
						panelTransMismoValor.add(lblTituloTransMismoValor);
						
						//Panel de N Transacciones de mayor valor------------------------------------------------------------------------------------------------------------
						JPanel panelNTransMayor = new JPanel();
						panelNTransMayor.setBounds(0, 34, 579, 293);
						panelInicio.add(panelNTransMayor);
						panelNTransMayor.setLayout(null);
						
						JButton btnVolverDeNTransMayor = new JButton("Volver");
						btnVolverDeNTransMayor.setBounds(10, 253, 89, 23);
						panelNTransMayor.add(btnVolverDeNTransMayor);
						
						JTextArea textAreaNTransMayor = new JTextArea();
						textAreaNTransMayor.setEditable(false);
						
						JScrollPane panelScrollNMAyor= new JScrollPane(textAreaNTransMayor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						panelScrollNMAyor.setBounds(24, 83, 527, 159);
						panelNTransMayor.add(panelScrollNMAyor);
						
						JLabel lblnTransMayor = new JLabel("Ingrese la cantidad de transferencias: ");
						lblnTransMayor.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblnTransMayor.setBounds(53, 55, 208, 14);
						panelNTransMayor.add(lblnTransMayor);
						
						tFNTransMAyor = new JTextField();
						tFNTransMAyor.setBounds(278, 52, 132, 20);
						panelNTransMayor.add(tFNTransMAyor);
						tFNTransMAyor.setColumns(10);
						
						JButton btnBuscarNtransMayor = new JButton("Buscar");
						btnBuscarNtransMayor.setBounds(428, 52, 90, 20);
						panelNTransMayor.add(btnBuscarNtransMayor);
						
						JLabel lblTituloNTransMayor = new JLabel("N Transacciones de Mayor Valor");
						lblTituloNTransMayor.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblTituloNTransMayor.setBounds(152, 11, 246, 30);
						panelNTransMayor.add(lblTituloNTransMayor);
				
						//Panel de las ultimas N transferencias------------------------------------------------------------------------------------------------------------
						JPanel panelUltNTrans = new JPanel();
						panelUltNTrans.setBounds(0, 34, 579, 293);
						panelInicio.add(panelUltNTrans);
						panelUltNTrans.setLayout(null);
						
						JButton btnVolverDeNTrans = new JButton("Volver");
						btnVolverDeNTrans.setBounds(10, 249, 89, 23);
						panelUltNTrans.add(btnVolverDeNTrans);
						
						JTextArea textAreaUltNTrans = new JTextArea();
						textAreaUltNTrans.setEditable(false);
						
						JScrollPane panelScroll= new JScrollPane(textAreaUltNTrans,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						panelScroll.setBounds(22, 72, 527, 171);
						panelUltNTrans.add(panelScroll);
						
						JLabel lblnTrans = new JLabel("Ingrese la cantidad de transferencias: ");
						lblnTrans.setFont(new Font("Tahoma", Font.PLAIN, 12));
						lblnTrans.setBounds(55, 44, 208, 14);
						panelUltNTrans.add(lblnTrans);
						
						ultTfNtrans = new JTextField();
						ultTfNtrans.setBounds(280, 41, 132, 20);
						panelUltNTrans.add(ultTfNtrans);
						ultTfNtrans.setColumns(10);
						
						JButton btnBuscarNtrans = new JButton("Buscar");
						btnBuscarNtrans.setBounds(430, 41, 90, 20);
						panelUltNTrans.add(btnBuscarNtrans);
						
						JLabel lblTituloNTrans = new JLabel("Ultimas N transacciones");
						lblTituloNTrans.setFont(new Font("Tahoma", Font.BOLD, 15));
						lblTituloNTrans.setBounds(186, 11, 181, 23);
						panelUltNTrans.add(lblTituloNTrans);
				
				//Panel de Transacciones mayores a N------------------------------------------------------------------------------------------------------------
				JPanel panelTransMayorAN = new JPanel();
				panelTransMayorAN.setBounds(0, 34, 579, 293);
				panelInicio.add(panelTransMayorAN);
				panelTransMayorAN.setLayout(null);
				
				JButton btnVolverDeTransMayorAN = new JButton("Volver");
				btnVolverDeTransMayorAN.setBounds(10, 259, 89, 23);
				panelTransMayorAN.add(btnVolverDeTransMayorAN);
				
				JTextArea textAreaTransMayorAN = new JTextArea();
				textAreaTransMayorAN.setEditable(false);
				
				JScrollPane panelScrollMayorAN= new JScrollPane(textAreaTransMayorAN,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				panelScrollMayorAN.setBounds(16, 75, 527, 176);
				panelTransMayorAN.add(panelScrollMayorAN);
				
				JLabel lblnTransMayorAN = new JLabel("Ingrese el valor de las transacciones:");
				lblnTransMayorAN.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lblnTransMayorAN.setBounds(16, 50, 193, 14);
				panelTransMayorAN.add(lblnTransMayorAN);
				
				tFTransMayorAN = new JTextField();
				tFTransMayorAN.setBounds(210, 47, 95, 20);
				panelTransMayorAN.add(tFTransMayorAN);
				tFTransMayorAN.setColumns(10);
				
				JButton btnBuscarTransMayorAN = new JButton("Buscar");
				btnBuscarTransMayorAN.setBounds(454, 46, 89, 23);
				panelTransMayorAN.add(btnBuscarTransMayorAN);
				
				JLabel lblTituloTransMayorAN = new JLabel("Transacciones mayores a N");
				lblTituloTransMayorAN.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblTituloTransMayorAN.setBounds(200, 11, 209, 23);
				panelTransMayorAN.add(lblTituloTransMayorAN);
				
				JMenuBar menuBarTipos = new JMenuBar();
				menuBarTipos.setBounds(315, 47, 85, 22);
				panelTransMayorAN.add(menuBarTipos);
				
				JMenu MenuTipos = new JMenu("Seleccionar...");
				menuBarTipos.add(MenuTipos);
				
				JMenuItem itemTodas = new JMenuItem("Todas");
				
				MenuTipos.add(itemTodas);
				
				JMenuItem itemDebito = new JMenuItem("Débito");
				MenuTipos.add(itemDebito);
				
				JMenuItem itemCredito = new JMenuItem("Crédito");
				MenuTipos.add(itemCredito);
				
				
				//Panel de Saldo en Fecha------------------------------------------------------------------------------------------------------------
				JPanel panelSaldoEnFecha = new JPanel();
				panelSaldoEnFecha.setBounds(0, 34, 579, 293);
				panelInicio.add(panelSaldoEnFecha);
				panelSaldoEnFecha.setLayout(null);
				
				JButton btnVolverDeSaldoEnFecha = new JButton("Volver");
				btnVolverDeSaldoEnFecha.setBounds(168, 251, 89, 23);
				panelSaldoEnFecha.add(btnVolverDeSaldoEnFecha);
				
				JLabel lblSaldoEnFecha = new JLabel("Ingrese la fecha de la que quiere conocer el saldo:");
				lblSaldoEnFecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblSaldoEnFecha.setBounds(46, 86, 284, 23);
				panelSaldoEnFecha.add(lblSaldoEnFecha);
				
				JButton btnBuscarSaldoEnFecha = new JButton("Buscar");
				btnBuscarSaldoEnFecha.setBounds(305, 251, 89, 23);
				panelSaldoEnFecha.add(btnBuscarSaldoEnFecha);
				
				JLabel lblTituloSaldoEnFecha = new JLabel("Saldo en la fecha elegida");
				lblTituloSaldoEnFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblTituloSaldoEnFecha.setBounds(182, 38, 186, 23);
				panelSaldoEnFecha.add(lblTituloSaldoEnFecha);
				
				JLabel lblDiaParaSaldo = new JLabel("Dia:");
				lblDiaParaSaldo.setBounds(46, 142, 29, 14);
				panelSaldoEnFecha.add(lblDiaParaSaldo);
				
				tFDiaParaSaldo = new JTextField();
				tFDiaParaSaldo.setBounds(79, 139, 86, 20);
				panelSaldoEnFecha.add(tFDiaParaSaldo);
				tFDiaParaSaldo.setColumns(10);
				
				JLabel lblMesParaSaldo = new JLabel("Mes:");
				lblMesParaSaldo.setBounds(203, 142, 29, 14);
				panelSaldoEnFecha.add(lblMesParaSaldo);
				
				tFMesParaSaldo = new JTextField();
				tFMesParaSaldo.setBounds(244, 139, 86, 20);
				panelSaldoEnFecha.add(tFMesParaSaldo);
				tFMesParaSaldo.setColumns(10);
				
				JLabel lblAnioParaSaldo = new JLabel("Año:");
				lblAnioParaSaldo.setBounds(365, 142, 29, 14);
				panelSaldoEnFecha.add(lblAnioParaSaldo);
				
				tFAnioParaSaldo = new JTextField();
				tFAnioParaSaldo.setBounds(404, 139, 86, 20);
				panelSaldoEnFecha.add(tFAnioParaSaldo);
				tFAnioParaSaldo.setColumns(10);
				
				//Panel de Depósitos------------------------------------------------------------------------------------------------------------
				JPanel panelDepositos = new JPanel();
				panelDepositos.setBounds(0, 34, 579, 293);
				panelInicio.add(panelDepositos);
				panelDepositos.setLayout(null);
				
				JLabel lblDepositar = new JLabel("Depositar...");
				lblDepositar.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblDepositar.setBounds(238, 24, 99, 20);
				panelDepositos.add(lblDepositar);
				
				JLabel lblNombreBenefDep = new JLabel("Nombre:");
				lblNombreBenefDep.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNombreBenefDep.setBounds(128, 95, 64, 14);
				panelDepositos.add(lblNombreBenefDep);
				
				JLabel lblApellidoBenefDep = new JLabel("Apellido:");
				lblApellidoBenefDep.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblApellidoBenefDep.setBounds(128, 126, 64, 14);
				panelDepositos.add(lblApellidoBenefDep);
				
				JLabel lblDNIBenefDep = new JLabel("DNI:");
				lblDNIBenefDep.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDNIBenefDep.setBounds(292, 95, 46, 14);
				panelDepositos.add(lblDNIBenefDep);
				
				JLabel lblMontoBenefDep = new JLabel("Monto:");
				lblMontoBenefDep.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMontoBenefDep.setBounds(280, 126, 46, 14);
				panelDepositos.add(lblMontoBenefDep);
				
				tFNombreDep = new JTextField();
				tFNombreDep.setBounds(181, 91, 86, 20);
				panelDepositos.add(tFNombreDep);
				tFNombreDep.setColumns(10);
				
				tFApellidoDep = new JTextField();
				tFApellidoDep.setBounds(181, 123, 86, 20);
				panelDepositos.add(tFApellidoDep);
				tFApellidoDep.setColumns(10);
				
				tFDNIDep = new JTextField();
				tFDNIDep.setBounds(323, 92, 86, 20);
				panelDepositos.add(tFDNIDep);
				tFDNIDep.setColumns(10);
				
				tDMontoDep = new JTextField();
				tDMontoDep.setBounds(323, 123, 86, 20);
				panelDepositos.add(tDMontoDep);
				tDMontoDep.setColumns(10);
				
				JButton btnOkDep = new JButton("OK");
				btnOkDep.setBounds(303, 201, 100, 23);
				panelDepositos.add(btnOkDep);
				
				JButton btnCancelDep = new JButton("CANCELAR");
				btnCancelDep.setBounds(147, 201, 100, 23);
				panelDepositos.add(btnCancelDep);
				
				JPanel panelTransferencia = new JPanel();
				panelTransferencia.setBounds(0, 34, 579, 293);
				panelInicio.add(panelTransferencia);
				panelTransferencia.setLayout(null);
				
				JLabel lblNombreBenefTrans = new JLabel("Nombre:");
				lblNombreBenefTrans.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNombreBenefTrans.setBounds(116, 108, 64, 14);
				panelTransferencia.add(lblNombreBenefTrans);
				
				JLabel lblApellidoBenef = new JLabel("Apellido:");
				lblApellidoBenef.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblApellidoBenef.setBounds(116, 138, 64, 14);
				panelTransferencia.add(lblApellidoBenef);
				
				JLabel lblDNIBenef = new JLabel("DNI:");
				lblDNIBenef.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDNIBenef.setBounds(291, 108, 46, 14);
				panelTransferencia.add(lblDNIBenef);
				
				tFdNombreBenef = new JTextField();
				tFdNombreBenef.setBounds(180, 104, 86, 20);
				panelTransferencia.add(tFdNombreBenef);
				tFdNombreBenef.setColumns(10);
				
				tFApellidoBenef = new JTextField();
				tFApellidoBenef.setBounds(180, 136, 86, 20);
				panelTransferencia.add(tFApellidoBenef);
				tFApellidoBenef.setColumns(10);
				
				tFDNIBenef = new JTextField();
				tFDNIBenef.setBounds(334, 105, 86, 20);
				panelTransferencia.add(tFDNIBenef);
				tFDNIBenef.setColumns(10);
				
				tFMontoBenef = new JTextField();
				tFMontoBenef.setBounds(334, 136, 86, 20);
				panelTransferencia.add(tFMontoBenef);
				tFMontoBenef.setColumns(10);
				
				JLabel lblMontoTrans = new JLabel("Monto:");
				lblMontoTrans.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblMontoTrans.setBounds(291, 139, 46, 14);
				panelTransferencia.add(lblMontoTrans);
				
				JButton btnOkTrans = new JButton("OK");
				btnOkTrans.setBounds(306, 225, 100, 23);
				panelTransferencia.add(btnOkTrans);
				
				JButton btnCancel = new JButton("CANCELAR");
				btnCancel.setBounds(150, 225, 100, 23);
				panelTransferencia.add(btnCancel);
				
				JLabel lblNewLabel_2 = new JLabel("Transferir...");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_2.setBounds(237, 35, 100, 20);
				panelTransferencia.add(lblNewLabel_2);
				panelTransferencia.setVisible(false);
		
		JLabel lblNameHome = new JLabel("New label");
		lblNameHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNameHome.setBounds(125, 10, 100, 25);
		panelInicio.add(lblNameHome);
		
		JLabel lblMontoInicio = new JLabel("New label");
		lblMontoInicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMontoInicio.setBounds(277, 8, 233, 27);
		panelInicio.add(lblMontoInicio);
		
		JPanel panelOptions = new JPanel();
		panelOptions.setBounds(36, 102, 512, 154);
		panelInicio.add(panelOptions);
		panelOptions.setLayout(null);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.setBounds(20, 31, 145, 23);
		panelOptions.add(btnTransferir);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(182, 31, 145, 23);
		panelOptions.add(btnDepositar);
		
		JButton btnUltNTrans = new JButton("Ultimas N trans.");
		btnUltNTrans.setBounds(344, 31, 145, 23);
		panelOptions.add(btnUltNTrans);
		
		JButton btnNTransMayorValor = new JButton("N trans mayor valor");
		btnNTransMayorValor.setBounds(20, 72, 145, 23);
		panelOptions.add(btnNTransMayorValor);
		
		JButton btnTransMismoValor = new JButton("Trans Mismo Valor");
		btnTransMismoValor.setBounds(344, 72, 145, 23);
		panelOptions.add(btnTransMismoValor);
		
		JButton btnTransEnFecha = new JButton("Transaccion en determinada fecha");
		btnTransEnFecha.setBounds(10, 106, 240, 23);
		panelOptions.add(btnTransEnFecha);
		
		JButton btnTransMayorAN = new JButton("Trans mayores a N");
		btnTransMayorAN.setBounds(262, 106, 240, 23);
		panelOptions.add(btnTransMayorAN);
		
		JButton btnSaldoEnFecha = new JButton("Saldo en det. fecha");
		btnSaldoEnFecha.setBounds(182, 72, 145, 23);
		panelOptions.add(btnSaldoEnFecha);
		
		//Panel de Registro
		JPanel panelRegistro = 	new JPanel();
		panelRegistro.setBounds(0, 0, 579, 317);
		frmCuentaBancaria.getContentPane().add(panelRegistro);
		panelRegistro.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBienvenido.setBounds(231, 11, 100, 23);
		panelRegistro.add(lblBienvenido);
		
		JLabel lblRegistrese = new JLabel("Regístrese: ");
		lblRegistrese.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRegistrese.setBounds(44, 58, 86, 23);
		panelRegistro.add(lblRegistrese);
		
		JLabel lblNombreRegistro = new JLabel("* Nombre:");
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombreRegistro.setBounds(115, 111, 58, 25);
		panelRegistro.add(lblNombreRegistro);
		
		JLabel lblApellidoRegistro = new JLabel("* Apellido:");
		lblApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellidoRegistro.setBounds(115, 146, 57, 23);
		panelRegistro.add(lblApellidoRegistro);
		
		JLabel lblNumDocRegistro = new JLabel("* DNI:");
		lblNumDocRegistro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumDocRegistro.setBounds(309, 116, 46, 14);
		panelRegistro.add(lblNumDocRegistro);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(183, 115, 86, 20);
		panelRegistro.add(tFNombre);
		tFNombre.setColumns(10);
		
		tFApellido = new JTextField();
		tFApellido.setBounds(183, 148, 86, 20);
		panelRegistro.add(tFApellido);
		tFApellido.setColumns(10);
		
		tFDni = new JTextField();
		tFDni.setBounds(356, 113, 86, 20);
		panelRegistro.add(tFDni);
		tFDni.setColumns(10);
		
		JLabel lblClaveRegistro = new JLabel("* Clave:");
		lblClaveRegistro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblClaveRegistro.setBounds(309, 150, 46, 14);
		panelRegistro.add(lblClaveRegistro);
		
		jPFclave = new JPasswordField();
		jPFclave.setBounds(356, 147, 86, 20);
		panelRegistro.add(jPFclave);
		jPFclave.setColumns(10);
		
		JLabel lblMontoInic = new JLabel("Monto Inicial:");
		lblMontoInic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMontoInic.setBounds(191, 194, 78, 14);
		panelRegistro.add(lblMontoInic);
				
		tFMonto = new JTextField();
		tFMonto.setText("0");
		tFMonto.setBounds(275, 192, 86, 20);
		panelRegistro.add(tFMonto);
		tFMonto.setColumns(10);
		
		JButton sigInButton = new JButton("INGRESAR");
		sigInButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sigInButton.setBounds(231, 283, 100, 23);
		panelRegistro.add(sigInButton);
				
		JLabel lblCamposObligatorios = new JLabel("Los campos con * son obligatorios.");
		lblCamposObligatorios.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblCamposObligatorios.setBounds(396, 258, 173, 14);
		panelRegistro.add(lblCamposObligatorios);
		panelInicio.setVisible(false);
		
		//Oyente Inicio
		
		sigInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombreRegistro = tFNombre.getText();
					String apellidoRegistro = tFApellido.getText();
					Integer docRegistro = Integer.parseInt(tFDni.getText());
					Float monto = Float.parseFloat(tFMonto.getText());
					char[] claveRegistro = jPFclave.getPassword();
					String clave = "";
					for(int i = 0; i < claveRegistro.length; i++) {
						clave = clave + claveRegistro[i];
					}
					CuentaBancaria c = new CuentaBancaria(nombreRegistro, apellidoRegistro, docRegistro, clave, monto);	
					lblNameHome.setText(c.getFirstName()+" "+c.getLastName());
					lblMontoInicio.setText("Saldo: $"+c.getAmount());
					
					//Transferir----------------------------------------------------------------------------------------------------
					
					btnTransferir.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
						try {
								if(btnTransferir == e.getSource()) {
									
									btnTransferir.setVisible(false);
									btnDepositar.setVisible(false);
									btnUltNTrans.setVisible(false);
									btnNTransMayorValor.setVisible(false);
									btnTransMismoValor.setVisible(false);
									btnTransEnFecha.setVisible(false);
									btnTransMayorAN.setVisible(false);
									btnSaldoEnFecha.setVisible(false);
									panelTransferencia.setVisible(true);
									panelInicio.setEnabled(false);
									
								}
							}catch(NullPointerException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "Error. Complete los campos");
							}
						tFdNombreBenef.setText("");
						tFApellidoBenef.setText("");
						tFDNIBenef.setText("");
						tFMontoBenef.setText("");
						}
						
					});
					
					//Boton Cancelar del Transferir
					btnCancel.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransferencia.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);

						}
						
					});
					
					//Boton Ok del transferir
					btnOkTrans.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								String nombreTransferir = tFdNombreBenef.getText();
								String apellidoTransferir = tFApellidoBenef.getText();
								Integer docTransferir = Integer.parseInt(tFDNIBenef.getText());
								Float montoTransferir = Float.parseFloat(tFMontoBenef.getText());
								if(btnOkTrans == e.getSource()) {
								c.transferences(nombreTransferir, apellidoTransferir, docTransferir, montoTransferir);
								JOptionPane.showMessageDialog(panelTransferencia, "Transferencia exitosa");
								
								panelTransferencia.setVisible(false);
								panelTransferencia.setEnabled(false);
								btnTransferir.setVisible(true);
								btnDepositar.setVisible(true);
								btnUltNTrans.setVisible(true);
								btnNTransMayorValor.setVisible(true);
								btnTransMismoValor.setVisible(true);
								btnTransEnFecha.setVisible(true);
								btnTransMayorAN.setVisible(true);
								btnSaldoEnFecha.setVisible(true);
								lblMontoInicio.setText("Saldo Actual: $"+c.getAmount());
								}
							}catch(InsuficientAmountException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "No es posible transferir. Saldo insuficiente");
							
							}
							catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "Error. Ingrese los datos correctamente");
							}
							
						}
					});
					
					//Depositar------------------------------------------------------------------------------------------------------------
					btnDepositar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								if(btnDepositar == e.getSource()) {
									
									btnTransferir.setVisible(false);
									btnDepositar.setVisible(false);
									btnUltNTrans.setVisible(false);
									btnNTransMayorValor.setVisible(false);
									btnTransMismoValor.setVisible(false);
									btnTransEnFecha.setVisible(false);
									btnTransMayorAN.setVisible(false);
									btnSaldoEnFecha.setVisible(false);
									panelDepositos.setVisible(true);
									panelInicio.setEnabled(false);
									
								}
							}catch(NullPointerException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "Error. Complete los campos");
							}
						tFNombreDep.setText("");
						tFApellidoDep.setText("");
						tFDNIDep.setText("");
						tDMontoDep.setText("");
						}
						
					});
					
					//Boton Cancelar del Depositar
					btnCancelDep.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelDepositos.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);

						}
						
					});
					
					//Boton OK del Depositar
					btnOkDep.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								String nombreDeposito = tFNombreDep.getText();
								String apellidoDeposito = tFApellidoDep.getText();
								Integer docDeposito = Integer.parseInt(tFDNIDep.getText());
								Float montoDeposito = Float.parseFloat(tDMontoDep.getText());
								if(btnOkDep == e.getSource()) {
								c.deposites(nombreDeposito, apellidoDeposito, docDeposito, montoDeposito);
								JOptionPane.showMessageDialog(panelDepositos, "Depósito exitoso");
								
								panelDepositos.setVisible(false);
								panelDepositos.setEnabled(false);
								btnTransferir.setVisible(true);
								btnDepositar.setVisible(true);
								btnUltNTrans.setVisible(true);
								btnNTransMayorValor.setVisible(true);
								btnTransMismoValor.setVisible(true);
								btnTransEnFecha.setVisible(true);
								btnTransMayorAN.setVisible(true);
								btnSaldoEnFecha.setVisible(true);
								lblMontoInicio.setText("Saldo Actual: $"+c.getAmount());
								}
							}
							catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelTransferencia, "Error. Ingrese los datos correctamente");
							}
							
						}
						
					});
					
					//Ultimas N transferencias--------------------------------------------------------------------------------------------
					
					btnUltNTrans.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							panelUltNTrans.setVisible(true);
							panelInicio.setEnabled(false);
							ultTfNtrans.setText("");
							textAreaUltNTrans.setText("");
						}
					});
					
					//Boton de buscar las N transacciones
					btnBuscarNtrans.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Integer n = Integer.parseInt(ultTfNtrans.getText());
								textAreaUltNTrans.setText(c.nTrans(n));
								
							}catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelUltNTrans, "Error. Ingrese un numero entero por favor.");
							}
							catch(BoundaryViolationException error) {
								JOptionPane.showMessageDialog(panelUltNTrans, "Error. Numero ingresado mayor a la cantidad de transacciones");
								ultTfNtrans.setText("");
								textAreaUltNTrans.setText("");
							}
							catch(EmptyListException error) {
								textAreaUltNTrans.setText("No hay transacciones realizadas");
							}
							
						}
					});
					
					//Boton de volver de NTransacciones
					btnVolverDeNTrans.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelUltNTrans.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
					
					//N transferencias de mayor valor-----------------------------------------------------------------------------------------
					
					btnNTransMayorValor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelNTransMayor.setVisible(true);
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							tFNTransMAyor.setText("");
							textAreaNTransMayor.setText("");
						}
					});
					
					//Boton buscar las N transacciones de mayor valor
					btnBuscarNtransMayor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Integer n = Integer.parseInt(tFNTransMAyor.getText());
								textAreaNTransMayor.setText(c.nTransMayorValor(n));
							}catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelNTransMayor, "Error. Por favor, ingrese un numero entero");
							}catch(EmptyPriorityQueueException error) {
								JOptionPane.showMessageDialog(panelNTransMayor, "Error. Ha ingresado un entero mayor a la cantidad de transacciones");
								tFNTransMAyor.setText("");
								textAreaNTransMayor.setText("");
							}
						}
					});
					
					//Boton de volver de las N transacciones de mayor valor
					btnVolverDeNTransMayor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelNTransMayor.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
					
					//Transferencias de mismo valor-----------------------------------------------------------------------------------------
					
					btnTransMismoValor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransMismoValor.setVisible(true);
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							tFTransMismoValor.setText("");
							textAreaTransMismoValor.setText("");
						}
					});
					
					//Boton de buscar transacciones del mismo valor
					btnBuscarTransMismoValor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Float n = Float.parseFloat(tFTransMismoValor.getText());
								textAreaTransMismoValor.setText(c.operacionMismoValor(n));
							}catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelTransMismoValor, "Error. Caracter incorrecto. Ingrese un numero");
							}
						}
					});
					
					//Boton de volver de Transacciones del mismo valor
					btnVolverDeTransMismoValor.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransMismoValor.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
					
					//Transacciones en determinada fecha----------------------------------------------------------------------------------------
					btnTransEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransEnFecha.setVisible(true);
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							tFDiaEnFecha.setText("");
							tFMesEnFecha.setText("");
							tFAnioEnFecha.setText("");
							textAreaTransEnFecha.setText("");
						}
					});
					
					//Boton de buscar transacciones en determinada fecha
					btnBuscarTransEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Integer dia = Integer.parseInt(tFDiaEnFecha.getText());
								Integer mes = Integer.parseInt(tFMesEnFecha.getText());
								Integer anio = Integer.parseInt(tFAnioEnFecha.getText());
								textAreaTransEnFecha.setText(c.dateTransactions(dia, mes, anio));
							}catch(InvalidDateException error) {
								JOptionPane.showMessageDialog(panelTransEnFecha, "Error. Fecha incorrecta"); 	
							}
							catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelTransEnFecha, "Error. Por favor complete todos los campos"); 	

							}
						}
					});
					
					//Boton de volver de transacciones en determinada fecha
					btnVolverDeTransEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransEnFecha.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
					
					//Transacciones mayores a N-----------------------------------------------------------------------------------------
					btnTransMayorAN.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransMayorAN.setVisible(true);
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							tFTransMayorAN.setText("");
							textAreaTransMayorAN.setText("");
							MenuTipos.setText("Seleccionar...");
						}
					});
					
					//Item de todas las transacciones
					itemTodas.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							MenuTipos.setText("Todas");
						}
					});
				
					//Item de las transacciones de Crédito
					itemCredito.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							MenuTipos.setText("Crédito");
						}
					});
					
					//Item de las transacciones de Débito
					itemDebito.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							MenuTipos.setText("Débito");
						}
					});
					
					//Boton de buscar las transacciones mayores a N
					btnBuscarTransMayorAN.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Float n = Float.parseFloat(tFTransMayorAN.getText());
								textAreaTransMayorAN.setText(c.amountTransactions(n, MenuTipos.getText()));
							}catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelTransMayorAN, "Error. Ingrese un caracter válido");
							}
						}
					});
					
					//Boton de volver de las transacciones mayores a N 
					btnVolverDeTransMayorAN.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelTransMayorAN.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
								
					//Saldo en determinada fecha----------------------------------------------------------------------------------------------
					
					btnSaldoEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelSaldoEnFecha.setVisible(true);
							btnTransferir.setVisible(false);
							btnDepositar.setVisible(false);
							btnUltNTrans.setVisible(false);
							btnNTransMayorValor.setVisible(false);
							btnTransMismoValor.setVisible(false);
							btnTransEnFecha.setVisible(false);
							btnTransMayorAN.setVisible(false);
							btnSaldoEnFecha.setVisible(false);
							tFDiaParaSaldo.setText("");
							tFMesParaSaldo.setText("");
							tFAnioParaSaldo.setText("");
						}
					});
					
					//Boton de buscar el saldo en determinada fecha 
					btnBuscarSaldoEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								Integer dia = Integer.parseInt(tFDiaParaSaldo.getText());
								Integer mes = Integer.parseInt(tFMesParaSaldo.getText());
								Integer anio = Integer.parseInt(tFAnioParaSaldo.getText());
								JOptionPane.showMessageDialog(panelSaldoEnFecha, "Saldo en dicha fecha = $"+c.saldoEnDeterminadaFecha(dia, mes, anio));
							}catch(NumberFormatException error) {
								JOptionPane.showMessageDialog(panelSaldoEnFecha,  "Error. Ingrese un caracter correcto");
							}
							catch(InvalidDateException error) {
								JOptionPane.showMessageDialog(panelSaldoEnFecha,  "Error. Fecha ingresada incorrecta");
							}
							catch(EmptyListException error) {
								JOptionPane.showMessageDialog(panelSaldoEnFecha,  "Error. No se registran transacciones al día de la fecha. \n Saldo: $"+c.getAmount());
							}
						}
					});
					
					//Boton de volver de saldo en determinada fecha
					btnVolverDeSaldoEnFecha.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panelSaldoEnFecha.setVisible(false);
							btnTransferir.setVisible(true);
							btnDepositar.setVisible(true);
							btnUltNTrans.setVisible(true);
							btnNTransMayorValor.setVisible(true);
							btnTransMismoValor.setVisible(true);
							btnTransEnFecha.setVisible(true);
							btnTransMayorAN.setVisible(true);
							btnSaldoEnFecha.setVisible(true);
						}
					});
					
					panelRegistro.setEnabled(false);
					panelRegistro.setVisible(false);
					panelInicio.setVisible(true);
					panelOptions.setVisible(true);
					panelDepositos.setVisible(false);
					panelUltNTrans.setVisible(false);
					panelNTransMayor.setVisible(false);
					panelTransMismoValor.setVisible(false);
					panelTransEnFecha.setVisible(false);
					panelTransMayorAN.setVisible(false);
					panelSaldoEnFecha.setVisible(false);
					panelTransEnFecha.setVisible(false);
					panelTransMayorAN.setVisible(false);
					panelSaldoEnFecha.setVisible(false);
				}catch(InvalidAccessCodeException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Clave ingresada incorrecta");
				}
				catch(NumberFormatException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Ingrese los datos correctamente");

				}
				catch(InvalidNameException error) {
					JOptionPane.showMessageDialog(frmCuentaBancaria, "Error. Complete los campos obligatorios.");
				}
			}
		});
		
	}
}