package Game;

import javax.swing.*;

import Levels.Lvl_1;

import java.awt.*;
import java.util.Random;

public class main extends JPanel{
	public static int answer;
	public static boolean active;
	public static JFrame window1, window2, window3;
	
	public main() {
		//build window panel
		
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Lvl_1 window = new Lvl_1();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation(dim.width/2 - window.getSize().width/2, dim.height/2 - window.getSize().height/2);
		window.main(null);
	}
}
