package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AcadMusc extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSeg;
	private JTextField txtTer;
	private JTextField txtQua;
	private JTextField txtQuin;
	private JTextField txtSex;
	private JTextField txtSab;
	private JButton btnBack4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadMusc frame = new AcadMusc();
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
	public AcadMusc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Segunda", "Ter\u00E7a", "Quarta", "Quinta", "Sexta", "Sabado"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(98, 68, 488, 144);
		contentPane.add(table);
		
		txtSeg = new JTextField();
		txtSeg.setBounds(95, 223, 65, 20);
		contentPane.add(txtSeg);
		txtSeg.setColumns(10);
		
		txtTer = new JTextField();
		txtTer.setColumns(10);
		txtTer.setBounds(165, 223, 65, 20);
		contentPane.add(txtTer);
		
		txtQua = new JTextField();
		txtQua.setColumns(10);
		txtQua.setBounds(234, 223, 65, 20);
		contentPane.add(txtQua);
		
		txtQuin = new JTextField();
		txtQuin.setColumns(10);
		txtQuin.setBounds(304, 223, 65, 20);
		contentPane.add(txtQuin);
		
		txtSex = new JTextField();
		txtSex.setColumns(10);
		txtSex.setBounds(373, 223, 65, 20);
		contentPane.add(txtSex);
		
		txtSab = new JTextField();
		txtSab.setColumns(10);
		txtSab.setBounds(443, 223, 65, 20);
		contentPane.add(txtSab);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {(txtSeg.getText()), (txtTer.getText()), (txtQua.getText()), (txtQuin.getText()), (txtSex.getText()), (txtSab.getText())});
			}
		});
		btnNewButton.setBounds(518, 222, 86, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Horário Musculação");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(235, 0, 217, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\felli\\Desktop\\Dicas-para-quem-faz-musculação.jpg"));
		lblNewLabel_1.setBounds(0, 36, 683, 360);
		contentPane.add(lblNewLabel_1);
		
		btnBack4 = new JButton("Back");
		btnBack4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadMenu z5 = new AcadMenu();
				z5.setVisible(true);
				dispose();
			}
		});
		btnBack4.setBounds(518, 9, 89, 23);
		contentPane.add(btnBack4);
	}
}
