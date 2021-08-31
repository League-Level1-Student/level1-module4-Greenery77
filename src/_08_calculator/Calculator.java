package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	
	static JFrame frame = new JFrame();
	
	static JButton add = new JButton();
	
	static JButton sub = new JButton();
	
	static JButton mul = new JButton();
	
	static JButton div = new JButton();
	
	static JPanel panel = new JPanel();
	
	static JTextField field1 = new JTextField(5);
	
	static JTextField field2 = new JTextField(5);
	
	public void createUI(){
		
		frame.show();
		
		add.setLabel("+");
		
		add.addActionListener(this);
		
		sub.setLabel("-");

		sub.addActionListener(this);
		
		mul.setLabel("x");
	
		mul.addActionListener(this);
		
		div.setLabel("/");
		
		div.addActionListener(this);
		
		panel.add(field1);

		panel.add(field2);
		
		panel.add(div);

		panel.add(mul);

		panel.add(sub);

		panel.add(add);
		
		frame.add(panel);
		
		frame.pack();
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String fieldone = field1.getText();
		
		int one = Integer.parseInt(fieldone);
		
		String fieldtwo = field2.getText();
		
		int two = Integer.parseInt(fieldtwo);
		
		if (e.getSource() == add) {
			
			JOptionPane.showMessageDialog(null, one + two);
			
		}
		
		if (e.getSource() == sub) {
			
			JOptionPane.showMessageDialog(null, one - two);
			
		}
		
		if (e.getSource() == div) {
			
			JOptionPane.showMessageDialog(null, one / two);
			
		}
		
		if (e.getSource() == mul) {
			
			JOptionPane.showMessageDialog(null, one * two);
			
		}

	}
	
}
