package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcadNat extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadNat frame = new AcadNat();
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
	public AcadNat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Segunda", "Ter\u00E7a", "Quarta", "Quinta", "Sexta", "Sabado"},
				{"10:30", null, null, "13:30", "13:00", null},
				{"15:30", null, "16:30", null, "15:00", null},
				{"18:30", null, null, "18:30", "18:00", null},
			},
			new String[] {
				"Segunda", "Ter\u00E7a", "Quarta", "Quinta", "Sexta", "Sabado"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.setBounds(93, 119, 482, 64);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Horários Natação");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(234, 0, 207, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\felli\\Desktop\\beneficios-da-nataccca7acc83o-para-corredores.jpg"));
		lblNewLabel_1.setBounds(0, 28, 682, 373);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBack3 = new JButton("back");
		btnBack3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadMenu z4 = new AcadMenu();
				z4.setVisible(true);
				dispose();
			}
		});
		btnBack3.setBounds(543, 7, 89, 23);
		contentPane.add(btnBack3);
	}
}
