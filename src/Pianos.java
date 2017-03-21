import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLayeredPane;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Panel;
import java.awt.Button;


public class Pianos {

	JFrame mainwin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pianos window = new Pianos();
					window.mainwin.setSize(Toolkit.getDefaultToolkit().getScreenSize());
					window.mainwin.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pianos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainwin = new JFrame();
		mainwin.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("pano2.jpg")));
		mainwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwin.setTitle("PiAnO");
		
		mainwin.getContentPane().setBackground(Color.WHITE);
		mainwin.getContentPane().setLayout(null);
		mainwin.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("pano2.jpg"))));
		mainwin.getContentPane().setLayout(null);
		 //JPanel pnlButton = new JPanel();
		 JButton btnAddFlight = new JButton("PLAY");
		 btnAddFlight.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Option t = new Option();
		 		t.setVisible(true);
		 		mainwin.setVisible(false);
		 		
		 	}
		 });
		 btnAddFlight.setBackground(Color.BLACK);
		 btnAddFlight.setFont(new Font("Arial", Font.BOLD, 50));
		 btnAddFlight.setForeground(Color.RED);
	     btnAddFlight.setBounds(520, 250, 300, 50);
	     //pnlButton.setBounds(800, 800, 200, 100);
	     //pnlButton.setLayout(null);
	     //pnlButton.add(btnAddFlight);
	     mainwin.getContentPane().add(btnAddFlight);
	}
}
