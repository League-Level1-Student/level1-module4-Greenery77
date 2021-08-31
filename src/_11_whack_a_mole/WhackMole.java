package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackMole {

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	public void createUI() {
		
		frame.setVisible(true);
		
		frame.setSize(300, 400);
		
		frame.add(panel);
	
		Random ran = new Random();
		
		int rand = ran.nextInt(25);
		
		drawButtons(rand);
			
		
		
	}
	
	public void drawButtons(int r) {
		
		for (int i = 0; i < 25; i++) {
		
		JButton button = new JButton();
		
		panel.add(button);
		
		if (r == i) {
			
			button.setLabel("Mole!");
			
		}
		
		}
	}
	
}
