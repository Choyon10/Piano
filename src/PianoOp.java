import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class PianoOp {

	private JFrame frmPiano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PianoOp window = new PianoOp();
					window.frmPiano.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PianoOp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPiano = new JFrame();
		frmPiano.setResizable(false);
		frmPiano.setTitle("PiAnO");
		frmPiano.setBounds(100, 100, 1600, 730);
		frmPiano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPiano.getContentPane().setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("C:/Users/User/Desktop/cord/piano.jpg"));
		frmPiano.setContentPane(label);
		
		frmPiano.getContentPane().setLayout(null);
		
		JButton button = new JButton("C");
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		button.setBackground(Color.WHITE);
		button.setBounds(93, 463, 49, 214);
		frmPiano.getContentPane().add(button);
		
		JButton button_1 = new JButton("D");
		button_1.setVerticalAlignment(SwingConstants.BOTTOM);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(144, 463, 49, 214);
		frmPiano.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("E");
		button_2.setVerticalAlignment(SwingConstants.BOTTOM);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(194, 463, 49, 214);
		frmPiano.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("F");
		button_3.setVerticalAlignment(SwingConstants.BOTTOM);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(245, 463, 49, 214);
		frmPiano.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("G");
		button_4.setVerticalAlignment(SwingConstants.BOTTOM);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(295, 463, 49, 214);
		frmPiano.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("A");
		button_5.setVerticalAlignment(SwingConstants.BOTTOM);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(344, 463, 49, 214);
		frmPiano.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("B");
		button_6.setVerticalAlignment(SwingConstants.BOTTOM);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(395, 463, 49, 214);
		frmPiano.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("C1");
		button_7.setVerticalAlignment(SwingConstants.BOTTOM);
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(444, 463, 49, 214);
		frmPiano.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("D1");
		button_8.setVerticalAlignment(SwingConstants.BOTTOM);
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(494, 463, 49, 214);
		frmPiano.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("E1");
		button_9.setVerticalAlignment(SwingConstants.BOTTOM);
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(545, 463, 49, 214);
		frmPiano.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("F1");
		button_10.setVerticalAlignment(SwingConstants.BOTTOM);
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(597, 463, 49, 214);
		frmPiano.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("G1");
		button_11.setVerticalAlignment(SwingConstants.BOTTOM);
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(649, 463, 49, 214);
		frmPiano.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("F1");
		button_12.setVerticalAlignment(SwingConstants.BOTTOM);
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(700, 463, 49, 214);
		frmPiano.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("A1");
		button_13.setVerticalAlignment(SwingConstants.BOTTOM);
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(751, 463, 49, 214);
		frmPiano.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("A#");
		button_14.setVerticalAlignment(SwingConstants.BOTTOM);
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_14.setBackground(Color.BLACK);
		button_14.setBounds(719, 365, 40, 121);
		frmPiano.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("G#");
		button_15.setVerticalAlignment(SwingConstants.BOTTOM);
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_15.setBackground(Color.BLACK);
		button_15.setBounds(675, 365, 40, 121);
		frmPiano.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("F#");
		button_16.setVerticalAlignment(SwingConstants.BOTTOM);
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(629, 365, 40, 121);
		frmPiano.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("D#1");
		button_17.setVerticalAlignment(SwingConstants.BOTTOM);
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_17.setBackground(Color.BLACK);
		button_17.setBounds(522, 365, 40, 121);
		frmPiano.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("C#1");
		button_18.setVerticalAlignment(SwingConstants.BOTTOM);
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_18.setBackground(Color.BLACK);
		button_18.setBounds(476, 365, 40, 121);
		frmPiano.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("A#");
		button_19.setVerticalAlignment(SwingConstants.BOTTOM);
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_19.setBackground(Color.BLACK);
		button_19.setBounds(368, 365, 40, 121);
		frmPiano.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("G#");
		button_20.setVerticalAlignment(SwingConstants.BOTTOM);
		button_20.setForeground(Color.WHITE);
		button_20.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_20.setBackground(Color.BLACK);
		button_20.setBounds(324, 365, 40, 121);
		frmPiano.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("F#");
		button_21.setVerticalAlignment(SwingConstants.BOTTOM);
		button_21.setForeground(Color.WHITE);
		button_21.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(278, 365, 40, 121);
		frmPiano.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("D#");
		button_22.setVerticalAlignment(SwingConstants.BOTTOM);
		button_22.setForeground(Color.WHITE);
		button_22.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_22.setBackground(Color.BLACK);
		button_22.setBounds(170, 365, 40, 121);
		frmPiano.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("C#");
		button_23.setVerticalAlignment(SwingConstants.TOP);
		button_23.setForeground(Color.WHITE);
		button_23.setFont(new Font("Times New Roman", Font.BOLD, 8));
		button_23.setBackground(Color.BLACK);
		button_23.setBounds(124, 365, 40, 121);
		frmPiano.getContentPane().add(button_23);
		
	}

}
