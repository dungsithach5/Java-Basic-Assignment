package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class JavaSwing5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing5 frame = new JavaSwing5();
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
	public JavaSwing5() {
		setForeground(new Color(255, 255, 255));
		setTitle("Cộng-Trừ-Nhân-Chia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 343);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Ch\u1ECDn t\u00E1c v\u1EE5 :", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel.setBounds(0, 62, 102, 208);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(18, 66, 36, 74, (Color) new Color(255, 128, 64)));
		panel_2.setBackground(new Color(255, 128, 64));
		panel_2.setBounds(0, 211, 368, 32);
		panel.add(panel_2);
		
		JButton btnNewButton = new JButton("Giải");
		btnNewButton.setBounds(10, 21, 72, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setBounds(10, 55, 72, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Thoát");
		btnNewButton_2.setBounds(10, 91, 72, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Nh\u1EADp 2 s\u1ED1 a v\u00E0 b :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(101, 62, 267, 208);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(91, 29, 140, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 60, 140, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập a :");
		lblNewLabel_1.setBounds(35, 32, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập b :");
		lblNewLabel_2.setBounds(35, 63, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ch\u1ECDn ph\u00E9p to\u00E1n :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(91, 91, 140, 81);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cộng");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(5, 21, 52, 23);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nhân");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(5, 47, 57, 23);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Trừ");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(80, 21, 54, 23);
		panel_3.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Chia");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(80, 47, 54, 23);
		panel_3.add(rdbtnNewRadioButton_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(91, 177, 140, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả :");
		lblNewLabel_3.setBounds(35, 180, 55, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Cộng Trừ Nhân Chia");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(77, 11, 230, 40);
		contentPane.add(lblNewLabel);
	}

}
