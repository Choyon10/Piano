import java.awt.BorderLayout;
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
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Foctave extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 */
	private void playSound(String name) {
		try
		{
			File soundFile = new File(name+".wav");
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
					Foctave frame = new Foctave();
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
	public Foctave() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u00A0\\depositphotos_3002101-stock-illustration-music-notes-with-piano.jpg"));
		setTitle("PiAnO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1020, 720);
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
						playSound("major C");
					if(e.getKeyChar() == 's')
						playSound("major C#");
					
					if(e.getKeyChar() == 'x')
						playSound("major D");
					if(e.getKeyChar() == 'd')
						playSound("major D#");
					
					if(e.getKeyChar() == 'c')
						playSound("major E");
					if(e.getKeyChar() == 'v')
						playSound("major F");
					if(e.getKeyChar() == 'g')
						playSound("major F#");
					
					if(e.getKeyChar() == 'b')
						playSound("major G");
					if(e.getKeyChar() == 'h')
						playSound("major G#");
					
					if(e.getKeyChar() == 'n')
						playSound("major A");
					if(e.getKeyChar() == 'j')
						playSound("major A#");
					if(e.getKeyChar() == 'm')
						playSound("major B");
					
					
					//second octave
					if(e.getKeyChar() == 'r')
						playSound("major C middle");
					if(e.getKeyChar() == '5')
						playSound("major C# middle");
					
					if(e.getKeyChar() == 't')
						playSound("major D middle");
					if(e.getKeyChar() == '6')
						playSound("major D# middle");
					
					if(e.getKeyChar() == 'y')
						playSound("major E middle");
					if(e.getKeyChar() == 'u')
						playSound("major F middle");
					if(e.getKeyChar() == '8')
						playSound("major F# middle");
					
					if(e.getKeyChar() == 'i')
						playSound("major G middle");
					if(e.getKeyChar() == '9')
						playSound("major G# middle");
					
					if(e.getKeyChar() == 'o')
						playSound("major A middle");
					if(e.getKeyChar() == '0')
						playSound("major A# middle");
					if(e.getKeyChar() == 'p')
						playSound("major B middle");
					
					
					
					
				}
				
				return false;
			}
		});
		
		
		
		
		
		
		
		JButton button = new JButton("C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C");
			}
		});
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		button.setToolTipText("In keyboard Press c");
		button.setBackground(Color.WHITE);
		button.setBounds(10, 446, 61, 214);
		contentPane.add(button);
		
		JButton button_1 = new JButton("D");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D");
			}
		});
		button_1.setVerticalAlignment(SwingConstants.BOTTOM);
		button_1.setToolTipText("In keyboard Press d");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(81, 446, 61, 214);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("E");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major E");
			}
		});
		button_2.setVerticalAlignment(SwingConstants.BOTTOM);
		button_2.setToolTipText("In keyboard Press e");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(152, 446, 61, 214);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("F");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F");
			}
		});
		button_3.setVerticalAlignment(SwingConstants.BOTTOM);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(223, 446, 61, 214);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("G");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G");
			}
		});
		button_4.setVerticalAlignment(SwingConstants.BOTTOM);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(294, 446, 61, 214);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("A");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A");
			}
		});
		button_5.setVerticalAlignment(SwingConstants.BOTTOM);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(365, 446, 61, 214);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("B");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major B");
			}
		});
		button_6.setVerticalAlignment(SwingConstants.BOTTOM);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(436, 446, 61, 214);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("C1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C middle");
				}
		});
		button_7.setVerticalAlignment(SwingConstants.BOTTOM);
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(507, 446, 61, 214);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("D1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D middle");
			}
		});
		button_8.setVerticalAlignment(SwingConstants.BOTTOM);
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(578, 446, 61, 214);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("E1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major E middle");
			}
		});
		button_9.setVerticalAlignment(SwingConstants.BOTTOM);
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(649, 446, 61, 214);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("F1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F middle");
			}
		});
		button_10.setVerticalAlignment(SwingConstants.BOTTOM);
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(720, 446, 61, 214);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("G1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G middle");
			}
		});
		button_11.setVerticalAlignment(SwingConstants.BOTTOM);
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(790, 446, 61, 214);
		contentPane.add(button_11);
		
		JLabel label = new JLabel("x");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(81, 658, 61, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("c");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(152, 658, 61, 33);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("v");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(223, 658, 61, 33);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("b");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(294, 658, 61, 33);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("n");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(365, 658, 61, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("m");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(436, 658, 61, 33);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("r");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(507, 658, 61, 33);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("t");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_7.setBounds(578, 658, 61, 33);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("y");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_8.setBounds(649, 658, 61, 33);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("u");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(720, 658, 61, 33);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("i");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(791, 658, 61, 33);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("o");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_11.setBounds(861, 658, 61, 33);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("p");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(932, 658, 61, 33);
		contentPane.add(label_12);
		
		JButton button_12 = new JButton("B1");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major B middle");
			}
		});
		button_12.setVerticalAlignment(SwingConstants.BOTTOM);
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(932, 446, 61, 214);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("A1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A middle");
			}
		});
		button_13.setVerticalAlignment(SwingConstants.BOTTOM);
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(861, 446, 61, 214);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("A#1");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A# middle");
			}
		});
		button_14.setVerticalAlignment(SwingConstants.BOTTOM);
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_14.setBackground(Color.BLACK);
		button_14.setBounds(886, 330, 61, 121);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("G#1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G# middle");
			}
		});
		button_15.setVerticalAlignment(SwingConstants.BOTTOM);
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_15.setBackground(Color.BLACK);
		button_15.setBounds(828, 330, 61, 121);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("F#1");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F# middle");
			}
		});
		button_16.setVerticalAlignment(SwingConstants.BOTTOM);
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(769, 330, 61, 121);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("D#1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D# middle");
			}
		});
		button_17.setVerticalAlignment(SwingConstants.BOTTOM);
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_17.setBackground(Color.BLACK);
		button_17.setBounds(608, 330, 61, 121);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("C#1");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C# middle");
			}
		});
		button_18.setVerticalAlignment(SwingConstants.BOTTOM);
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_18.setBackground(Color.BLACK);
		button_18.setBounds(548, 330, 61, 121);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("A#");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A#");
			}
		});
		button_19.setVerticalAlignment(SwingConstants.BOTTOM);
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_19.setBackground(Color.BLACK);
		button_19.setBounds(379, 330, 61, 121);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("G#");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G#");
			}
		});
		button_20.setVerticalAlignment(SwingConstants.BOTTOM);
		button_20.setForeground(Color.WHITE);
		button_20.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_20.setBackground(Color.BLACK);
		button_20.setBounds(321, 330, 61, 121);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("F#");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F#");
			}
		});
		button_21.setVerticalAlignment(SwingConstants.BOTTOM);
		button_21.setForeground(Color.WHITE);
		button_21.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_21.setBackground(Color.BLACK);
		button_21.setBounds(262, 330, 61, 121);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("D#");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D#");
			}
		});
		button_22.setVerticalAlignment(SwingConstants.BOTTOM);
		button_22.setForeground(Color.WHITE);
		button_22.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_22.setBackground(Color.BLACK);
		button_22.setBounds(101, 330, 61, 121);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("C#");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C#");
			}
		});
		button_23.setVerticalAlignment(SwingConstants.BOTTOM);
		button_23.setForeground(Color.WHITE);
		button_23.setFont(new Font("Monospaced", Font.BOLD, 14));
		button_23.setBackground(Color.BLACK);
		button_23.setBounds(41, 330, 61, 121);
		contentPane.add(button_23);
		
		JLabel label_13 = new JLabel("s");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(41, 307, 61, 20);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("d");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(101, 307, 61, 20);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("g");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setBounds(262, 307, 61, 20);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("h");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(321, 307, 61, 20);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("j");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(379, 307, 61, 20);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("5");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(548, 307, 61, 20);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("6");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setBounds(608, 307, 61, 20);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("8");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setBounds(769, 307, 61, 20);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("9");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_21.setBounds(828, 307, 61, 20);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("0");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_22.setBounds(886, 307, 61, 20);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("z");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_23.setBounds(10, 658, 61, 33);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon((getClass().getClassLoader().getResource("PIANO1.jpg"))));
		label_24.setBounds(10, 33, 994, 263);
		contentPane.add(label_24);
		
		JButton button_24 = new JButton("Back");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Option frame = new Option();
				frame.setVisible(true);
			}
		});
		button_24.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		button_24.setBackground(new Color(0, 206, 209));
		button_24.setBounds(10, 0, 100, 33);
		contentPane.add(button_24);
	}
}
