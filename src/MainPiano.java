import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Robot;

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
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

import sun.audio.*;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;

public class MainPiano extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPiano frame = new MainPiano();
					frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void playSound(String name) {
		try
		{
			//File soundFile = new File("C:/Users/User/Desktop/cord/lower middle/" + name+".wav");
		    AudioInputStream sound = AudioSystem.getAudioInputStream(this.getClass().getResource(name+".wav"));

		    // load the sound into memory (a Clip)
		    DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
		    Clip clip = (Clip) AudioSystem.getLine(info);
		    clip.open(sound);
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

	/**
	 * Create the frame.
	 * @throws AWTException 
	 */
	public MainPiano() throws AWTException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u00A0\\depositphotos_3002101-stock-illustration-music-notes-with-piano.jpg"));
		setTitle("PiAnO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 760);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.BLACK);
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
						playSound("major C middle");
					if(e.getKeyChar() == 's')
						playSound("major C# middle");
					
					if(e.getKeyChar() == 'x')
						playSound("major D middle");
					if(e.getKeyChar() == 'd')
						playSound("major D# middle");
					
					if(e.getKeyChar() == 'c')
						playSound("major E middle");
					if(e.getKeyChar() == 'v')
						playSound("major F middle");
					if(e.getKeyChar() == 'g')
						playSound("major F# middle");
					
					if(e.getKeyChar() == 'b')
						playSound("major G middle");
					if(e.getKeyChar() == 'h')
						playSound("major G# middle");
					
					if(e.getKeyChar() == 'n')
						playSound("major A middle");
					if(e.getKeyChar() == 'j')
						playSound("major A# middle");
					if(e.getKeyChar() == 'm')
						playSound("major B middle");
					
					
					//second octave
					if(e.getKeyChar() == 'r')
						playSound("major C");
					if(e.getKeyChar() == '5')
						playSound("major C#");
					
					if(e.getKeyChar() == 't')
						playSound("major D");
					if(e.getKeyChar() == '6')
						playSound("major D#");
					
					if(e.getKeyChar() == 'y')
						playSound("major E");
					if(e.getKeyChar() == 'u')
						playSound("major F");
					if(e.getKeyChar() == '8')
						playSound("major F#");
					
					if(e.getKeyChar() == 'i')
						playSound("major G");
					if(e.getKeyChar() == '9')
						playSound("major G#");
					
					if(e.getKeyChar() == 'o')
						playSound("major A");
					if(e.getKeyChar() == '0')
						playSound("major A#");
					if(e.getKeyChar() == 'p')
						playSound("major B");
					
					
					//third octave
					if(e.getKeyChar() == '`')
						playSound("Cm lower");
					if(e.getKeyChar() == 'q')
						playSound("C#m lower");
					
					if(e.getKeyChar() == '1')
						playSound("Dm lower");
					if(e.getKeyChar() == 'w')
						playSound("D#m lower");
					
					if(e.getKeyChar() == '2')
						playSound("Em lower");
					if(e.getKeyChar() == '3')
						playSound("Fm lower");
					if(e.getKeyChar() == 'e')
						playSound("F#m lower");
					
					if(e.getKeyChar() == '4')
						playSound("Gm lower");
					
				}
				
				return false;
			}
		});
		
		
		
		JLabel lblNewLabel = new JLabel("PIANO");
		lblNewLabel.setBounds(464, 11, 504, 115);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 99));
		contentPane.add(lblNewLabel);
		JButton C = new JButton("C");
		
		C.setToolTipText("In keyboard Press c");
		C.setBounds(10, 476, 61, 214);
		C.setVerticalAlignment(SwingConstants.BOTTOM);
		C.setBackground(Color.WHITE);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				/*try
				{
					File soundFile = new File("C:/Users/User/Desktop/cord/minor higher/Cm higher.wav");
				    AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);

				    // load the sound into memory (a Clip)
				    DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
				    Clip clip = (Clip) AudioSystem.getLine(info);
				    clip.open(sound);
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
				}*/
				playSound("major C middle");
			
			}
		});
		contentPane.add(C);
		contentPane.setComponentZOrder(C, 1);
		JButton D = new JButton("D");
		D.setToolTipText("In keyboard Press d");
		D.setBounds(81, 476, 61, 214);
		D.setVerticalAlignment(SwingConstants.BOTTOM);
		D.setBackground(Color.WHITE);
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D middle");
			}
		});
		contentPane.add(D);
		contentPane.setComponentZOrder(D, 2);
		
		
		JButton btnE = new JButton("E");
		btnE.setToolTipText("In keyboard Press e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major E middle");
			}
		});
		btnE.setBounds(152, 476, 61, 214);
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setBackground(Color.WHITE);
		contentPane.add(btnE);
		
		
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F middle");
			}
		});
		btnF.setBounds(223, 476, 61, 214);
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setBackground(Color.WHITE);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G middle");
			}
		});
		btnG.setBounds(294, 476, 61, 214);
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setBackground(Color.WHITE);
		contentPane.add(btnG);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A middle");
			}
		});
		btnA.setBounds(365, 476, 61, 214);
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setBackground(Color.WHITE);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major B middle");
			}
		});
		btnB.setBounds(436, 476, 61, 214);
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setBackground(Color.WHITE);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C1");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C");
			}
		});
		btnC.setBounds(507, 476, 61, 214);
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setBackground(Color.WHITE);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D1");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D");
			}
		});
		btnD.setBounds(578, 476, 61, 214);
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setBackground(Color.WHITE);
		contentPane.add(btnD);
		
		JButton btnE_1 = new JButton("E1");
		btnE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major E");
			}
		});
		btnE_1.setBounds(649, 476, 61, 214);
		btnE_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE_1.setBackground(Color.WHITE);
		contentPane.add(btnE_1);
		
		JButton btnF_1 = new JButton("F1");
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F");
			}
		});
		btnF_1.setBounds(720, 476, 61, 214);
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setBackground(Color.WHITE);
		contentPane.add(btnF_1);
		
		JButton btnG_1 = new JButton("G1");
		btnG_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G");
			}
		});
		btnG_1.setBounds(790, 476, 61, 214);
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setBackground(Color.WHITE);
		contentPane.add(btnG_1);
		
		JButton btnF_2 = new JButton("C2");
		btnF_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Cm higher");
			}
		});
		btnF_2.setBounds(1003, 476, 61, 214);
		btnF_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_2.setBackground(Color.WHITE);
		contentPane.add(btnF_2);
		
		JButton btnA_1 = new JButton("A1");
		btnA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A");
			}
		});
		btnA_1.setBounds(861, 476, 61, 214);
		btnA_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA_1.setBackground(Color.WHITE);
		contentPane.add(btnA_1);
		
		JButton btnB_1 = new JButton("B1");
		btnB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major B");
			}
		});
		btnB_1.setBounds(932, 476, 61, 214);
		btnB_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB_1.setBackground(Color.WHITE);
		contentPane.add(btnB_1);
		
		JButton btnNewButton = new JButton("C#");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C# middle");
			}
		});
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(41, 360, 61, 121);
		contentPane.add(btnNewButton);
		
		JButton btnD_2 = new JButton("D#");
		btnD_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D# middle");
			}
		});
		btnD_2.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnD_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_2.setBackground(Color.BLACK);
		btnD_2.setForeground(Color.WHITE);
		btnD_2.setBounds(101, 360, 61, 121);
		contentPane.add(btnD_2);
		
		JButton btnG_2 = new JButton("G#");
		btnG_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G# middle");
			}
		});
		btnG_2.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnG_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_2.setBackground(Color.BLACK);
		btnG_2.setForeground(Color.WHITE);
		btnG_2.setBounds(321, 360, 61, 121);
		contentPane.add(btnG_2);
		
		JButton btnC_2 = new JButton("F#");
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F# middle");
			}
		});
		btnC_2.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnC_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_2.setBackground(Color.BLACK);
		btnC_2.setForeground(Color.WHITE);
		btnC_2.setBounds(262, 360, 61, 121);
		contentPane.add(btnC_2);
		
		JButton btnA_2 = new JButton("A#");
		btnA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A# middle");
			}
		});
		btnA_2.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnA_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA_2.setBackground(Color.BLACK);
		btnA_2.setForeground(Color.WHITE);
		btnA_2.setBounds(379, 360, 61, 121);
		contentPane.add(btnA_2);
		
		JButton btnD_1 = new JButton("D2");
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Dm higher");
			}
		});
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setBackground(Color.WHITE);
		btnD_1.setBounds(1074, 476, 61, 214);
		contentPane.add(btnD_1);
		
		JButton btnE_2 = new JButton("E2");
		btnE_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Em higher");
			}
		});
		btnE_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE_2.setBackground(Color.WHITE);
		btnE_2.setBounds(1145, 476, 61, 214);
		contentPane.add(btnE_2);
		
		JButton btnF_4 = new JButton("F2");
		btnF_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Fm higher");
			}
		});
		btnF_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_4.setBackground(Color.WHITE);
		btnF_4.setBounds(1214, 476, 61, 214);
		contentPane.add(btnF_4);
		
		JButton btnG_4 = new JButton("G2");
		btnG_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Gm higher");
			}
		});
		btnG_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_4.setBackground(Color.WHITE);
		btnG_4.setBounds(1285, 476, 61, 214);
		contentPane.add(btnG_4);
		
		JButton btnC_1 = new JButton("C#1");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major C#");
			}
		});
		btnC_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_1.setForeground(Color.WHITE);
		btnC_1.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnC_1.setBackground(Color.BLACK);
		btnC_1.setBounds(548, 360, 61, 121);
		contentPane.add(btnC_1);
		
		JButton btnD_3 = new JButton("D#1");
		btnD_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major D#");
			}
		});
		btnD_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_3.setForeground(Color.WHITE);
		btnD_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnD_3.setBackground(Color.BLACK);
		btnD_3.setBounds(608, 360, 61, 121);
		contentPane.add(btnD_3);
		
		JButton btnF_3 = new JButton("F#1");
		btnF_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major F#");
			}
		});
		btnF_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_3.setForeground(Color.WHITE);
		btnF_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnF_3.setBackground(Color.BLACK);
		btnF_3.setBounds(769, 360, 61, 121);
		contentPane.add(btnF_3);
		
		JButton btnG_3 = new JButton("G#1");
		btnG_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major G#");
			}
		});
		btnG_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_3.setForeground(Color.WHITE);
		btnG_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnG_3.setBackground(Color.BLACK);
		btnG_3.setBounds(828, 360, 61, 121);
		contentPane.add(btnG_3);
		
		JButton btnA_3 = new JButton("A#1");
		btnA_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("major A#");
			}
		});
		btnA_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA_3.setForeground(Color.WHITE);
		btnA_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnA_3.setBackground(Color.BLACK);
		btnA_3.setBounds(886, 360, 61, 121);
		contentPane.add(btnA_3);
		
		JButton btnC_3 = new JButton("C#2");
		btnC_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C#m higher");
			}
		});
		btnC_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_3.setForeground(Color.WHITE);
		btnC_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnC_3.setBackground(Color.BLACK);
		btnC_3.setBounds(1036, 360, 61, 121);
		contentPane.add(btnC_3);
		
		JButton btnD_4 = new JButton("D#2");
		btnD_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("D#m higher");
			}
		});
		btnD_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_4.setForeground(Color.WHITE);
		btnD_4.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnD_4.setBackground(Color.BLACK);
		btnD_4.setBounds(1096, 360, 61, 121);
		contentPane.add(btnD_4);
		
		JButton btnF_5 = new JButton("F#2");
		btnF_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C#m higher");
			}
		});
		btnF_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_5.setForeground(Color.WHITE);
		btnF_5.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnF_5.setBackground(Color.BLACK);
		btnF_5.setBounds(1251, 362, 61, 121);
		contentPane.add(btnF_5);
		
		JButton button_9 = new JButton("A#");
		button_9.setVerticalAlignment(SwingConstants.BOTTOM);
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Monospaced", Font.BOLD, 17));
		button_9.setBackground(Color.BLACK);
		button_9.setBounds(1381, 131, 61, 121);
		contentPane.add(button_9);
		
		JLabel lblNewLabel_1 = new JLabel("z");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 688, 61, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblD = new JLabel("x");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblD.setBounds(81, 688, 61, 33);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("c");
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblE.setBounds(152, 688, 61, 33);
		contentPane.add(lblE);
		
		JLabel lblF = new JLabel("v");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblF.setBounds(223, 688, 61, 33);
		contentPane.add(lblF);
		
		JLabel lblG = new JLabel("b");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblG.setBounds(294, 688, 61, 33);
		contentPane.add(lblG);
		
		JLabel lblA = new JLabel("n");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblA.setBounds(365, 688, 61, 33);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("m");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblB.setBounds(436, 688, 61, 33);
		contentPane.add(lblB);
		
		JLabel lblH = new JLabel("r");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblH.setBounds(507, 688, 61, 33);
		contentPane.add(lblH);
		
		JLabel lblJ = new JLabel("t");
		lblJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblJ.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJ.setBounds(578, 688, 61, 33);
		contentPane.add(lblJ);
		
		JLabel lblK = new JLabel("y");
		lblK.setHorizontalAlignment(SwingConstants.CENTER);
		lblK.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblK.setBounds(649, 688, 61, 33);
		contentPane.add(lblK);
		
		JLabel lblL = new JLabel("u");
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblL.setBounds(720, 688, 61, 33);
		contentPane.add(lblL);
		
		JLabel lblN = new JLabel("i");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblN.setBounds(791, 688, 61, 33);
		contentPane.add(lblN);
		
		JLabel lblM = new JLabel("o");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblM.setBounds(861, 688, 61, 33);
		contentPane.add(lblM);
		
		JLabel lblP = new JLabel("p");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblP.setBounds(932, 688, 61, 33);
		contentPane.add(lblP);
		
		JLabel label_13 = new JLabel("1");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_13.setBounds(1003, 688, 61, 33);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("2");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_14.setBounds(1074, 688, 61, 33);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("3");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_15.setBounds(1145, 688, 61, 33);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("4");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_16.setBounds(1216, 688, 61, 33);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("5");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_17.setBounds(1285, 688, 61, 33);
		contentPane.add(label_17);
		
		JLabel lblC = new JLabel("s");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblC.setBounds(41, 337, 61, 20);
		contentPane.add(lblC);
		
		JLabel lblD_1 = new JLabel("d");
		lblD_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblD_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblD_1.setBounds(101, 337, 61, 20);
		contentPane.add(lblD_1);
		
		JLabel lblF_1 = new JLabel("g");
		lblF_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblF_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblF_1.setBounds(262, 337, 61, 20);
		contentPane.add(lblF_1);
		
		JLabel lblG_1 = new JLabel("h");
		lblG_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblG_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblG_1.setBounds(321, 337, 61, 20);
		contentPane.add(lblG_1);
		
		JLabel lblA_1 = new JLabel("j");
		lblA_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblA_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblA_1.setBounds(379, 337, 61, 20);
		contentPane.add(lblA_1);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(886, 337, 61, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("9");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(828, 337, 61, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("8");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(769, 337, 61, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("6");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(608, 337, 61, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(548, 337, 61, 20);
		contentPane.add(label_4);
		
		JLabel lblF_2 = new JLabel("q");
		lblF_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblF_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblF_2.setBounds(1036, 337, 61, 20);
		contentPane.add(lblF_2);
		
		JLabel lblF_3 = new JLabel("w");
		lblF_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblF_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblF_3.setBounds(1096, 337, 61, 20);
		contentPane.add(lblF_3);
		
		JLabel lblE_1 = new JLabel("e");
		lblE_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblE_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblE_1.setBounds(1251, 342, 61, 20);
		contentPane.add(lblE_1);
		
	}
}
