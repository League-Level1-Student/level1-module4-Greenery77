package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener{

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JButton translate = new JButton();
	
	JTextField eng = new JTextField(10);
	
	JTextField pgltn = new JTextField(10);
	
	public void createUI() {
		
		frame.setVisible(true);
		
		frame.setTitle("English to Pig Latin");
		
		panel.add(eng);
		
		panel.add(translate);
		
		translate.setLabel("Translate");
		
		translate.addActionListener(this);
		
		panel.add(pgltn);
		
		frame.add(panel);
		
		frame.pack();
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == translate) {
			
			PigLatinTranslator plt = new PigLatinTranslator();
			
			String one = eng.getText();
			
			String translated = plt.translate(one);
			
			pgltn.setText(translated);
			
		}
		
	}
	
	
	
}