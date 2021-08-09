package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	



	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up

		frame.setVisible(true);
		
		// 2. Give your frame a title

		frame.setTitle("Jeopardy");
		
		// 3. Create a JPanel variable to hold the header using the createHeader method

		JPanel header = createHeader("Jeopardy");
		
		// 4. Add the header component to the quizPanel

		quizPanel.add(header);
		
		// 5. Add the quizPanel to the frame

		frame.add(quizPanel);
		
		// 6. Use the createButton method to set the value of firstButton

		firstButton = createButton("$200");
		
		// 7. Add the firstButton to the quizPanel

		quizPanel.add(firstButton);
		
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method

		secondButton = createButton("$400");
		
		// 10. Add the secondButton to the quizPanel

		quizPanel.add(secondButton);
		
		
		// 11. Add action listeners to the buttons (2 lines of code)

		firstButton.addActionListener(this);
		
		secondButton.addActionListener(this);
		
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		
		thirdButton = createButton("$600");
		
		fourthButton = createButton("$800");
		
		fifthButton = createButton("$1000");
		
		thirdButton.addActionListener(this);

		fourthButton.addActionListener(this);

		fifthButton.addActionListener(this);
		
		quizPanel.add(thirdButton);
		
		quizPanel.add(fourthButton);
		
		quizPanel.add(fifthButton);
	
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		
		JButton button = new JButton();

		// Set the text of the button to the dollarAmount

		button.setText(dollarAmount);
		
		// Increment the buttonCount (this should make the layout vertical)

		buttonCount += 1;
		
		// Return your new button instead of the temporary button

		return button;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:

		JButton buttonPressed = (JButton) e.getSource();
		
		// If the buttonPressed was the firstButton

		if (buttonPressed == (firstButton)){
			
		askQuestion("In PEMDAS, the E stands for evaluate. True or false?", "False", 200);
		
		firstButton.setText("");
		
		}
		
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton
		
		else if (buttonPressed == (secondButton)) {

			askQuestion("", "", 400);

			secondButton.setText("");

		}

		else if (buttonPressed == (thirdButton)) {

			askQuestion("", "", 600);

			thirdButton.setText("");

		}

		else if (buttonPressed == (fourthButton)) {

			askQuestion("", "", 800);

			fourthButton.setText("");

		}

		else if (buttonPressed == (fifthButton)) {

			askQuestion("", "", 1000);

			fifthButton.setText("");

		}

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the user thinks of an answer
		
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		
		//

		String answer = JOptionPane.showInputDialog(null, "In PEMDAS, the E stands for evaluate. True or false?");

		if (answer.equalsIgnoreCase("false")) {

			score += prizeMoney;

			JOptionPane.showMessageDialog(null, "Correct.");

		}

		else {

			score -= prizeMoney;

			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was, false.");

		}

		updateScore();

		//
		
		String answer2 = JOptionPane.showInputDialog(null, "What are / and * used for in equations?");

		if (answer2.equalsIgnoreCase("division and multiplication")) {

			score += prizeMoney;

			JOptionPane.showMessageDialog(null, "Correct.");

		}

		else {

			score -= prizeMoney;

			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was, division and multiplication.");

		}

		updateScore();
		
		//
		
		String answer3 = JOptionPane.showInputDialog(null, "I cant think of any more math questions right now");

		if (answer3.equalsIgnoreCase("oh ok")) {

			score += prizeMoney;

			JOptionPane.showMessageDialog(null, "Correct.");

		}

		else {

			score -= prizeMoney;

			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was, oh ok.");

		}

		updateScore();
		
		//
		
		String answer4 = JOptionPane.showInputDialog(null, "When you wish upon a star...");

		if (answer4.equalsIgnoreCase("makes no difference who you are")) {

			score += prizeMoney;

			JOptionPane.showMessageDialog(null, "Correct.");

		}

		else {

			score -= prizeMoney;

			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer was, makes no difference who you are. The 'math' topic is irrelevant now.");

		}

		updateScore();
		
		//

		String answer5 = JOptionPane.showInputDialog(null, "The end.");

		if (answer5.equalsIgnoreCase("Thanks")) {

			score += prizeMoney;

			JOptionPane.showMessageDialog(null, "Correct.");

		}

		else {

			score -= prizeMoney;

			JOptionPane.showMessageDialog(null, "Incorrect. Thanks was the correct answer. Hope you like your score..");

		}

		updateScore();
		
		
	}

	public static synchronized void playJeopardyTheme()
	    {
		String fileName = "jeopardy.wav";
	        // Note: use .wav files            
	        new Thread(new Runnable() {
	            public void run() {
	                try {
	                    Clip clip = AudioSystem.getClip();
	                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
	                    clip.open(inputStream);
	                    clip.start();
	                } catch (Exception e) {
	                    System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
	                }
	            }
	        }).start();
	    }

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
