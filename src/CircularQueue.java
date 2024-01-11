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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private static	int size;
	private static 	int arr[];
	private static 	int front=-1;
	private static 	int rear=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(188, 21, 367, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(129, 90, 172, 43);
		contentPane.add(lblNewLabel_1);
		
		ele1 = new JTextField();
		ele1.setBounds(349, 89, 143, 43);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		JButton create = new JButton("CREATE QUERY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(ele1.getText());
			    arr=new int[size];
			    String message="Circular Queue size of "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setForeground(new Color(153, 50, 204));
		create.setFont(new Font("Constantia", Font.BOLD, 16));
		create.setBounds(231, 153, 183, 48);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(129, 225, 172, 48);
		contentPane.add(lblNewLabel_1_1);
		
		ele2 = new JTextField();
		ele2.setColumns(10);
		ele2.setBounds(349, 225, 143, 47);
		contentPane.add(ele2);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele=Integer.valueOf(ele2.getText());
				if((rear+1)%size==front) {
					JOptionPane.showMessageDialog(contentPane, "CircularQueue is full");
				}else {
				if(front==-1) {
					front=0;
				}
				rear=(rear+1)%size;
				arr[rear]=ele;
				JOptionPane.showMessageDialog(contentPane,ele+" is inserted to Circularqueue");
				ele2.setText("");
			}
			}
		});
		insert.setForeground(new Color(153, 50, 204));
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(532, 225, 183, 48);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rear==-1 && front==-1) {
					JOptionPane.showMessageDialog(contentPane, "Circularqueue is empty");
			}else {
				int val=arr[front];
				if(front==rear) {
					rear=front=-1;
				}else {
					front=(front+1)%size;	
				}
				JOptionPane.showMessageDialog(contentPane, "the "+val+" is deleted from Circularqueue");
			}
			}
		});
		delete.setForeground(new Color(153, 50, 204));
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(231, 307, 183, 48);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(rear==-1 && front==-1) {
					JOptionPane.showMessageDialog(contentPane, "Circularqueue is empty");
					displaybox.setText("");
					}else {
				 for(int i=rear;i>=front;i--) {
	            	  msg=msg+" "+arr[i];
	              }
					displaybox.setText(msg);
					}
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(231, 379, 183, 48);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(110, 452, 479, 43);
		contentPane.add(displaybox);
	}

}
