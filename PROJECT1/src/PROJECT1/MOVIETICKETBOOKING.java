package PROJECT1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MOVIETICKETBOOKING {

	protected static final int YES_OPTION = 0;
	protected static final int PAY_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOVIETICKETBOOKING window = new MOVIETICKETBOOKING();
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
	public MOVIETICKETBOOKING() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(111, 10, 224, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(125, 71, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(125, 118, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO.OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(76, 160, 105, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KALKI", "SALAAR", "ADHI PURUSH"}));
		c1.setBounds(199, 115, 90, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c2.setBounds(199, 156, 90, 21);
		frame.getContentPane().add(c2);
		
		tb1 = new JTextField();
		tb1.setBounds(199, 65, 90, 19);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String movie = (String) c1.getSelectedItem();
				String tickets = (String) c2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("KALKI"))
					bill=bill+nt*200;
				if(movie.equals("SALAAR"))
					bill=bill+nt*150;
				if(movie.equals("ADHI PURUSH"))
					bill=bill+nt*100;
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME :"+name+"\n MOVIE :"+movie+"\n TICKETS :"+nt);
				if(res==YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
					if(res==PAY_OPTION)
						JOptionPane.showMessageDialog(btnNewButton, "TOTAL BILL : "+bill);
				}
				else
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(173, 201, 116, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\neera\\Downloads\\mt1.jpg"));
		lblNewLabel_4.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
