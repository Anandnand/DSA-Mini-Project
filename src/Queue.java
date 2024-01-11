import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private static int q[];
	private static int size;
	private static int rear=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(218, 20, 274, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(121, 98, 179, 45);
		contentPane.add(lblNewLabel_1);
		
		ele1 = new JTextField();
		ele1.setFont(new Font("Constantia", Font.BOLD, 16));
		ele1.setBounds(308, 101, 155, 38);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.setForeground(new Color(153, 50, 204));
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(ele1.getText());
				q=new int[size];
				String message="Queue size of "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setBounds(218, 163, 179, 44);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(121, 230, 179, 45);
		contentPane.add(lblNewLabel_2);
		
		ele2 = new JTextField();
		ele2.setFont(new Font("Constantia", Font.BOLD, 16));
		ele2.setColumns(10);
		ele2.setBounds(308, 232, 155, 41);
		contentPane.add(ele2);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(ele2.getText());
				if(rear==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Queue is full");
				}else {
			     rear=rear+1;
				q[rear]=ele;
				JOptionPane.showMessageDialog(contentPane,ele+" is inserted to queue");
				ele2.setText("");
				}
			}
		});
		insert.setForeground(new Color(153, 50, 204));
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(502, 230, 155, 44);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rear==-1) {
					JOptionPane.showMessageDialog(contentPane, "queue is empty");
					}else {
				int front=q[0];
	              for(int i=0;i<rear;i++) {
	            	  q[i]=q[i+1];
	              }
	              rear=rear-1;
				JOptionPane.showMessageDialog(contentPane, "the "+front+" is deleted from queue");

			}
				}
		});
		delete.setForeground(new Color(153, 50, 204));
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(308, 307, 155, 44);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(rear==-1) {
					JOptionPane.showMessageDialog(contentPane, "queue is empty");
					displaybox.setText("");
					}else {
				 for(int i=rear;i>=0;i--) {
	            	  msg=msg+" "+q[i];
	              }
					displaybox.setText(msg);
					}
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(308, 378, 155, 44);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(139, 452, 485, 58);
		contentPane.add(displaybox);
	}
}
