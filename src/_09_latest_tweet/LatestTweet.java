package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener{

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JButton search = new JButton();
	
	JTextField field = new JTextField(12);
	
	public void createUI() {
		
		frame.setVisible(true);

		frame.setTitle("Tweet Retriever");
		
		panel.add(field);
		
		panel.add(search);
		
		search.addActionListener(this);
		
		search.setLabel("Search Twitter");
		
		frame.add(panel);
		
		frame.pack();
		
	}

	
	public void actionPerformed(ActionEvent e) {
				
	}

//	private String getLatestTweet(String searchingFor) {
//
//	    Twitter twitter = new TwitterFactory().getInstance();
//
//	    AccessToken accessToken = new AccessToken(
//	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
//	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
//	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
//	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
//	    twitter.setOAuthAccessToken(accessToken);
//
//	Query query = new Query(searchingFor);
//	    try {
//	        QueryResult result = twitter.search(query);
//	        return result.getTweets().get(0).getText();
//	    } catch (Exception e) {
//	        System.err.print(e.getMessage());
//	        return "What the heck is that?";
//	    }
//	}

}
