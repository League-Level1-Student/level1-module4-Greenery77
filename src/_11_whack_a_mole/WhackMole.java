package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackMole implements ActionListener {

	JFrame frame;

	JPanel panel;

	int missed = 0;

	int hit = 0;
	
	Date date = new Date();

	public void createUI() {

		frame = new JFrame();

		panel = new JPanel();

		frame.setVisible(true);

		frame.setSize(300, 300);

		frame.add(panel);

		Random ran = new Random();

		int rand = ran.nextInt(24);

		drawButtons(rand);
		
		if (hit == 10) {
			
			endGame(date, 10);
			
		}
		
		if (missed == 5) {
			
			JOptionPane.showMessageDialog(null, "You lost :( Game over.");
			
			System.exit(0);
			
		}
		
	}

	public void drawButtons(int r) {

		for (int i = 0; i < 24; i++) {

			JButton button = new JButton();

			button.setLabel("          ");

			button.addActionListener(this);

			panel.add(button);

			if (r == i) {

				button.setLabel("Mole!");

			}

		}
	}

	public void actionPerformed(ActionEvent e) {

		JButton check = (JButton) e.getSource();

		if (!check.getText().equalsIgnoreCase("Mole!")) {

			System.out.println("Missed!");

			missed += 1;
		}

		else {

			hit += 1;

		}

		frame.dispose();

		createUI();
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}
