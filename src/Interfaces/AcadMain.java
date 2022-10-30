package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class AcadMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtResult;
	private JTextField txtSit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadMain frame = new AcadMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AcadMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setForeground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 54, 166, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Peso");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(31, 100, 166, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("IMC");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(31, 147, 166, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hipertrofia");
		rdbtnNewRadioButton.setBackground(new Color(255, 128, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(349, 77, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEmagrecimento = new JRadioButton("Emagrecimento");
		rdbtnEmagrecimento.setBackground(new Color(255, 128, 0));
		rdbtnEmagrecimento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEmagrecimento.setBounds(349, 123, 166, 23);
		contentPane.add(rdbtnEmagrecimento);
		
		JRadioButton rdbtnDefinio = new JRadioButton("Definição");
		rdbtnDefinio.setBackground(new Color(255, 128, 0));
		rdbtnDefinio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnDefinio.setBounds(349, 170, 166, 23);
		contentPane.add(rdbtnDefinio);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(31, 80, 189, 20);
		contentPane.add(txtAltura);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(31, 125, 189, 20);
		contentPane.add(txtPeso);
		
		txtResult = new JTextField();
		txtResult.setColumns(10);
		txtResult.setBounds(31, 173, 189, 20);
		contentPane.add(txtResult);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Situação");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(245, 224, 73, 29);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtSit = new JTextField();
		txtSit.setColumns(10);
		txtSit.setBounds(182, 253, 189, 20);
		contentPane.add(txtSit);
		
		JButton btnNewButton = new JButton("Gerar imc");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt1 = txtPeso.getText();
				String txt2 = txtAltura.getText();
				
				double nPeso = Double.parseDouble(txt1);
				double nAlt = Double.parseDouble(txt2);
				
				double resultado = nPeso /(nAlt*nAlt);
				String txtResultado = String.valueOf(resultado);
				txtResult.setText(txtResultado);
				
				if(resultado < 18.5){
					txtSit.setText("Abaixo do Peso");
				}
				else if (resultado > 18.5 && resultado < 20) {
					txtSit.setText("Peso Ideal");
				}
				else if (resultado > 20 && resultado < 25) {
					txtSit.setText("Acima do Peso");
				}
				else if (resultado > 25 && resultado < 30) {
					txtSit.setText("Ta Obeso");
				}
			}
		});
		btnNewButton.setBounds(31, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGerarTreino = new JButton("Gerar Treino");
		btnGerarTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtSit.getText().equals("Acima do Peso")) {
					AcadTreino1 f1 = new AcadTreino1();
					f1.setVisible(true);
				}
				else if (txtSit.getText().equals("Peso Ideal")) {
					AcadTreino2 f2 = new AcadTreino2();
					f2.setVisible(true);
				}
				else if (txtSit.getText().equals("Ta Obeso")) {
					AcadTreino3 f3 = new AcadTreino3();
					f3.setVisible(true);
				}
				else if (txtSit.getText().equals("Abaixo do Peso")) {
					AcadTreino4 f4 = new AcadTreino4();
					f4.setVisible(true);
				}
				
			}
		});
		btnGerarTreino.setBounds(224, 284, 101, 23);
		contentPane.add(btnGerarTreino);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gerando Treino");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(238, 11, 166, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AcadMain.class.getResource("/Interfaces/gold-removebg-preview.png")));
		lblNewLabel.setBounds(201, 321, 158, 51);
		contentPane.add(lblNewLabel);
	}
}
