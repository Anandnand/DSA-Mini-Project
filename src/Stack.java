import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(229, 20, 294, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(104, 99, 216, 42);
		contentPane.add(lblNewLabel_1);
		
		ele1 = new JTextField();
		ele1.setFont(new Font("Constantia", Font.BOLD, 16));
		ele1.setBounds(375, 98, 159, 42);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(ele1.getText());
				s=new int[size];
				String message="stack size of "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(153, 50, 204));
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setBounds(264, 164, 193, 42);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(104, 237, 216, 42);
		contentPane.add(lblNewLabel_1_1);
		
		ele2 = new JTextField();
		ele2.setFont(new Font("Constantia", Font.BOLD, 16));
		ele2.setColumns(10);
		ele2.setBounds(346, 237, 159, 42);
		contentPane.add(ele2);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(top==size-1) {
					String message="stack is full";
					JOptionPane.showMessageDialog(contentPane, message);
				}else {
					elem=Integer.valueOf(ele2.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Element is pushed to stack");
                     ele2.setText("");
				}
			}
		});
		push.setForeground(new Color(153, 50, 204));
		push.setFont(new Font("Constantia", Font.BOLD, 16));
		push.setBounds(595, 237, 122, 42);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "stack is empty");
				}else {
					JOptionPane.showMessageDialog(contentPane, "the element "+s[top]+" is poped from stack");
					--top;
				}
			}
		});
		pop.setForeground(new Color(153, 50, 204));
		pop.setFont(new Font("Constantia", Font.BOLD, 16));
		pop.setBounds(298, 308, 122, 42);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "stack is empty");
				}else {
					for(int i=top;i>=0;i--) {
					msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(264, 379, 193, 42);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(128, 467, 500, 42);
		contentPane.add(displaybox);
	}

}
