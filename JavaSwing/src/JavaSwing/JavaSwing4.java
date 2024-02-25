package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JavaSwing4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing4 frame = new JavaSwing4();
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
	public JavaSwing4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Nh\u1EADp a,b,c :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 46, 434, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(128, 41, 186, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 72, 186, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 104, 186, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("a :");
		lblNewLabel_1.setBounds(96, 44, 22, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("b :");
		lblNewLabel_2.setBounds(96, 75, 22, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("c :");
		lblNewLabel_3.setBounds(96, 107, 22, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(128, 156, 186, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Ket qua");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(128, 135, 46, 14);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 128), 2), "Ch\u1ECDn thao t\u00E1c :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 254, 434, 83);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Giải");
		btnNewButton.setBounds(27, 32, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa trắng");
		btnNewButton_1.setBounds(179, 32, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Thoát");
		btnNewButton_2.setBounds(317, 32, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Giải phương trình bậc 2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(93, 11, 249, 34);
		contentPane.add(lblNewLabel);
	}
}
