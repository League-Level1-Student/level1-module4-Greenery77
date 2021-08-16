package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel();
		
		char currentLetter;

		
		void setup(){
			
			currentLetter = generateRandomLetter();
			
			frame.setVisible(true);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			label.setText(currentLetter + "");
			
			label.setFont(label.getFont().deriveFont(28.0f));
			
			label.setHorizontalAlignment(JLabel.CENTER);
			
			frame.addKeyListener(this);
			
			panel.add(label);
			
			frame.add(panel);
			
			frame.pack();
			
		}


		@Override
		public void keyPressed(KeyEvent arg0) {
			
		System.out.println(arg0.getKeyChar());
			
		}


		@Override
		public void keyReleased(KeyEvent arg0) {
			
			currentLetter = generateRandomLetter();
			
			label.setText(currentLetter + "");
			
		}


		@Override
		public void keyTyped(KeyEvent arg0) {
			
			if(arg0.getKeyChar()==currentLetter) {
				
				panel.setBackground(Color.GREEN);
				
			}
			
			else {
				
				panel.setBackground(Color.RED);
				
			}
			
		}

		char generateRandomLetter() {
			
		    Random r = new Random();
		    
		    return (char) (r.nextInt(26) + 'a');
		    
		}
		
		
}
