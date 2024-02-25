package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JavaSwing2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing2 frame = new JavaSwing2();
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
	public JavaSwing2() {
		setBackground(new Color(255, 255, 255));
		setTitle("JCheckbox Test");
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bold");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(136, 72, 70, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Italic");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(237, 72, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		txtA = new JTextField();
		txtA.setBounds(61, 29, 299, 23);
		contentPane.add(txtA);
		txtA.setColumns(10);
	}
}
