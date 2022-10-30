package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AcadLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLog;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcadLogin frame = new AcadLogin();
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
	public AcadLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 151, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(183, 165, 166, 29);
		contentPane.add(lblNewLabel_1);
		
		txtLog = new JTextField();
		txtLog.setColumns(10);
		txtLog.setBounds(110, 195, 214, 40);
		contentPane.add(txtLog);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(183, 272, 166, 29);
		contentPane.add(lblNewLabel_1_1);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(110, 300, 214, 40);
		contentPane.add(txtSenha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\felli\\Desktop\\gold-removebg-preview.png"));
		lblNewLabel.setBounds(141, 27, 153, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnLog = new JButton("Logar");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtLog.getText().equals("admin") && txtSenha.getText().equals("admin")) {
					AcadMenu f3 = new AcadMenu();
					f3.setVisible(true);
					dispose();
				}
			}
		});
		btnLog.setBounds(152, 351, 121, 29);
		contentPane.add(btnLog);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcadCadastro y1 = new AcadCadastro();
				y1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(151, 391, 122, 23);
		contentPane.add(btnNewButton);
	}

}
