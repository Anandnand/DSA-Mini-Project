import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPan;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField deletepos;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 551);
		contentPan = new JPanel();
		contentPan.setForeground(new Color(0, 0, 0));
		contentPan.setBackground(new Color(245, 245, 245));
		contentPan.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPan);
		contentPan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setBounds(223, 35, 257, 24);
		contentPan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(109, 90, 205, 43);
		contentPan.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Constantia", Font.BOLD, 16));
		length.setBounds(359, 90, 205, 43);
		contentPan.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len=Integer.valueOf(length.getText());
			         arr=new int[len];	
			         String message="Array of length "+len+" is created ";
			         JOptionPane.showMessageDialog(contentPan, message);
			}
		});
		create.setForeground(new Color(153, 50, 204));
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setBounds(223, 149, 171, 43);
		contentPan.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(23, 224, 244, 43);
		contentPan.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 16));
		element.setBounds(275, 224, 119, 43);
		contentPan.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION:");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(413, 224, 91, 43);
		contentPan.add(lblNewLabel_3);
		
		position = new JTextField();
		position.setFont(new Font("Constantia", Font.BOLD, 16));
		position.setBounds(499, 224, 100, 43);
		contentPan.add(position);
		position.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(position.getText());
				if (pos >= 0 && pos < arr.length) {
		            arr[pos] = ele;
		            String message = "Element " + ele + " is inserted at pos " + pos;
		            JOptionPane.showMessageDialog(contentPan, message);
		            element.setText("");
		            position.setText("");
		        } else {
		            JOptionPane.showMessageDialog(contentPan, "Invalid position");
		        }
			}
		});
		insert.setForeground(new Color(153, 50, 204));
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(619, 224, 113, 43);
		contentPan.add(insert);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER THE POSITION:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_4.setBounds(85, 304, 182, 43);
		contentPan.add(lblNewLabel_4);
		
		deletepos = new JTextField();
		deletepos.setBounds(275, 302, 119, 43);
		contentPan.add(deletepos);
		deletepos.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos=Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message="element deleted position at "+pos;
				JOptionPane.showMessageDialog(contentPan, message);
				deletepos.setText("");
				
			}
		});
		delete.setForeground(new Color(153, 50, 204));
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(441, 304, 119, 43);
		contentPan.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++){
			msg=msg+" "+arr[i];
		}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(331, 379, 127, 43);
		contentPan.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(162, 444, 467, 51);
		contentPan.add(displaybox);
		displaybox.setColumns(10);
	}
}
