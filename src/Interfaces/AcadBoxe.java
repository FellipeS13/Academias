package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AcadBoxe extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField txtS;
	private JTextField txtT;
	private JTextField txtQ;
	private JTextField txtQi;
	private JTextField txtSx;
	private JTextField txtSb;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadBoxe frame = new AcadBoxe();
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
	public AcadBoxe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Horário Boxe");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(208, 11, 217, 28);
		contentPane.add(lblNewLabel);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBounds(37, 85, 488, 144);
		contentPane.add(table_1);
		
		txtS = new JTextField();
		txtS.setColumns(10);
		txtS.setBounds(37, 241, 65, 20);
		contentPane.add(txtS);
		
		txtT = new JTextField();
		txtT.setColumns(10);
		txtT.setBounds(107, 241, 65, 20);
		contentPane.add(txtT);
		
		txtQ = new JTextField();
		txtQ.setColumns(10);
		txtQ.setBounds(176, 241, 65, 20);
		contentPane.add(txtQ);
		
		txtQi = new JTextField();
		txtQi.setColumns(10);
		txtQi.setBounds(246, 241, 65, 20);
		contentPane.add(txtQi);
		
		txtSx = new JTextField();
		txtSx.setColumns(10);
		txtSx.setBounds(315, 241, 65, 20);
		contentPane.add(txtSx);
		
		txtSb = new JTextField();
		txtSb.setColumns(10);
		txtSb.setBounds(385, 241, 65, 20);
		contentPane.add(txtSb);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				model.addRow(new Object[] {(txtS.getText()), (txtT.getText()), (txtQ.getText()), (txtQi.getText()), (txtSx.getText()), (txtSb.getText())});
			}
		});
		btnNewButton.setBounds(462, 240, 86, 23);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadMenu z3 = new AcadMenu();
				z3.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(485, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AcadBoxe.class.getResource("/Interfaces/boxe-2-590x393.jpg")));
		lblNewLabel_2.setBounds(0, 50, 643, 357);
		contentPane.add(lblNewLabel_2);
	}
}
