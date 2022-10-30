package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AcadTreino4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadTreino4 frame = new AcadTreino4();
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
	public AcadTreino4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seu treino 4");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(286, 11, 121, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnBack5 = new JButton("Voltar");
		btnBack5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadMenu z8 = new AcadMenu();
				z8.setVisible(true);
				dispose();
			}
		});
		btnBack5.setBounds(286, 476, 112, 32);
		contentPane.add(btnBack5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AcadTreino4.class.getResource("/Interfaces/Qr Code 4.4.jpg")));
		lblNewLabel_1.setBounds(122, 43, 450, 422);
		contentPane.add(lblNewLabel_1);
	}

}
