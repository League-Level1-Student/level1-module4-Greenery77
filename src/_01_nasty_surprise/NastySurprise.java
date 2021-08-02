package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	
	JButton trick = new JButton();
	
	JButton treat = new JButton();
	
	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		
	new NastySurprise().createUI();
	
	}
	
	public void createUI(){
		
		frame.show();
		
		JPanel panel = new JPanel();
		
		trick.setLabel("Trick");
		
		trick.addActionListener(this);
		
		treat.setLabel("Treat");
		
		treat.addActionListener(this);
		
		panel.add(treat);
		
		panel.add(trick);
		
		frame.add(panel);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
		if (e.getSource() == trick) {
			
			showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=0.752xw:1.00xh;0.175xw,0&resize=640:*");
			
		}
		
		else if (e.getSource() == treat) {
			
			showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.redbubble.com%2Fi%2Fgreeting-card%2FBeanos-by-MemeGuy69%2F41774062.5MT14&psig=AOvVaw0uT3Vd8Yv7wBGt5JqK1jOz&ust=1628019030704000&source=images&cd=vfe&ved=0CAcQjRxqFwoTCJC6ldWJk_ICFQAAAAAdAAAAABAN");
			
		}
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
}
