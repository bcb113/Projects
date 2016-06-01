import javax.swing.*;
import java.awt.*;

public class TicTacToe {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TTTpanel panel = new TTTpanel(); 
		frame.getContentPane().add(panel);
		frame.pack(); 
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2 - frame.getSize().width/2, dim.height/2 - frame.getSize().height/2);
		frame.setVisible(true);
	}
	public static void retry(){
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TTTpanel panel = new TTTpanel(); 
		frame.getContentPane().add(panel);
		frame.pack(); 
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2 - frame.getSize().width/2, dim.height/2 - frame.getSize().height/2);
		frame.setVisible(true);
	}
}
