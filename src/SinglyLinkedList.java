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

public class SinglyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private class Node{	
		 int data;
		Node next=null;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	private static Node head;
	private static Node tail;
	private static int size;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(171, 23, 403, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 98, 196, 40);
		contentPane.add(lblNewLabel_1);
		
		ele1 = new JTextField();
		ele1.setFont(new Font("Constantia", Font.BOLD, 16));
		ele1.setBounds(241, 98, 167, 40);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(37, 180, 196, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JButton insertrear = new JButton("INSERT FIRST");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value=Integer.valueOf(ele1.getText());
				Node newNode=new Node(value);
				if(head==null) {
					head=tail=newNode;
					return;
				}
				size++;
				newNode.next=head;
				head=newNode;
				JOptionPane.showMessageDialog(contentPane,value+" is inserted at First");
				ele1.setText("");
			}
		});
		insertrear.setForeground(new Color(153, 50, 204));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrear.setBounds(498, 96, 154, 40);
		contentPane.add(insertrear);
		
		ele2 = new JTextField();
		ele2.setFont(new Font("Constantia", Font.BOLD, 16));
		ele2.setColumns(10);
		ele2.setBounds(242, 180, 167, 40);
		contentPane.add(ele2);
		
		JButton insertfront = new JButton("INSERT LAST");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value2=Integer.valueOf(ele2.getText());
				Node newNode=new Node(value2);
				size++;
				if(head==null) {
					head=tail=newNode;
					return;
				}
				tail.next=newNode;
				newNode.next=null;
				tail=newNode;
				JOptionPane.showMessageDialog(contentPane,value2+" is inserted at Last");
				ele2.setText("");
			}
		});
		insertfront.setForeground(new Color(153, 50, 204));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfront.setBounds(498, 180, 182, 40);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE FIRST");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(size==0) {
					JOptionPane.showMessageDialog(contentPane,"Single Linked List is empty");
					displaybox.setText("");
				 } else if (size==1) {
					 int val=head.data;
					 head=tail=null;
				 }else {
				int val=head.data;
				head=head.next;
				size--;
				JOptionPane.showMessageDialog(contentPane,val+" is deleted from first");
			}
			}
		});
		deleterear.setForeground(new Color(153, 50, 204));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(293, 253, 154, 40);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE LAST");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(size==0) {
					JOptionPane.showMessageDialog(contentPane,"Single Linked List is empty");
					displaybox.setText("");
				}else {
				 Node prev=head;
				 int val=tail.data;
				 for(int i=0;i<size-1;i++){
					 prev=prev.next;
					 
				 }
				 prev.next=null;
				 tail=prev;
				 size--;
				JOptionPane.showMessageDialog(contentPane,val+" is deleted from Last");
			}
			}
		});
		deletefront.setForeground(new Color(153, 50, 204));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(293, 318, 182, 40);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
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
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(293, 387, 154, 40);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(94, 448, 531, 58);
		contentPane.add(displaybox);
	}

}
