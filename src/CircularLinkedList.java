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

public class CircularLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;

	private class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;

		}
	}

	private ListNode last = null;
	private int length = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularLinkedList frame = new CircularLinkedList();
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
	public CircularLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CIRCULAR LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(163, 26, 424, 24);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(55, 111, 195, 37);
		contentPane.add(lblNewLabel_1);

		ele1 = new JTextField();
		ele1.setFont(new Font("Constantia", Font.BOLD, 16));
		ele1.setForeground(new Color(0, 0, 0));
		ele1.setBounds(258, 111, 159, 37);
		contentPane.add(ele1);
		ele1.setColumns(10);

		JButton insertfirst = new JButton("INSERT FIRST");
		insertfirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value=Integer.valueOf(ele1.getText());
				 ListNode newNode = new ListNode(value);
				    if(last==null) {
				      last=newNode;
				    }else {
				      newNode.next=last.next;
				    }
				    last.next=newNode;
				    length++;
				    JOptionPane.showMessageDialog(contentPane, value+" is inserted to circular linked list");
				    ele1.setText("");

			}
		});
		insertfirst.setForeground(new Color(153, 50, 204));
		insertfirst.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfirst.setBounds(490, 103, 159, 44);
		contentPane.add(insertfirst);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(55, 200, 195, 37);
		contentPane.add(lblNewLabel_1_1);

		ele2 = new JTextField();
		ele2.setForeground(Color.BLACK);
		ele2.setFont(new Font("Constantia", Font.BOLD, 16));
		ele2.setColumns(10);
		ele2.setBounds(258, 200, 159, 37);
		contentPane.add(ele2);

		JButton insertlast = new JButton("INSERT LAST");
		insertlast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value2=Integer.valueOf(ele2.getText());
				 ListNode newNode=new ListNode(value2);
				    if(last==null) {
				      last=newNode;
				      last.next=newNode;
				    }else {
				      newNode.next = last.next;
				      last.next = newNode;
				      last = newNode;
				    }
				    length++;
				    JOptionPane.showMessageDialog(contentPane, value2+" is inserted to circular linked list");
				    ele2.setText("");

			}
		});
		insertlast.setForeground(new Color(153, 50, 204));
		insertlast.setFont(new Font("Constantia", Font.BOLD, 16));
		insertlast.setBounds(490, 200, 159, 37);
		contentPane.add(insertlast);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(length==0) {
					    JOptionPane.showMessageDialog(contentPane,"Circular linked list is empty");
					    displaybox.setText("");
				    }
				    ListNode temp=last.next;
				    if(last.next==last) {
				      last=null;
				    }else {
				      last.next=temp.next;
				    }
				    temp.next=null;
				    length--;
				    JOptionPane.showMessageDialog(contentPane,temp.data+" is deleted from circular linked list");

			}
		});
		delete.setForeground(new Color(153, 50, 204));
		delete.setFont(new Font("Constantia", Font.BOLD, 16));
		delete.setBounds(258, 281, 159, 44);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				if (last == null) {
				    displaybox.setText("Circular linked list is empty");
				    return;
				}

				ListNode temp = last.next;
				do {
				    msg = msg + " " + temp.data;
				    temp = temp.next;
				} while (temp != last);

				msg = msg + " " + temp.data; // Add the last element to the message

				displaybox.setText(msg.trim());
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(258, 359, 159, 44);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setForeground(Color.BLACK);
		displaybox.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(95, 452, 533, 50);
		contentPane.add(displaybox);
	}

}
