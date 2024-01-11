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

public class DoublyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	private static Node head;
	private static Node tail;
	private static int size=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(168, 8, 415, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 94, 187, 42);
		contentPane.add(lblNewLabel_1);
		
		ele1 = new JTextField();
		ele1.setFont(new Font("Constantia", Font.BOLD, 16));
		ele1.setBounds(256, 94, 187, 42);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		JButton insertrear = new JButton("INSERT FIRST");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value=Integer.valueOf(ele1.getText());
				Node newNode = new Node(value);
				if (head == null) {
					head = tail = newNode;
				}else {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
				size++;
				JOptionPane.showMessageDialog(contentPane,value+" is inserted at First");
				ele1.setText("");
			}
			}
		});
		insertrear.setForeground(new Color(153, 50, 204));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrear.setBounds(532, 94, 163, 42);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(37, 177, 187, 42);
		contentPane.add(lblNewLabel_1_1);
		
		ele2 = new JTextField();
		ele2.setFont(new Font("Constantia", Font.BOLD, 16));
		ele2.setColumns(10);
		ele2.setBounds(256, 177, 187, 42);
		contentPane.add(ele2);
		
		JButton insertfront = new JButton("INSERT LAST");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value2=Integer.valueOf(ele2.getText());
				Node newNode = new Node(value2);
				if (head == null) {
					head = tail = newNode;
				}else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
				size++;
				JOptionPane.showMessageDialog(contentPane,value2+" is inserted at Last");
				ele2.setText("");
			}
			}
		});
		insertfront.setForeground(new Color(153, 50, 204));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfront.setBounds(505, 177, 202, 42);
		contentPane.add(insertfront);
		
		JButton deletefront = new JButton("DELETE LAST");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(size==0) {
					JOptionPane.showMessageDialog(contentPane,"Douby Linked List is empty");
					displaybox.setText("");
				}
				if (tail == null) {
		            // The list has only one element
		            int val = head.data;
		            head = tail = null;
		            size--;
		            JOptionPane.showMessageDialog(contentPane, val + " is deleted from Last");
		        } else {
		            // The list has more than one element
		            int val = tail.data;
		            tail = tail.prev;
		            if (tail != null) {
		                tail.next = null;
		            } else {
		                head = null; // The list becomes empty
		            }
		            size--;
		            JOptionPane.showMessageDialog(contentPane, val + " is deleted from Last");
		        }
			}
		});
		deletefront.setForeground(new Color(153, 50, 204));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(256, 330, 187, 42);
		contentPane.add(deletefront);
		
		JButton DF = new JButton("DISPLAY FORWARD");
		DF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp=head;
				if(temp==null) {
					JOptionPane.showMessageDialog(contentPane,"Single Linked list is empty");
					displaybox.setText("");
				}
				while(temp!=null) {
					msg=msg+" "+temp.data;
					 temp=temp.next;
				}
				displaybox.setText(msg);
			}
		});
		DF.setForeground(new Color(153, 50, 204));
		DF.setFont(new Font("Constantia", Font.BOLD, 16));
		DF.setBounds(94, 398, 212, 42);
		contentPane.add(DF);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(107, 456, 520, 52);
		contentPane.add(displaybox);
		
		JButton DB = new JButton("DISPLAY BACKWARD");
		DB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node prev=null;
				Node curr=head;
				Node next;
				
				while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				curr.prev=next;
				prev=curr;
				curr=next;

				}
				head=prev;
				Node temp=head;
				if(temp==null) {
					JOptionPane.showMessageDialog(contentPane,"Doubly Linked list is empty");
					displaybox.setText("");
				}
				while(temp!=null) {
					msg=msg+" "+temp.data;
					 temp=temp.next;
				}
				displaybox.setText(msg);
			}
		});
		DB.setForeground(new Color(153, 50, 204));
		DB.setFont(new Font("Constantia", Font.BOLD, 16));
		DB.setBounds(420, 398, 207, 42);
		contentPane.add(DB);
		
		JButton btnDeleteNext = new JButton("DELETE FIRST");
		btnDeleteNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(size==0) {
					JOptionPane.showMessageDialog(contentPane,"Doubly Linked List is empty");
					ele1.setText("");
				}
				if (head == null) {
					head = tail;
				}
				int val = head.data;
				head = head.next;
				head.prev = null;
				size--;
					JOptionPane.showMessageDialog(contentPane,val+" is deleted from first");			
				 }
		});
		btnDeleteNext.setForeground(new Color(153, 50, 204));
		btnDeleteNext.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDeleteNext.setBounds(256, 262, 163, 42);
		contentPane.add(btnDeleteNext);
	}
}
