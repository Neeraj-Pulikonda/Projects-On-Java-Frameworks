package PROJECT1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractButton;

public class METROTICKETBOOKING {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKETBOOKING window = new METROTICKETBOOKING();
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
	public METROTICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tb1 = new JTextField();
		tb1.setBounds(233, 52, 85, 19);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("METRO TICKETS BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(119, 10, 215, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_1.setBounds(155, 55, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_2.setBounds(155, 91, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_3.setBounds(124, 128, 85, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("NO.OF TICKETS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_5.setBounds(119, 194, 85, 13);
		frame.getContentPane().add(lblNewLabel_5);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "LB NAGAR", "DILSUKHNAGAR", "CHAITHANYA PURI", "MUSHEERABAD", "NARAYANAGUDA", "SULTHAN BAZAR", "MG BUS STATION"}));
		c1.setBounds(232, 87, 86, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SECUNDRABAD WEST", "PARADISE", "PARADE GROUNDS", "SECUNDRABAD EAST", "GANDHI HOSPITAL"}));
		c2.setBounds(233, 124, 85, 21);
		frame.getContentPane().add(c2);
		
		JSpinner s1 = new JSpinner();
		s1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		s1.setBounds(233, 191, 85, 20);
		frame.getContentPane().add(s1);
		
		
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String s = (String) c1.getSelectedItem();
				String d = (String) c2.getSelectedItem();
				int nt = (int)s1.getValue();
				int bill = 0;
				if(s.equals(d))
					JOptionPane.showMessageDialog(btnNewButton, "Please check stations");
				else
					bill=bill+nt*45;
				JOptionPane.showMessageDialog(btnNewButton, "NAME : "+name+"\n SOURCE : "+s+"\n DESTINATION : "+d+
						"\n NUMBER OF TICKETS : "+nt+"\n AMOUNT : "+bill+
						"\n !!------HAPPY JOURNEY-------!!");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBounds(179, 232, 85, 21);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\neera\\Downloads\\NE.jpg"));
		lblNewLabel_6.setBounds(10, 0, 426, 263);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
