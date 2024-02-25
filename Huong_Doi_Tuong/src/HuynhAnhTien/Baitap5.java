package HuynhAnhTien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Baitap5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Baitap5 frame = new Baitap5();
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
	public Baitap5() {
		setForeground(new Color(255, 0, 0));
		setTitle("LOGIN\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your user name and password");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblNewLabel.setBounds(29, 116, 472, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(28, 24, 122, 58);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(181, 160, 361, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 212, 361, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(95, 168, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(95, 220, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(346, 277, 89, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(471, 277, 89, 30);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(90, 249, 157, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 607, 106);
		contentPane.add(panel);
	}
}
