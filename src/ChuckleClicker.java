package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{

	public static void main(String[] args) {
		
		new ChuckleClicker().makeButtons();
		
	}
	
	JButton joke = new JButton();
	
	JButton punch = new JButton();
	
	public void makeButtons(){
		
		JFrame frame = new JFrame();
		
		frame.show();
		
		JPanel panel = new JPanel();
		
		joke.setText("Joke");
		
		panel.add(joke);
		
		punch.setText("Punchline");
		
		panel.add(punch);
		
		frame.add(panel);
		
		frame.pack();
		
		joke.addActionListener(this);
		
		punch.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == joke) {
		
		JOptionPane.showMessageDialog(null, "someone said theres an owl among us");
		
		}
		
		if(e.getSource() == punch) {
			
			JOptionPane.showMessageDialog(null, "who");
			
			}
		
	}
	
}
