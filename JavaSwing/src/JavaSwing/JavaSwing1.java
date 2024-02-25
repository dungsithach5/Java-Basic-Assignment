package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class JavaSwing1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldketqua;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing1 frame = new JavaSwing1();
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
	public JavaSwing1() {
		setForeground(new Color(255, 255, 255));
		setTitle("My First Swing Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField1.getText();
				String s2 = textField2.getText();
				
				
			}
		});
		btnNewButton.setBounds(60, 128, 70, 23);
		contentPane.add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(127, 63, 169, 23);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(127, 94, 169, 23);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(60, 64, 58, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(60, 97, 79, 20);
		contentPane.add(lblNewLabel_1);
		
		textFieldketqua = new JTextField();
		textFieldketqua.setEditable(false);
		textFieldketqua.setBounds(60, 162, 242, 72);
		contentPane.add(textFieldketqua);
		textFieldketqua.setColumns(10);
		
		btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.setBounds(137, 128, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
