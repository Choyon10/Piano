import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Option extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option frame = new Option();
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
	public Option() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u00A0\\depositphotos_3002101-stock-illustration-music-notes-with-piano.jpg"));
		setTitle("PiAnO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020,720);
		getContentPane().setLayout(null);
		setContentPane(new JLabel(new ImageIcon((getClass().getClassLoader().getResource("PIANO2.jpg")))));
		
		JButton btn = new JButton("LOW");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Foctave in = new Foctave();
				in.setVisible(true);
				//frmSportsRules.setVisible(false);
				
			}
		});
		btn.setFont(new Font("Arial", Font.BOLD, 50));
		btn.setForeground(Color.cyan);
		btn.setBounds(350, 165, 300, 50);
		btn.setOpaque(false);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);


		getContentPane().add(btn);

		
		JButton btn1 = new JButton("MIDDLE");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Soctave ou = new Soctave();
				ou.setVisible(true);
				//frmSportsRules.setVisible(false);
				
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 50));
		btn1.setForeground(Color.green);
		btn1.setBounds(350, 350, 300, 50);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);


		getContentPane().add(btn1);

		
		JButton btn2 = new JButton("MINOR");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Toctave oi = new Toctave();
				oi.setVisible(true);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 50));
		btn2.setForeground(Color.black);
		btn2.setBounds(350, 535, 300, 50);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		
		getContentPane().add(btn2);
		
	}
}
