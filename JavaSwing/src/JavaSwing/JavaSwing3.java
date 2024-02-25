package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class JavaSwing3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing3 frame = new JavaSwing3();
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
	public JavaSwing3() {
		setTitle("RadioButton test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 124);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton Plain = new JRadioButton("Plain");
		buttonGroup.add(Plain);
		Plain.setBounds(44, 38, 72, 23);
		contentPane.add(Plain);
		
		JRadioButton Bold = new JRadioButton("Bold");
		buttonGroup.add(Bold);
		Bold.setBounds(137, 38, 66, 23);
		contentPane.add(Bold);
		
		JRadioButton Italic = new JRadioButton("Italic");
		buttonGroup.add(Italic);
		Italic.setBounds(234, 38, 56, 23);
		contentPane.add(Italic);
		
		JRadioButton BoldsvItalic = new JRadioButton("Bold/Italic");
		buttonGroup.add(BoldsvItalic);
		BoldsvItalic.setBounds(316, 38, 95, 23);
		contentPane.add(BoldsvItalic);
	}
}
