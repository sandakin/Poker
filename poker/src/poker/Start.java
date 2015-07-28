package poker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setTitle("8-Mix Poker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(148, 201, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Player Name");
		lblNewLabel.setBounds(34, 54, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSmallBind = new JLabel("Small Bind");
		lblSmallBind.setBounds(34, 85, 86, 14);
		contentPane.add(lblSmallBind);
		
		Choice choice = new Choice();
		choice.setBounds(141, 148, 86, 20);
		choice.add("4");
		contentPane.add(choice);
		
		JLabel lblGameType = new JLabel("Game Type");
		lblGameType.setBounds(34, 154, 86, 14);
		contentPane.add(lblGameType);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(141, 79, 86, 20);
		contentPane.add(choice_1);
		
	}
}
