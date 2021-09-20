package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	
	JButton spin = new JButton();
	
	JLabel one = new JLabel();
	
	JLabel two = new JLabel();
	
	JLabel three = new JLabel();
	
	Random ran = new Random(2);

	JPanel panel = new JPanel();
	
	JFrame frame = new JFrame();
	
	public void createUI() {
		
		frame.setVisible(true);
		
		spin.setLabel("SPIN");
		
		spin.addActionListener(this);
		
		panel.add(spin);
		
		frame.add(panel);
		
		frame.pack();
		

	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == spin) {
			
			one = createRandom(ran.nextInt(3));
				
			two = createRandom(ran.nextInt(3));
		
			three = createRandom(ran.nextInt(3));
			
		}
		
		panel.add(one);
		
		panel.add(two);
		
		panel.add(three);
		
		one.setSize(500, 500);
		
		two.setSize(500, 500);
		
		three.setSize(500, 500);
		
		frame.pack();
		
		frame.dispose();
		
		createUI();
		
	}
    
	public JLabel createRandom(int randomNumber) {

		if (randomNumber == 0) {

			try {
				return createLabelImage("cherry.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else if (randomNumber == 1) {

			try {
				return createLabelImage("orange.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else {

			try {
				return createLabelImage("banana.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

}
