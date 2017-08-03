package Levels;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lvl_1 extends Game.main{
	public int answer;
	public JButton red;
	public JButton blue;
	private static boolean correct = false; 

	public Lvl_1(){
		Random rand = new Random();
		answer = rand.nextInt(2) + 1;

		//button box layout
		setLayout(new GridLayout(1, 2));

		//button setup
		red = new JButton();
		red.setBackground(Color.RED);
		red.addActionListener(new redClicked());
		blue = new JButton();
		blue.setBackground(Color.BLUE);
		blue.addActionListener(new blueClicked());

		add(red);
		add(blue);
	}

	private class redClicked implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(answer == 1){
				//correct answer
				correctGuess();
			}else{
				//incorrect answer
				incorrectGuess();
			}
		}
	}
	private class blueClicked implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(answer == 2){
				//correct answer
				correctGuess();
			}else{
				//incorrect answer
				incorrectGuess();
			}		
		}
	}
	public void correctGuess(){
		JOptionPane.showMessageDialog(null, "Correct! Moving on to Lvl. 2");
		correct = true;
		initializeNextLevel();
	}
	public void incorrectGuess(){
		JOptionPane.showMessageDialog(null, "Incorrect! Try again...");
		//System.exit(0); //exit the window on incorrect guess
	}
	public static void initializeNextLevel(){
		if(correct){
			Lvl_2 window2 = new Lvl_2();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			window2.setLocation(dim.width/2 - window2.getSize().width/2, dim.height/2 - window2.getSize().height/2);
			window2.main(null);
		}
	}
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Color Guessing Game: Lv. 1");
		window.setPreferredSize(new Dimension(600, 500));
		window.getContentPane().add(new Lvl_1());
		window.pack();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation(dim.width/2 - window.getSize().width/2, dim.height/2 - window.getSize().height/2);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
