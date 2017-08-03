package Levels;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lvl_3 extends Game.main{
	public int answer;
	public JButton red, blue, green, yellow;
	
	public Lvl_3(){
		Random rand = new Random();
		answer = rand.nextInt(4) + 1;
		
		//button box layout
		setLayout(new GridLayout(2, 2));
		
		//button setup
		red = new JButton();
		red.setBackground(Color.RED);
		red.addActionListener(new redClicked());
		blue = new JButton();
		blue.setBackground(Color.BLUE);
		blue.addActionListener(new blueClicked());
		green = new JButton();
		green.setBackground(Color.GREEN);
		green.addActionListener(new greenClicked());
		yellow = new JButton();
		yellow.setBackground(Color.YELLOW);
		yellow.addActionListener(new yellowClicked());
		
		add(red);
		add(blue);
		add(green);
		add(yellow);
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
	private class greenClicked implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(answer == 3){
				//correct answer
				correctGuess();
			}else{
				//incorrect answer
				incorrectGuess();
			}		
		}
	}
	private class yellowClicked implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(answer == 4){
				//correct answer
				correctGuess();
			}else{
				//incorrect answer
				incorrectGuess();
			}		
		}
	}
	public void correctGuess(){
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	public void incorrectGuess(){
		JOptionPane.showMessageDialog(null, "Incorrect! Try again...");
	}
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Color Guessing Game: Lv. 3");
		window.setPreferredSize(new Dimension(600, 500));
		window.getContentPane().add(new Lvl_3());
		window.pack();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation(dim.width/2 - window.getSize().width/2, dim.height/2 - window.getSize().height/2);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
