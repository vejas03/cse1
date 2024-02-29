package sampl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class login {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel.setBounds(136, 0, 137, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("user name ");
		tb1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tb1.setBounds(22, 61, 109, 17);
		frame.getContentPane().add(tb1);
		
		JLabel p1 = new JLabel("password");
		p1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		p1.setBounds(34, 123, 97, 33);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     String user=tb1.getText();
			     String password=p1.getText();
			     if (user.equals("raju")&& password.equals("1234567"))
			     JOptionPane.showMessageDialog(btnNewButton,"hello"+ user);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(136, 195, 99, 38);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 133, 155, 23);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(164, 63, 155, 20);
		frame.getContentPane().add(formattedTextField);
	}
}
