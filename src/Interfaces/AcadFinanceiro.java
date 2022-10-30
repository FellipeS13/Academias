package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AcadFinanceiro extends JFrame {

	private JPanel contentPane;
	private JTable tabelaPag;
	private JTable tabelaPag2;
	private JTextField txtMs;
	private JTextField txtValor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtData;
	private JTextField txtVal;
	private JButton btnVoltar2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadFinanceiro frame = new AcadFinanceiro();
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
	public AcadFinanceiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mensalidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(210, 11, 157, 35);
		contentPane.add(lblNewLabel);
		
		tabelaPag = new JTable();
		tabelaPag.setBackground(new Color(0, 128, 0));
		tabelaPag.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaPag.setBounds(105, 74, 159, 247);
		contentPane.add(tabelaPag);
		
		tabelaPag2 = new JTable();
		tabelaPag2.setBackground(new Color(206, 0, 0));
		tabelaPag2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaPag2.setBounds(339, 74, 157, 247);
		contentPane.add(tabelaPag2);
		
		txtMs = new JTextField();
		txtMs.setHorizontalAlignment(SwingConstants.CENTER);
		txtMs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMs.setText("Data");
		txtMs.setBounds(105, 54, 80, 20);
		contentPane.add(txtMs);
		txtMs.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setText("Valor");
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtValor.setColumns(10);
		txtValor.setBounds(184, 54, 80, 20);
		contentPane.add(txtValor);
		
		textField = new JTextField();
		textField.setText("Data");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(339, 54, 80, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Valor");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(418, 54, 80, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Pagos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(169, 332, 68, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Em aberto");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(388, 332, 80, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tabelaPag.getModel();
				model.addRow(new Object[] {(txtData.getText()), (txtVal.getText())});
				
			}
		});
		btnNewButton.setBounds(105, 363, 80, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) tabelaPag.getModel()).removeRow(tabelaPag.getSelectedRow());
				
			}
		});
		btnDeletar.setBounds(184, 363, 80, 23);
		contentPane.add(btnDeletar);
		
		JButton btnNewButton_1 = new JButton("Adicionar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel)tabelaPag2.getModel();
				model1.addRow(new Object[] {(txtData.getText()), (txtVal.getText())});
			}
		});
		btnNewButton_1.setBounds(337, 363, 80, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnDeletar_1 = new JButton("Deletar");
		btnDeletar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) tabelaPag2.getModel()).removeRow(tabelaPag2.getSelectedRow());
			}
		});
		btnDeletar_1.setBounds(416, 363, 80, 23);
		contentPane.add(btnDeletar_1);
		
		txtData = new JTextField();
		txtData.setBounds(9, 71, 86, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtVal = new JTextField();
		txtVal.setBounds(9, 102, 86, 20);
		contentPane.add(txtVal);
		txtVal.setColumns(10);
		
		btnVoltar2 = new JButton("Voltar");
		btnVoltar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadMenu z6 = new AcadMenu();
				z6.setVisible(true);
				dispose();
			}
		});
		btnVoltar2.setBounds(505, 11, 89, 23);
		contentPane.add(btnVoltar2);
	}
}
