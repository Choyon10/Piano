import java.awt.EventQueue;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Toctave extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private void playSound(String name) {
		try
		{
			
			AudioInputStream sound = AudioSystem.getAudioInputStream(this.getClass().getResource(name+".wav"));

		    // load the sound into memory (a Clip)
		    DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
		    Clip clip = (Clip) AudioSystem.getLine(info);
		    clip.open(sound);
		    if(clip.isRunning()){
		    	clip.stop();
		    }
		    else
		    	clip.start();
		    
		    
		}
		catch(IOException e1)
		{
			JOptionPane.showInputDialog(null,e1);
		}
		catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toctave frame = new Toctave();
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
	public Toctave() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u00A0\\depositphotos_3002101-stock-illustration-music-notes-with-piano.jpg"));
		setTitle("PiAnO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
			
			@Override
			public boolean dispatchKeyEvent(KeyEvent e) {
				
				//JOptionPane.showMessageDialog(null, e.getID()+"", e.getID()+"", JOptionPane.INFORMATION_MESSAGE);
				if(e.getID() == KeyEvent.KEY_PRESSED)
				{
					//first octave
					if(e.getKeyChar() == 'z')
						playSound("Cm higher");
					if(e.getKeyChar() == 's')
						playSound("C#m higher");
					
					if(e.getKeyChar() == 'x')
						playSound("Dm higher");
					if(e.getKeyChar() == 'd')
						playSound("D#m higher");
					
					if(e.getKeyChar() == 'c')
						playSound("Em higher");
					if(e.getKeyChar() == 'v')
						playSound("Fm higher");
					if(e.getKeyChar() == 'g')
						playSound("F#m higher");
					
					if(e.getKeyChar() == 'b')
						playSound("Gm higher");
					if(e.getKeyChar() == 'h')
						playSound("G#m higher");
					
					if(e.getKeyChar() == 'n')
						playSound("Am higher");
					if(e.getKeyChar() == 'j')
						playSound("A#m higher");
					if(e.getKeyChar() == 'm')
						playSound("Bm higher");
					
					
					//second octave
					if(e.getKeyChar() == 'r')
						playSound("Cm highest");
					if(e.getKeyChar() == '5')
						playSound("C#m highest");
					
					if(e.getKeyChar() == 't')
						playSound("Dm highest");
					if(e.getKeyChar() == '6')
						playSound("D#m highest");
					
					if(e.getKeyChar() == 'y')
						playSound("Em highest");
					if(e.getKeyChar() == 'u')
						playSound("Fm highest");
					if(e.getKeyChar() == '8')
						playSound("F#m highest");
					
					if(e.getKeyChar() == 'i')
						playSound("Gm highest");
					if(e.getKeyChar() == '9')
						playSound("G#m highest");
					
					if(e.getKeyChar() == 'o')
						playSound("Am highest");
					if(e.getKeyChar() == '0')
						playSound("A#m highest");
					if(e.getKeyChar() == 'p')
						playSound("Bm highest");
					
					
					
					
				}
				
				return false;
			}
		});
		
		
		
		
		
		JButton button = new JButton("C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Cm higher");
			}
		});
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		button.setToolTipText("In keyboard Press c");
		button.setBackground(Color.WHITE);
		button.setBounds(0, 446, 61, 214);
		contentPane.add(button);
		
		JButton button_1 = new JButton("D");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Dm higher");
			}
		});
		button_1.setVerticalAlignment(SwingConstants.BOTTOM);
		button_1.setToolTipText("In keyboard Press d");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(71, 446, 61, 214);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("E");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Em higher");
			}
		});
		button_2.setVerticalAlignment(SwingConstants.BOTTOM);
		button_2.setToolTipText("In keyboard Press e");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(142, 446, 61, 214);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("F");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Fm higher");
			}
		});
		button_3.setVerticalAlignment(SwingConstants.BOTTOM);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(213, 446, 61, 214);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("G");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Gm higher");
			}
		});
		button_4.setVerticalAlignment(SwingConstants.BOTTOM);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(284, 446, 61, 214);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("A");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Am higher");
			}
		});
		button_5.setVerticalAlignment(SwingConstants.BOTTOM);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(355, 446, 61, 214);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("B");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Bm higher");
			}
		});
		button_6.setVerticalAlignment(SwingConstants.BOTTOM);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(426, 446, 61, 214);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("C1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Cm highest");
			}
		});
		button_7.setVerticalAlignment(SwingConstants.BOTTOM);
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(497, 446, 61, 214);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("D1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Dm highest");
			}
		});
		button_8.setVerticalAlignment(SwingConstants.BOTTOM);
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(568, 446, 61, 214);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("E1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Em highest");
			}
		});
		button_9.setVerticalAlignment(SwingConstants.BOTTOM);
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(639, 446, 61, 214);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("F1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Fm highest");
			}
		});
		button_10.setVerticalAlignment(SwingConstants.BOTTOM);
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(710, 446, 61, 214);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("G1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Gm highest");
			}
		});
		button_11.setVerticalAlignment(SwingConstants.BOTTOM);
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(780, 446, 61, 214);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("A1");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Am highest");
			}
		});
		button_12.setVerticalAlignment(SwingConstants.BOTTOM);
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(851, 446, 61, 214);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("B1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Bm highest");
			}
		});
		button_13.setVerticalAlignment(SwingConstants.BOTTOM);
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(922, 446, 61, 214);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("A#1");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("A#m highest");
			}
		});
		button_14.setVerticalAlignment(SwingConstants.BOTTOM);
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_14.setBackground(Color.BLACK);
		button_14.setBounds(876, 330, 61, 121);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("G#1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("G#m highest");
			}
		});
		button_15.setVerticalAlignment(SwingConstants.BOTTOM);
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_15.setBackground(Color.BLACK);
		button_15.setBounds(818, 330, 61, 121);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("F#1");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("F#m highest");
			}
		});
		button_16.setVerticalAlignment(SwingConstants.BOTTOM);
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(759, 330, 61, 121);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("D#1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("D#m highest");
			}
		});
		button_17.setVerticalAlignment(SwingConstants.BOTTOM);
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_17.setBackground(Color.BLACK);
		button_17.setBounds(598, 330, 61, 121);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("C#1");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C#m highest");
			}
		});
		button_18.setVerticalAlignment(SwingConstants.BOTTOM);
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_18.setBackground(Color.BLACK);
		button_18.setBounds(538, 330, 61, 121);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("A#");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("A#m higher");
			}
		});
		button_19.setVerticalAlignment(SwingConstants.BOTTOM);
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_19.setBackground(Color.BLACK);
		button_19.setBounds(369, 330, 61, 121);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("G#");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("G#m higher");
			}
		});
		button_20.setVerticalAlignment(SwingConstants.BOTTOM);
		button_20.setForeground(Color.WHITE);
		button_20.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_20.setBackground(Color.BLACK);
		button_20.setBounds(311, 330, 61, 121);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("F#");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("F#m higher");
			}
		});
		button_21.setVerticalAlignment(SwingConstants.BOTTOM);
		button_21.setForeground(Color.WHITE);
		button_21.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(252, 330, 61, 121);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("D#");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("D#m higher");
			}
		});
		button_22.setVerticalAlignment(SwingConstants.BOTTOM);
		button_22.setForeground(Color.WHITE);
		button_22.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_22.setBackground(Color.BLACK);
		button_22.setBounds(91, 330, 61, 121);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("C#");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C#m higher");
			}
		});
		button_23.setVerticalAlignment(SwingConstants.BOTTOM);
		button_23.setForeground(Color.WHITE);
		button_23.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_23.setBackground(Color.BLACK);
		button_23.setBounds(31, 330, 61, 121);
		contentPane.add(button_23);
		
		JLabel label = new JLabel("s");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(31, 307, 61, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("d");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(91, 307, 61, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("g");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(252, 307, 61, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("h");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(311, 307, 61, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("j");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(369, 307, 61, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(538, 307, 61, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("6");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(598, 307, 61, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(759, 307, 61, 20);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("9");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(818, 307, 61, 20);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("0");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(876, 307, 61, 20);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("z");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(0, 658, 61, 33);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("x");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_11.setBounds(71, 658, 61, 33);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("c");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(142, 658, 61, 33);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("v");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_13.setBounds(213, 658, 61, 33);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("b");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBounds(284, 658, 61, 33);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("n");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setBounds(355, 658, 61, 33);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("m");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_16.setBounds(426, 658, 61, 33);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("r");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_17.setBounds(497, 658, 61, 33);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("t");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_18.setBounds(568, 658, 61, 33);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("y");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_19.setBounds(639, 658, 61, 33);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("u");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_20.setBounds(710, 658, 61, 33);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("i");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_21.setBounds(781, 658, 61, 33);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("o");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_22.setBounds(851, 658, 61, 33);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("p");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_23.setBounds(922, 658, 61, 33);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon((getClass().getClassLoader().getResource("PIANO1.jpg"))));
		label_24.setBounds(10, 33, 994, 263);
		contentPane.add(label_24);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Option frame = new Option();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton.setBounds(10, -1, 100, 33);
		contentPane.add(btnNewButton);
	}
}