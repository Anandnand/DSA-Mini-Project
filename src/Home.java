import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 496);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 50, 204));
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setBounds(274, 26, 365, 30);
		contentPane.add(lblNewLabel);
		
		JButton arrays = new JButton("ARRAYS");
		arrays.setForeground(new Color(153, 50, 204));
		arrays.setFont(new Font("Constantia", Font.BOLD, 20));
		arrays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENEING CODE HERE
				new Array().setVisible(true);
			}
		});
		arrays.setBounds(339, 89, 184, 33);
		contentPane.add(arrays);
		
		JButton linkedlist = new JButton("SINGLY LINKED LIST");
		linkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE LINKED LIST WINDOW OPENEING CODE HERE
				new SinglyLinkedList().setVisible(true);;


			}
		});
		linkedlist.setForeground(new Color(153, 50, 204));
		linkedlist.setFont(new Font("Constantia", Font.BOLD, 20));
		linkedlist.setBounds(69, 157, 258, 33);
		contentPane.add(linkedlist);
		
		JButton doublylinkedlist = new JButton("DOUBLY LINKED LIST");
		doublylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKED LIST WINDOW OPENEING CODE HERE
				new DoublyLinkedList().setVisible(true);;

			}
		});
		doublylinkedlist.setFont(new Font("Constantia", Font.BOLD, 20));
		doublylinkedlist.setForeground(new Color(153, 50, 204));
		doublylinkedlist.setBounds(69, 263, 293, 33);
		contentPane.add(doublylinkedlist);
		
		JButton circularlinkedlist = new JButton("CIRCULAR LINKED LIST");
		circularlinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR LINKED LIST WINDOW OPENEING CODE HERE
				new CircularLinkedList().setVisible(true);;

			}
		});
		circularlinkedlist.setForeground(new Color(153, 50, 204));
		circularlinkedlist.setFont(new Font("Constantia", Font.BOLD, 20));
		circularlinkedlist.setBounds(69, 370, 293, 33);
		contentPane.add(circularlinkedlist);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENEING CODE HERE
				new Stack().setVisible(true);

			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 20));
		stack.setForeground(new Color(153, 50, 204));
		stack.setBounds(621, 157, 120, 33);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENEING CODE HERE
				new Queue().setVisible(true);

			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 20));
		queue.setForeground(new Color(153, 50, 204));
		queue.setBounds(621, 263, 126, 33);
		contentPane.add(queue);
		
		JButton circularqueue = new JButton("CIRCULAR QUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENEING CODE HERE
				new CircularQueue().setVisible(true);;


			}
		});
		circularqueue.setForeground(new Color(153, 50, 204));
		circularqueue.setFont(new Font("Constantia", Font.BOLD, 20));
		circularqueue.setBounds(549, 373, 230, 33);
		contentPane.add(circularqueue);
	}
}
